package Utils;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.ArrayList;

public class Utility {
    /**
     * Get CSV data
     * @param filePath
     * @return
     */
    public static ArrayList readCSV(String filePath) {
        String line;
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /**
     * Get JSON data
     * @param filePath
     * @return
     */
    public static JSONObject readJSON(String filePath) {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;
        try (InputStream is = Utility.class.getResource(filePath).openStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            try {
                jsonObject = (JSONObject) jsonParser.parse(reader);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
