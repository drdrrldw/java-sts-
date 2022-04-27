package kr.human.java0427;

class Parent {
	public Parent() {
		System.out.println("Parent 생성자 호출");
	}
}

class Child extends Parent { // Parent 클래스를 상속받아 child클래스를 만든다.
	public Child() {
		System.out.println("Child 생성자 호출");
	}
}

class GrandChild extends Child {
	public GrandChild() {
		System.out.println("GrandChild 생성자 호출");
	}
}


class Some{
	int value;
	public Some(int value) {
		this.value = value;
	}
}

class SomeChild extends Some{
	public SomeChild() {
		//super();
		// 이때 에러를 방지하려면 명시적으로 부모의 생성자를 직접 호출해주면 된다.
		super(0);
	}
}


class Name{
	String name;
	
	public Name(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		
		return name.toUpperCase();	// 이름을 대문자로 바꿔서 리턴
	}
}

class NameChild extends Name{
	int age;
	public NameChild(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "(" + age + "세)";
	}
	
	
}




public class Ex01 {
	public static void main(String[] args) {
		GrandChild grandChild = new GrandChild();
		
		NameChild nameChild = new NameChild("kimc", 33);
		System.out.println(nameChild);
		
	}
}
