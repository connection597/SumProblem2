package sumProblem;

import java.util.Scanner;

//가우스 덧셉을 이용한 1부터 n까지 합구하기
public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가우스 덧셉이용");
		System.out.println("n의 값:");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i =0; i<n; i++) {
			sum += (i +n-(i-1));
		}
		sum =sum/2;
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");

	}

}
