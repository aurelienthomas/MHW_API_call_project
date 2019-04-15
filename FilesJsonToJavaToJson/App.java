package mhw_api_json;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;

public class App {

	// JSON to Java object to JSON
	public static void main(String[] args) throws MalformedURLException, IOException {

		// GET API OBJECT
		System.setProperty("http.agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:66.0) Gecko/20100101Firefox/66.0");
		String url = "https://mhw-db.com/ailments";
		String genreJson = IOUtils.toString(new URL(url));
		JSONArray json = new JSONArray(genreJson); // JsonString to Array

		// Parcourt de l'array pour tester
		for (Object jobject : json) {
			System.out.println(jobject);
		}

		// Array to String
		String msg = json.toString();
		;
		try {
			writeInFile(msg, "test.json"); // écriture de l'array dans un fichier JSON
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Fonction d'écriture dans un fichier
	public static void writeInFile(String msg, String fichierOutput) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fichierOutput));
		writer.write(msg);
		writer.close();
	}

}
