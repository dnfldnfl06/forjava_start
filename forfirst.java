//input 3 [x,y] position  get last position
//20.11.06 find exception on inputs:[[-1,2],[2,2],[2,-2]],[[-1,2],[2,-2],[2,2]]  need a sort function
//20.11.07.12:34 done!!
package firstquestionJava;
import java.util.Arrays;
import java.util.Scanner;
public class forfirst {
public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("ex)[[1,2],[22,4],[15,61]] input Coordinates please: ");
		String input = sc.next();
		getlastpos test = new getlastpos();
		System.out.printf("%s",test.getpos(input));
	}
}
class getlastpos{
	int[] pArray = new int[6];
	String getpos(String input){
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
		int a = 0;
		String pos = new String();
		while(a<5) {//sort part  need a loop twice
			int[] v1 = {pArray[2]-pArray[0],pArray[3]-pArray[1]};
			int[] v2 = {pArray[4]-pArray[0],pArray[5]-pArray[1]};
			if(v1[0]*v2[0]+v1[1]*v2[1]==0){	//Rectangle check
				int[] v = {pArray[4]+v1[0],pArray[5]+v1[1]};
				pos = Arrays.toString(v);
				return pos;
			}
			swap(pArray,0,2+a);
			swap(pArray,1,3+a);
			a+=2;
		}
		pos ="it can't be a rectangule.";
		return pos;
	}
	void swap(int[]target,int a, int b) {
		int temp = target[a];
		target[a] = target[b];
		target[b] = temp;
	}
}




