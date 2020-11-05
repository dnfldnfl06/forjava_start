
//input 3 [x,y] position  get last position

package firstquestionJava;
import java.util.Arrays;
import java.util.Scanner;
public class forfirst {
public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("ex)[[1,2],[22,4],[15,61]] input Coordinates please: ");
		String input = sc.next();
		getlastpos test = new getlastpos();
		System.out.printf("%s",test.getnum(input));
		
	}

}

class getlastpos{
	int[] pArray = new int[6];
	String getnum(String input){
		String result = "";
		for (int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(!(ch=='['||ch==']')) {
				result+=ch;
			}
		}
		String[] result2 = result.split(",");
		for(int i =0;i<result2.length;i++) {
			pArray[i] = Integer.parseInt(result2[i]);
		}	
		
		int[]v1 = {pArray[2]-pArray[0],pArray[3]-pArray[1]};
		int[]v2 = {pArray[4]-pArray[0],pArray[5]-pArray[1]};
		String pos = new String();
	if(v1[0]*v2[0]+v1[1]*v2[1]==0) {  //직사각혐 가능여부 검사
		int[] v = {pArray[4]+v1[0],pArray[5]+v1[1]};
		pos = Arrays.toString(v);
		}
	else {
		pos ="직사각형이 될수 없습니다.";
		}
	return pos;
	
	}
		
	}

	


