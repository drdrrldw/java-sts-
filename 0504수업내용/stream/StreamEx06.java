package kr.human.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx06 {
	public static void main(String[] args) {
		// 사용자가 만든 클래스를 이용한 스트림 작업
		List<Employee> list = Employee.persons();
		System.out.println("원본 : "+ list);
		
		
		// 스트림을 이용하여 전체를 출력
		list
		.stream()
		.forEach(e->System.out.println(e.getId()+ " : "+e.getName()));
		System.out.println("-".repeat(60));
		
		
		//리스트중에서 여자만 출력해라
		list
		.stream()
		.filter(Employee::isFemale)
		.forEach(e->System.out.println(e.getId()+ " : "+e.getName()+", " + e.getGender()));
		System.out.println("-".repeat(60));
		
		
		//리스트중에서 남자만 출력해라
		list
		.stream()
		.filter(e->e.getGender() == Employee.Gender.MALE)
		.forEach(e->System.out.println(e.getId()+ " : "+e.getName()+", " + e.getGender()));
		System.out.println("-".repeat(60));
		
		
		System.out.println("값 변경");
		// 값 변경
		list
		.stream()
		.forEach(e->e.setIncome(e.getIncome()*1.1));	// 10% 증가 : 최종연산 
		System.out.println();
		
		// 다시 출력
		list
		.stream()
		.forEach(e->System.out.println(e.getId()+ " : "+e.getName()+", " + e.getIncome()));
		System.out.println("-".repeat(60));
		
		
		
		// map을 이용한 값 변경
		list
		.stream()
		.map(Employee::getUpperName)
		.forEach(e->System.out.println(e));
		System.out.println("-".repeat(60));
		
		
		// 남자중에서 수입이 5000 이상인 사람의 이름과 수입을 출력하시오
		list
		.stream()
		.filter(e -> !e.isFemale())
		.filter(e-> e.getIncome() >= 5000)
		.forEach(e->System.out.println(e));
		System.out.println("-".repeat(60));
		
		
		list
		.stream()
		.filter(e -> !e.isFemale() && e.getIncome() >= 5000 )
		.forEach(e->System.out.println(e));
		System.out.println("-".repeat(60));
		
		
	}
}
