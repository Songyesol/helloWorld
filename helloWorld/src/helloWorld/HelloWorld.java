package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "Hong gildong"; //주석(프로그램에 반영은 안됌.)
		name = "홍길동";
		System.out.println("My name is" + name);
		int age = 20;
		System.out.println("My age is" + " " + age);
		double height = 170.8;
		System.out.println("내 키는" + " " + height + "입니다.");
		System.out.println( name + " 키는 " + height + "입니다.");
		name = "송예솔";
		height = 163;
		System.out.println( name + " 키는 " + height + "입니다.");
		
		String name1 = "김유진";
		int age1 = 29 ; 
		double height1 = 163.1;
		System.out.println(name1 +"의 나이는 " + age1 + "이고 키는" + height1 + "입니다.");
		
		age1 = 29+29;
		System.out.println("두 사람 나이의 합은 " + age1 + "입니다.");
	}
}

//클래스는 대문자로 시작하고 그 외에 변수들은 소문자를 사용함.
//변수는 2번 선언할 수 없음.

