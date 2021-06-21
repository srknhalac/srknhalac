package cert;

import java.util.Arrays;

public class Ornek {
	public static void main(String[] args) {
		int[] arr1={7,5,6,1,4,2};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		/*2 sayı arasında ki fark 1 olmak zorunda*/
	try {
		for(int i=0; i<arr1.length; ++i) {
				int min=arr1[i];
				int max=arr1[i+1];
				if(max-min!=1) {
					 int sayı=max-1;
					 System.out.println(sayı);
				}
		}
		}catch(ArrayIndexOutOfBoundsException arrException) {
			arrException.printStackTrace();
		}
	}
}
