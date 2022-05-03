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
import kr.human.Json.vo.WBO;
import kr.human.Json.vo.WeeklyBoxOffice;
import kr.human.Json.vo.WeeklyBoxOffice.WeeklyBoxOfficeList;
import kr.human.Json.vo.WeeklyBoxOfficeResult;

public class Ex05_JAXBUnMashal {
	public static void main(String[] args) {
		// create JAXB context
		try (FileWriter fw = new FileWriter("src/main/resources/WeeklyBoxOffice.xml")){
			URL url = new URL("https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=20220501");
			
			// 1. create JAXB context 객체 생성 : 클래스 타입을 인수로 지정
			JAXBContext context = JAXBContext.newInstance(WeeklyBoxOfficeResult.class);
			
			// 2. 자바 객체를 XML로 변경하는 객체 Marshaller
			Marshaller m = context.createMarshaller();
			Unmarshaller um = context.createUnmarshaller();

			// 3. XML의 모양을 지정함
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			
			// URL에서 읽기
			InputStreamReader isr = new InputStreamReader(url.openStream());
			WeeklyBoxOfficeResult weeklyBoxOffice = (WeeklyBoxOfficeResult) um.unmarshal(isr);
			
			
			// 제목 출력
			System.out.println(weeklyBoxOffice.getBoxofficeType());
			System.out.println(weeklyBoxOffice.getShowRange());
			System.out.println(weeklyBoxOffice.getYearWeekTime());
			
			
//			
//			
//			// 기사 출력
//			for(WeeklyBoxOffice.WeeklyBoxOfficeList w : wbo.getBoxOfficeResult().getWbo()) {
//				System.out.println(w.getRank()+"위  영화제목 : " + w.getMovieNm()+ " 개봉일 : " + w.getOpenDt() + "누적 관객수 : "+w.getAudiAcc());
//			}
//			
			
			// 파일로 저장
			m.marshal(weeklyBoxOffice, fw); 
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
