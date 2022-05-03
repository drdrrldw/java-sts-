package kr.human.xml;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import kr.human.Json.vo.PersonVO;
import kr.human.Json.vo.Rss;

public class Ex04_JAXBUnMashal {
	public static void main(String[] args) {
		// create JAXB context
		try (FileWriter fw = new FileWriter("src/main/resources/rss.xml")){
//			URL url = new URL("https://rss.hankyung.com/feed/it.xml");	// it란
			URL url = new URL("https://rss.hankyung.com/feed/politics.xml");	//정치란
			
			// 1. create JAXB context 객체 생성 : 클래스 타입을 인수로 지정
			JAXBContext context = JAXBContext.newInstance(Rss.class);
			
			// 2. 자바 객체를 XML로 변경하는 객체 Marshaller
			Marshaller m = context.createMarshaller();
			Unmarshaller um = context.createUnmarshaller();

			// 3. XML의 모양을 지정함
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			
			// URL에서 읽기
			InputStreamReader isr = new InputStreamReader(url.openStream());
			Rss rss = (Rss) um.unmarshal(isr);
			
			
			// 제목 출력
			System.out.println(rss.getChannel().getTitle());
			System.out.println(rss.getChannel().getLink());
			System.out.println(rss.getChannel().getLastBuildDate());
			
			
			// 기사 출력
			for(Rss.Item item : rss.getChannel().getItem()) {
				System.out.println(item.getTitle() + " : " + item.getLink());
			}
			
			
			// 파일로 저장
			m.marshal(rss, fw); 
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
