import java.io.*;

public class Assignment4 {

	public static void main(String[] args) throws IOException{ 
		int range = 1000;
		int increment = 10;
		long[] results = new long[range/increment];
		int[] nItems = new int[range];
		long start = 0;
		long stop = 0;
		int total = 0;
				
		File file = new File("assn4Ex5_1.txt");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		PrintWriter printWriter = new PrintWriter(bufferedWriter);
		
		int j = 0;
		for(int i = 1; i < range; i += increment){
			start = System.nanoTime();
			total = example5(nItems, nItems, i);
			stop = System.nanoTime();
			nItems[j] = i;
			results[j] = stop-start;
			System.out.println(nItems[j] + ", " + results[j]);
			printWriter.println(nItems[j] + "," + results[j]); 
			j++;
		}
		
		printWriter.close();
	}
	
	//5-4.9
	public static int example1(int[] arr, int limit) {
		int n = limit, total = 0;
		for(int j = 0; j < n; j++){
			total += arr[j];
		}
		return total;
	}

	//5-4.10
	public static int example2(int[] arr, int limit){
		int n = limit, total = 0;
		for(int j = 0; j < n; j += 2){
			total += arr[j];
		}
		return total;
	}

	//5-4.11
	public static int example3(int[] arr, int limit){
		int n = limit, total = 0;
		for(int j = 0; j < n; j++){
			for(int k = 0; k <= j; k++){
				total += arr[j];
			}
		}
		return total;
	}

	//5-4.12
	public static int example4(int[] arr, int limit){
		int n = limit, prefix = 0, total = 0;
		for(int j = 0; j < n; j++){
			prefix += arr[j];
			total += prefix;
		}
		return total;
	}

	//5-4.13
	public static int example5(int[] first, int[] second, int limit){
		int n = limit, count = 0;
		for(int i = 0; i < n; i++){
			int total = 0;
			for(int j = 0; j < n; j++){
				for(int k = 0; k <= j; k++){
					total += first[k];
				}
			}
			if(second[i] == total){
				count++;
			}
		}
		return count;
	}

}

