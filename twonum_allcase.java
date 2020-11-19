package firstquestionJava;

public class twonum_allcase {

	public static void main(String[] args) {
		

	}
	
	public static int[] Solution(int[] numbers) {
		int length = numbers.length;
		boolean[] check = new boolean[numbers[length]*2];
		int count = 0;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				int k = numbers[i]+numbers[j];
				if(check[k]==false) {
					count++;
				}
				check[k]=true;
			}
		}
		int j =0;
		int[] answer = new int[count];
		for(int i =0;i<length;i++) {
			if(check[i]==true) {
				answer[j++] = i;  
			}
		}
		return answer;
		
	}
}
