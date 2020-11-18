package firstquestionJava;
import java.util.Arrays;
public class find_disqualifier {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String[] participant1 = {"mislav", "mislav","stanko" , "ana"};
		String[] completion1 = {"stanko", "ana"};	
		//System.out.println(Solution(participant,completion));	
		System.out.println(Solution(participant1,completion1));

	}

	public static String Solution(String[] participant,String[] completion) {
		int length = completion.length;
		int count = participant.length-length;//Disqualified count
		Arrays.sort(participant);
		Arrays.sort(completion);
		String answer="";
		boolean[] check =new boolean[length+count];
		int counter = 0;
		for(int i=0; i<length; i++) {
			String temp = participant[i];
			if(!temp.equals(completion[i-counter])){
				check[i] = true;
				counter++;
			}
		}
		for(int i =0;i<length+count;i++) {
			if(check[i]==true) {
				System.out.println(participant[i]);
			}
		}
		return answer;
	}
}
