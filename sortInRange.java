import java.util.Arrays;

public class sortInRange{

	public static void main(String[] args) {
	
		int [][] newArray = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		
		System.out.println(Arrays.toString(solution(array,newArray)));
		
		
	}

	public static int[] solution(int[] array, int[][] commands) {
        int commandsLength = commands.length;
        int[] answer = new int[commandsLength];
        
        for(int i=0; i<commandsLength;i++){
            int[]command = commands[i];

            int sortLength = command[1]-command[0]+1;
            int[] sortArray = new int[sortLength];
            for(int j=0; j<sortLength;j++){
                sortArray[j]=array[command[0]+j-1]; // arrays start at 0;
            }
            Arrays.sort(sortArray);
            answer[i]=sortArray[command[2]-1];
        }
        return answer;

    }
	}



