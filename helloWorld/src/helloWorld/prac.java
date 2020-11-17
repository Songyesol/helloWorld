package helloWorld;

public class prac {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		int sum = num1 + num2;
		int diff = num2 - num1;
		boolean trueoFalse = sum > diff;

		if (trueoFalse) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

	}

}
