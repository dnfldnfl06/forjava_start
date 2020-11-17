//input 3 [x,y] position  get last position
//20.11.06 find exception on inputs:[[-1,2],[2,2],[2,-2]],[[-1,2],[2,-2],[2,2]]  need a sort function
//20.11.07.12:34 Done!!
//20.11.17 find exception on [[1,2],[22,4],[15,61]] because of my sort function ^~^...
//20.11.17 Done! but find another one [[0,25],[-25,0],[-25,0]] ->[0, 25] when more than two points are same
//20.11.17 I fixed it
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
	String getpos(String input){
		String result = "";
		for (int i = 0;i<input.length();i++) {	//remove '[' and ']'
			char ch = input.charAt(i);
			if(!(ch=='['||ch==']')) {
				result+=ch;
			}
		}
		String[] result2 = result.split(",");
		int[] pArray = new int[6];
		for(int i =0;i<result2.length;i++) {		//make input spring to Array 
			pArray[i] = Integer.parseInt(result2[i]);
		}
		if(sameChecker(pArray)) {return "it can't be a rectanule.";}  //sameChecker
		int a = 0;
		String pos = new String();
		while(a<5) {//sort part  need a loop twice
			int[] v1 = {pArray[2]-pArray[0],pArray[3]-pArray[1]};
			int[] v2 = {pArray[4]-pArray[0],pArray[5]-pArray[1]};
			if(v1[0]*v2[0]+v1[1]*v2[1]==0){	//Rectangle check
				int[] v = {pArray[4]+v1[0],pArray[5]+v1[1]};
				return Arrays.toString(v);
			}
			if(a>=4){break;} // for pArray bounce 20.11.17
			swap(pArray,0+a,2+a);
			swap(pArray,1+a,3+a);
			a+=2;
		}
		return "it can't be a rectangule.";
	}
	void swap(int[]target,int a, int b) {
		int temp = target[a];
		target[a] = target[b];
		target[b] = temp;
	}
	boolean sameChecker(int[]target) {				//20.11.17 same point filter
		for(int i=5;i>0;i-=2) {
			if( target[i-1]==target[i-3]&&target[i]==target[i-2]) {return true;}
		}
		return false;
	}
}




