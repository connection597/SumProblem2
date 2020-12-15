package sumProblem;

import java.util.Scanner;

//1 부터 n까지 홥 구하기
public class SumQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다");
		System.out.println("n의 값:");
		int n = sc.nextInt(); //키보드 입력 갑중 정수값 얻어내기
		
		int sum =0;
		for(int i =1; i<=n; i++)
			sum+=i;
		System.out.println("1부터"+n+"까지 합은 "+sum+"입니다");

	}

}
