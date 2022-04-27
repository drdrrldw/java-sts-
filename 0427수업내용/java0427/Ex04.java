package kr.human.java0427;

public class Ex04 {
	static class Parent{
		int x = 100;
		
		void method() {
			System.out.println("Parent Method");
		}

	}
	
	
	static class Child extends Parent{
		int x = 200;
		
		void method() {
			System.out.println("Child Method");
		}
	}
	
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(parent.x);
		System.out.println(child.x);
		System.out.println();
		parent.method();
		child.method();
		
		System.out.println();
		Parent parent2 = new Child();	// 부모에 대입했을 경우 무엇이 나올까
		System.out.println(parent2.x);		// 변수는 변수의 타입에 맞게 나온다. (부모)
		parent2.method();					// 메서드는 현재 가리키는 객체의 메서드에 맞게 나온다. (자식)
		
		
	}
	
}
