package firstquestionJava;
import java.util.Arrays;

	public class handmadeQuickSort {
	    

		static void sorter(int[]target, int left,int right) {
			int pl = left; //pivot left
			int pr = right;
			int pv = target[(left+right)/2];  //pivot
			do {
				while(target[pl]<pv) pl++;
				while(target[pr]>pv) pr--;
				if(pl<=pr) {
					int temp = target[pr];
					target[pr] = target[pl];
					target[pl] = temp;
					pl++;
					pr--;
				}	
			}
			while(pl<=pr);
			
	        if(left < pr) sorter(target, left, pr);
	        if(right > pl) sorter(target, pl, right);

		
		}
	    
	    public static void main(String[] args) {
	        
	        int data[] = {66, 10, 1, 34, 5, -10};
	        
	        sorter(data, 0, data.length - 1);
	        System.out.print(Arrays.toString(data));
	    }
	}



