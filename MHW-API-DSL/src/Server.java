import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

import org.eclipse.emf.ecore.resource.Resource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import mhw_api_dsl.mHW_API_DSL.Armor;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLFactory;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLPackage;
import mhw_api_dsl.mHW_API_DSL.impl.*;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String result = getResultFromRequest("https://mhw-db.com/armor");
		generateXMIFile(result);
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
		MHW_API_DSLPackageImpl.init();
		
		MHW_API_DSLFactory factory = MHW_API_DSLFactory.eINSTANCE;
		
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
			armor.eSet(MHW_API_DSLPackage.ARMOR__SLOT, slotsList);
			
			//Skills
			JSONArray skillsArray = new JSONArray(jsonObject.get("skills").toString());
			ArrayList<SkillImpl> skillsList = new ArrayList<SkillImpl>();
			for(int j = 0; j < skillsArray.length(); j++) {
				JSONObject skillObject = skillsArray.getJSONObject(j);
				SkillImpl skill = new SkillImpl();
				skill.setId(skillObject.getInt("id"));
				skill.setLevel(skillObject.getInt("level"));
				skill.setDescription(skillObject.get("description").toString());
				skill.setSkill(skillObject.getInt("skill"));
				skill.setSkillName(skillObject.get("skillName").toString());
				skillsList.add(skill);
			}
			armor.eSet(MHW_API_DSLPackage.ARMOR__SKILL, skillsList);
			
			//Defense
			JSONObject defenseObject = new JSONObject(jsonObject.get("defense").toString());
			DefenceImpl defense = new DefenceImpl();
			defense.setBase(defenseObject.getInt("base"));
			defense.setAugmented(defenseObject.getInt("augmented"));
			defense.setMax(defenseObject.getInt("max"));
			armor.setDefence(defense);
			
			//Resistance
			
		}
		System.out.println("Fin");
	}
}
