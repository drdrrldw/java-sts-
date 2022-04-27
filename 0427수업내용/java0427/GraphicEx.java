package kr.human.java0427;



abstract class Shape{	// 추상 클래스 : 추상메서드를 1개 이상 가지는 클래스. 미완성 클래스이다. 객체를 생성할수 없다.
						// 				 상속받는 자식 클래스에게 의무를 부여한다. 반드시 오버라이딩하라고 정해준다.
	public static final double PI = 3.141592;
	abstract public void draw(); // 내용이 없는 메서드 ==> 추상메서드 , 규칙을 정하기 위해서 만든다.
}

// 추상클래스보다 추상도가 더 높은 클래스를 자바에서는 interface 라고 한다.
// 일반 변수나 메서드를 가질수 없다. 상수와 추상 메서드만으로 구성된다.
// 인터페이스는 상속이 아니라 구현한다라고 표현 한다. implements 를 사용한다.
interface Graphic{
	double PI = 3.1415;
	void move();
	void remove();
}


interface Graphic2{
	void rotate();
}


// 인터페이스의 상속
interface Graphics extends Graphic, Graphic2{
	void resize();
}

class Point extends Shape implements Graphic, Graphic2{
	public void draw() { System.out.println("점을 그립니다."); }

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
class Line extends Shape implements Graphic{
	public void draw() { System.out.println("선을 그립니다."); }
}
class Circle extends Shape implements Graphic{
	public void draw() { System.out.println("원을 그립니다."); }
}
class Rectangle extends Shape implements Graphic{
	public void draw() { System.out.println("사각형을 그립니다."); }
}
public class GraphicEx {
	public static void main(String[] args) {
		Graphic[] shapes = {new Point(),new Line(), new Circle(), new Rectangle()};
		
		for(Shape shape : shapes) {
			shape.draw();
		}
	}
}
