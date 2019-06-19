import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;

public class requete1 implements Request {
	
	@Override
	public JSONArray doRequestAndFilter() {
		// TODO Auto-generated method stub
		try {
			return new JSONArray(getResultFromRequest("https://mhw-db.com/armor"));
		}catch(Exception e) {
			return new JSONArray("");
		}
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
}
