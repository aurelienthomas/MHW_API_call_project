package m1ice.pdc.mhw.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONObject;

import com.blade.Blade;

import m1ice.pdc.mhw.MHWPackage;
import m1ice.pdc.mhw.impl.ArmorImpl;
import m1ice.pdc.mhw.impl.MHWPackageImpl;
import m1ice.pdc.mhw.impl.SkillImpl;
import m1ice.pdc.mhw.impl.SlotImpl;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String result = getResultFromRequest("https://mhw-db.com/armor");
		generateXMIFile(result);
		  Blade.of().get("/", ctx -> ctx.text("Hello Blade")).start();
	}
	
	public static String getResultFromRequest(String request) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(request);
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		connection.addRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		connection.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line;
		while((line = rd.readLine()) != null) {
			result.append(line);
		}
		rd.close();
		return result.toString();
	}

	public static void generateXMIFile(String chaine) throws Exception {
		MHWPackageImpl.init();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("mhw", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resource = resSet.createResource(URI.createURI("MyMHW.mhw"));
		
		JSONArray jsonArray = new JSONArray(chaine);
		for(int i = 0; i < jsonArray.length(); i++) {
			//Armor
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			ArmorImpl armor = new ArmorImpl();
			armor.setId(jsonObject.getInt("id"));
			armor.setName(jsonObject.get("name").toString());
			armor.setType(jsonObject.get("type").toString());
			armor.setRank(jsonObject.get("rank").toString());
			armor.setRarity(jsonObject.getInt("rarity"));
			
			//Assets
			JSONObject assetsObject = new JSONObject(jsonObject.get("assets").toString());
			armor.setImageFemale(assetsObject.get("imageFemale").toString());
			armor.setImageMale(assetsObject.get("imageMale").toString());
			
			//Slots
			JSONArray slotsArray = new JSONArray(jsonObject.get("slots").toString());
			ArrayList<SlotImpl> slotsList = new ArrayList<SlotImpl>();
			for(int j = 0; j < slotsArray.length(); j++) {
				JSONObject slotObject = slotsArray.getJSONObject(j);
				SlotImpl slot = new SlotImpl();
				slot.setRank(slotObject.getInt("rank"));
				slotsList.add(slot);
			}
			armor.eSet(MHWPackage.ARMOR__SLOT, slotsList);
			
			//Skills
			JSONArray skillsArray = new JSONArray(jsonObject.get("skills").toString());
			ArrayList<SkillImpl> skillsList = new ArrayList<SkillImpl>();
			for(int k = 0; k < skillsArray.length(); k++) {
				JSONObject skillObject = skillsArray.getJSONObject(k);
				SkillImpl skill = new SkillImpl();
				skill.setId(skillObject.getInt("id"));
				skill.setLevel(skillObject.getInt("level"));
				skill.setDescription(skillObject.get("description").toString());
				skill.setSkill(skillObject.getInt("skill"));
				skill.setSkillName(skillObject.get("skillName").toString());
				skillsList.add(skill);
			}
			armor.eSet(MHWPackage.ARMOR__SKILL, skillsList);
			
			//Defense
//			JSONObject defenseObject = new JSONObject(jsonObject.get("defense").toString());
//			DefenceImpl defense = new DefenceImpl();
//			defense.setBase(defenseObject.getInt("base"));
//			defense.setAugmented(defenseObject.getInt("augmented"));
//			defense.setMax(defenseObject.getInt("max"));
//			armor.setDefence(defense);
			
			//Resistance
//			JSONObject resistanceObject = new JSONObject(jsonObject.get("resistances").toString());
//			ResistanceImpl resistance = new ResistanceImpl();
//			resistance.setFire(resistanceObject.getInt("fire"));
//			resistance.setIce(resistanceObject.getInt("ice"));
//			resistance.setDragon(resistanceObject.getInt("dragon"));
//			resistance.setThunder(resistanceObject.getInt("thunder"));
//			resistance.setWater(resistanceObject.getInt("water"));
//			armor.setResistance(resistance);
			
			//Sérialization dans le fichier XMI
			resource.getContents().add(armor);
			
			
		}
		resource.save(Collections.EMPTY_MAP);
		System.out.println("Fin");
	}
}
