package kr.human.MavenEx02;

// 카드 1장을 저장하는 용도의 클래스
public class CardVO {
	private int value;	// 0~51까지  /13 => 무늬,  %13 => 숫자
	private static String[] pattern = "◆♥♠♣".split("");		// 1글자씩 잘라서 배열로 만든다.
	private static String[] numbers = " 1, 2, 3, 4, 5, 6, 7, 8, 9,10, J, Q, K".split(",");	// ,로 구분해 배열로 만든다.
	
	public CardVO(int value) {
		super();
		this.value = value;
	}
	
	
	public String getPattern() {
		return pattern[value/13];
	}
	
	public String getNumber() {
		return numbers[value%13];
	}


	@Override
	public String toString() {
		return getPattern() + getNumber();
	}
	
	
	
}
