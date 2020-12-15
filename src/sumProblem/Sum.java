package sumProblem;

public class Sum {

	public static void main(String[] args) {
		int[] score = {78,56,98,23,54,36};
		int sum =0;
		int sumCoundition =0;
		
		for(int i =0; i<score.length; i++) {
			sum+=score[i];
			if(score[i]>=80) {
				sumCoundition +=score[i];
			}
		}
		System.out.println(score.length+"명의 총점"+ sum);
		System.out.println(score.length+"명의 점수중 80점이상의 총점은"
		+sumCoundition);

	}

}
