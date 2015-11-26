import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

public class JsonCreator {

	public void parse(List<DataObj> objectToParse){
		Gson gson = new Gson();
		String json = gson.toJson(objectToParse);
		
		try {
			FileWriter writerJsonFile = new FileWriter("./src/main/java/output.json");
			writerJsonFile.write(json);
			writerJsonFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
