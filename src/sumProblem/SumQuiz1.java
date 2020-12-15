package sumProblem;

import java.util.Scanner;

//정수 a,b를 포함하여 그사이의 모든 정수합 구하기
public class SumQuiz1 {
	static int sumof(int a, int b) {
		int min; // 작은 값
		int max; //큰값
		
		if(a<b) {
			min =a;
			max =b;
		}else {
			min =b;
			max =a;
		}
		int sum =0; //합
		for(int i = min; i <=max; i++)
			sum += i;
		return (sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a와 b를 포함하여 그사이의 정수 의 합 구합니다");
		System.out.println("a의 값:");
		int a = sc.nextInt();
		System.out.println(" b의 값:");
		int b = sc.nextInt();
		
		System.out.println("정수 a,b 사의 모든 정수 의 합은"+sumof(a,b)+"입니다");
	}
		

}
