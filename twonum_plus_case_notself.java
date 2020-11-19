package firstquestionJava;
import java.util.Arrays;
//self optimization 2020.11.20 roadgood
public class twonum_plus_case_notself {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(solution(numbers)));

	}

	public static int[] solution(int[] numbers) {
	        int length = numbers.length;
	        Arrays.sort(numbers);
	        int checkLength = 2*numbers[length-1]+1;
	        boolean[] check = new boolean[checkLength];
	        int count  = 0;
	        for(int i =0;i<length;i++){
	            for(int j=i+1;j<length;j++){
	                int k = numbers[i]+numbers[j];
	                if(!check[k]){count++;}
	                else{continue;}
	                check[k] = true;
	            }
	        }
	        int[] answer = new int[count];
	        int pos=0; // postion in check Array
	        for(int i=0;i<checkLength;i++){
	            if(check[i]==true){
	                answer[pos++]=i;
	            }
	        }
	        return answer;
	    }
	}
