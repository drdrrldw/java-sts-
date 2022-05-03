package kr.human.Json.vo;

import lombok.Data;

@Data
public class BoxOfficeVO {
	private BoxOfficeResult2 boxOfficeResult2;
	
	
	@Data
	public static class BoxOfficeResult2{
		private String boxofficeType;
		private String showRange;
		private DailyBoxOfficeList[] dailyBoxOfficeList;
		
	}
	
	
	@Data
	public class DailyBoxOfficeList{
		private String rank;
		private String movieNm;
		private String openDt;
		
	}
}
