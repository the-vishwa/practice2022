package vvvv;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int[] F = { 1, 4, 5, 6, 7, 4, 3 };
		int[] S = { 2, 4, 6, 9, 7, 10 };

		int length = F.length+S.length;
		int[] merge = new int[length];
		
		int cnt = 0;
		for (int i :F){
			merge[cnt] =i;
			cnt++;
		}
		for (int i : S) {
			merge[cnt] =i;
			cnt++;
		}
		System.out.println(Arrays.toString(merge));
		
	}
}



