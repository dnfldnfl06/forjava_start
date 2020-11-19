package firstquestionJava;
import java.util.Arrays;
public class twonum_allcase {

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		System.out.println(Arrays.toString(Solution(numbers)));

	}
	
	public static int[] Solution(int[] numbers) {
		int length = numbers.length;
		Arrays.sort(numbers);
		boolean[] check = new boolean[2*numbers[length-1]+1];
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
		for(int i =0;i<check.length;i++) {
			if(check[i]==true) {
				answer[j++] = i;  
			}
		}
		return answer;
		
	}
}
