package kr.human.net1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class GsonEx03 {
	public static void main(String[] args) {
		Gson gson = new Gson();

		try {
			// map을 JSON 객체 만들기
			Map<String, String> map= new HashMap<>();
			map.put("name", "한사람");
			map.put("age", "33");
			map.put("gender", "true");
			map.put("height", "178.9");
			
			System.out.println(map);
			
			//문자열로 만들어 저장하기
			String str = gson.toJson(map);
			System.out.println(str);
			
			//저장하기
			FileWriter fw = new FileWriter("src/main/resources/person.json");
			fw.write(str);
			fw.flush();
			fw.close();
			
			
			// String 에서 읽기
			Map map2 = gson.fromJson(str, Map.class);
			System.out.println(map2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
