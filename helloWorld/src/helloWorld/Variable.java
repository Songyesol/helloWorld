package helloWorld;

public class Variable {

	public static void main(String[] args) {
 		int num1 = 10; // =은 오른쪽 값을 왼쪽에 대입한다는 의미.
		int num2 = 20;
		
		int sum = 40;
		System.out.println("sum: "+ sum );

//		sum = num1 / num2; //0.5 -> sum은 정수만 담을 수 있는 타입이라서 0을 반환 
//		System.out.println("sum: "+ sum );
//		sum = num1 % num2; // 1의 값을 2의 값으로 나누고 남은 나머지 
//		System.out.println("sum: "+ sum );
		
		boolean trueofalse = true; // 참과 거짓 값 반환, 조건문 쓸 때 많이 사용 
		System.out.println(trueofalse);
		boolean trueoFalse = sum <= 10;
		System.out.println(trueoFalse);
		
		if (trueoFalse) {
			System.out.println("결과 참입니다.");
		} else {
			System.out.println("결과 거짓입니다.");
		}
		
	
	}

}
