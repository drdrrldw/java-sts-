package kr.human.java0428;

public class StringEx {
	public static void main(String[] args) {
		String[] emails = "kimc@daum.net,leec@gmail.com,parkc@naver.com".split(",");

		//문자열.substring(n, m) : n부터 m전까지를 잘라서 가져온다.
		//문자열.substring(n) : n부터 끝까지를 잘라서 가져온다.
		
		// 도메인만 뽑아내고 싶다.
		for (String email : emails) {
			System.out.println(email.substring(email.indexOf("@") + 1));
		}

		// 아이디만 뽑아내고 싶다.
		for (String email : emails) {
			System.out.println(email.substring(0, email.indexOf("@")));
		}
		
		System.out.println(emails[0].indexOf('@'));
		System.out.println(emails[0].lastIndexOf('@'));
		
		
		String str = "우리나라좋은나라";
		System.out.println(str.replace("나라", "국가"));
		str = "하\t호\t히";
		System.out.println(str);
		str = str.replace("\t", "              ");
		System.out.println(str);
		str = str.replaceAll(" ", "");
		System.out.println(str);
		System.out.println();
		str = "하\t호\n히\r\n흐";
		System.out.println(str);
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		System.out.println();
		
		
		
		//개수 세기
		str = "aabbccaassddff";
		int count = str.split("aa").length;	// 찾는 문자열을 기준으로 잘라서 배열을 만들자
		if(!str.endsWith("aa")) count --;	// 찾는 문자열로 끝나지 않으면 배열길이 -1이 갯수
		System.out.println(count + "번");
		System.out.println();
		str = "aabbccaassddffaa";
		count = str.split("aa").length;		
		if(!str.endsWith("aa")) count --;
		System.out.println(count + "번");
		
		
		str = String.join("", "한놈", "두식이", "석삼", "너구리", "오징어");
		System.out.println(str);
		
		
	}
}
