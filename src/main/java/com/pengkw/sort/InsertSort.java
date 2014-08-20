package com.pengkw.sort;

/**
 * 直接插入排序
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int[] arr = new int[]{2,5,7,1,3,4};
		sort(arr);
		for(int a : arr) {
			System.out.print(a + "\t");
		}
	}
	
	public static void sort(int[] arr) {
		if(arr == null) {
			return;
		}
		int len = arr.length, tmp = 0;
		for(int i = 1; i < len; i++) {
			tmp = arr[i];
			int j = i -1;
			for(; j >= 0; j--) {
				//如果后面的元素大于前面的元素，则将前面的元素后
				if(tmp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
				
			}
			arr[j+1] = tmp;
		}
	}
}
