import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.eclipse.emf.ecore.resource.Resource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import mhw_api_dsl.mHW_API_DSL.Armor;
import mhw_api_dsl.mHW_API_DSL.MHW_API_DSLFactory;
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
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			ArmorImpl armor = new ArmorImpl();
			armor.setId((int) jsonObject.get("id"));
			System.out.println(armor.getId());
		}
		
	}
}
