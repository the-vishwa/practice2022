package pairing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FrequncyCntCustom {
	List<Integer>list;
	public FrequncyCntCustom() {
		this.list=new ArrayList<>();
	}
	static int feqCnt(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}


	public static void main(String[] args) {

		int[] arr = { 10, 20, 10, 2, 42, 1, 50, 3, 20, 7, 7, 7, 7, 7 };

		System.out.println(feqCnt(arr));
		List<Integer>list =new ArrayList<>();
		int cnt = 0;
			Iterator<Integer> itr = list.iterator();
			while (itr.hasNext()) {
				Integer i = itr.next();
				if (i.equals(i)) {
					cnt++;
				}
			}
			//return cnt;
		}
		
		
	}
	

