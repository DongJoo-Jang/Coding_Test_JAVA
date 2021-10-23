import java.util.Scanner;

public class Quiz10872 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0<= N <= 12인 정수 N 입력:");
		int num = scan.nextInt();
		int result = factorial(num);
		System.out.println(result);		
	}

	static public int factorial(int n) {
		if( n == 0 )
			return 1;
		else
			return n*factorial(n-1);
	}
}
