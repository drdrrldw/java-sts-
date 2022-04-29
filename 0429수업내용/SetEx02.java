package kr.human.Java0429;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// 사용자가 작성한 클래스도 될까
public class SetEx02 {
	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();
		
		personSet.add(new Person("한사람",22));
		personSet.add(new Person("두사람",49));
		personSet.add(new Person("세사람",34));
		
		System.out.println(personSet.size() + "명 : " + personSet);
		
		
		// 사용자가 만든 클래스를 넣어서 중복을 제거 하려면 반드시 equals 메서드를 오버라이딩 해줘야한다.
		personSet.add(new Person("한사람",22));
		personSet.add(new Person("두사람",49));
		System.out.println(personSet.size() + "명 : " + personSet);
		System.out.println();
		
		// 사용자가 만든 클래스를 정렬이 지원되는 컬렉션에 저장하려면
		// 반드시 정렬기준을 지정하는 인터페이스를 구현해줘야한다.
		Set<Person> personSet2 = new TreeSet<>();
		personSet2.add(new Person("한사람",22));
		personSet2.add(new Person("두사람",75));
		personSet2.add(new Person("세사람",34));
		personSet2.add(new Person("두사람",45));
		personSet2.add(new Person("세사람",64));
		System.out.println(personSet2.size() + "명 : " + personSet2);
		
		// 이름 오름차순 나이 내림차순 이라면 어떻게 할까여?
		
	}
}
