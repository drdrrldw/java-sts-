package kr.human.Json.vo;

import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;


import lombok.Data;

@Data
@XmlRootElement(name = "boxOfficeResult")
public class WBO {
	private BoxOfficeResult boxOfficeResult;
	
	@Data
	public static class BoxOfficeResult{
		private String boxofficeType;
		private String showRange;
		private String yearWeekTime;
		private WeeklyBoxOfficeList weeklyBoxOfficeList;
	}

	@Data
	public static class WeeklyBoxOfficeList{
		private List<WeeklyBoxOffice> weeklyBoxOffice;
	}
	
	@Data
	public static class WeeklyBoxOffice{
		private String rank;
		private String movieNm;
		private String openDt;
		private String audiAcc;
	}
	
	
	
}
