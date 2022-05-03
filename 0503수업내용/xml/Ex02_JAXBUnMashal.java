package kr.human.xml;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import kr.human.Json.vo.PersonVO;

public class Ex02_JAXBUnMashal {
	public static void main(String[] args) {
		// create JAXB context
		try (FileReader fr = new FileReader("src/main/resources/personVO.xml")){
			// 1. create JAXB context 객체 생성 : 클래스 타입을 인수로 지정
			JAXBContext context = JAXBContext.newInstance(PersonVO.class);
			
			// 2. XML을 자바 객체로 변경하는 객체 Unmarshaller
			Unmarshaller um = context.createUnmarshaller();
			// 3. 읽기
			PersonVO vo = (PersonVO) um.unmarshal(fr);
						
			// 4. 읽은 객체 출력
			System.out.println(vo);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
