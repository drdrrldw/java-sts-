package kr.human.net1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class GsonEx01 {
	public static void main(String[] args) {
		Gson gson = new Gson();

		try {
			DicVo[] dicVOs = gson.fromJson(new FileReader("src/main/resources/dic.json"), DicVo[].class);
			System.out.println(dicVOs.length + "개 읽음");

			for (DicVo vo : dicVOs) {
				System.out.println(vo.getH() + "(" + vo.getM() + " " + vo.getM1() + ")");
			}
			
			//저장하기
			gson.toJson(dicVOs, new FileWriter("src/main/resources/dic_copy.json"));
			
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
