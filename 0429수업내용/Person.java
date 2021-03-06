package kr.human.Java0429;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode	// 내가 만든 클래스가 Set에서 사용될 가능성이 조금이라도 있다면 반드시 해줘야한다.
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	
	@Override	// 같으면 0,  내가 크면 양수, 내가 작으면 음수를 리턴하도록 만든다.
	public int compareTo(Person o) {
		// this가 있기 때문에 인수가 1개이다.
//		return this.name.compareTo(o.name); /// 이름오름차순
//		return o.name.compareTo(this.name); /// 이름 내림차순
//		return this.name.compareTo(name) * -1; // 이름 내림차순
//		return this.age - o.age;
//		return o.age - this.age;
		
		return this.name.compareTo(o.name) == 0 ? o.age - this.age : this.name.compareTo(o.name);
	}
	
	

	
}
