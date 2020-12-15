package sumProblem;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
	String[] name = new String[5]; // 과목명선언
	int [] score =new int[5];
	int sum =0, max =0, min =100;
	double avg;//평균
	
	name[0] ="국어";
	name[1] ="수학";
	name[2] ="사회";
	name[3] ="영어";
	name[4] ="과학";
	
	Scanner sc = new Scanner(System.in);
	
	for(int i =0; i <score.length; i++) {
		System.out.println(name[i] +"점수를 입력하세요:");
		score[i] =sc.nextInt(); //각 각 점수를 배열에 저장
	}
	for(int j =0; j<score.length; j++) {
		sum += score[j];
		if(score[j]>max) {
			max =score[j];
		}
		if(score[j]<min) {
			min = score[j];
		}
	}
	avg = sum /(double)score.length;
	System.out.println("총합:"+sum+"\n평균:"+avg+"\n최대점수:"
	+max+"\n최소 점수:"+min);

}
}
