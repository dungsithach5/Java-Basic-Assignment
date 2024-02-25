package API_Collection;

import java.util.HashMap;
import java.util.Map;

public class INI_file {
	public static void main(String[] args) {
		Map<String , String> setting = new HashMap<>();
		setting.put("font_size", "14"); //(key,value)
		setting.put("font_color", "Blue");
		//lpad setting to variables
		int font_size = Integer.parseInt(setting.get("font_size"));
		//save setting
		if(setting.get("font_color") == "Blue") {
			//
			System.out.println("Font color is Blue.");
		}
		if(setting.get("font_color") == "Black") {
			//
			System.out.println("Font color is Black.");
		}
	}
}
