package sumProblem;
//최댓값,최솟값 구하기
public class Test2 {

	public static void main(String[] args) {
		int []num = {88,98,32,50,64,97};
		int max = num[0];
		int min = num[0];
		
		for(int i =1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
				System.out.println("Max:"+max);
			}else if(num[i] <min) {
				min = num[i];
				System.out.println("Min:"+min);
			}
		}
		System.out.println("\n" +"Final Max:"+ max);
		System.out.println("Final min"+ min);
	}

}
