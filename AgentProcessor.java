package finalproject;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.statefarm.codingcomp.agent.*;
import com.statefarm.codingcomp.utilities.*;
import com.statefarm.codingcomp.bean.*;
import java.util.*;
import java.io.*;
public class AgentProcessor {
	private List<Agent> allAgents;
	public AgentProcessor() {
		try {
			allAgents = new Gson().fromJson(new FileReader("src/main/resources/allAgents.json"), new ArrayList<Agent>().getClass());
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
