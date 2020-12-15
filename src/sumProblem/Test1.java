package sumProblem;
//총점 과 평균 구하기
public class Test1 {

	public static void main(String[] args) {
		int sum=0; //총점
		float avg = 0f; // 평균
		
		int[] score = {87,46,96,53,20};
		
		for(int i =0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum /(float)score.length;
		
		System.out.println("총점"+sum);
		System.out.println("평균"+avg);
	}

}
