package com.pengkw.sort;

/**
 *	冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[]{2,5,7,1,3,4};
		sort(arr);
		for(int a : arr) {
			System.out.print(a + "\t");
		}
	}
	
	public static void sort(int[] arr) {
		if(arr != null) {
			int len = arr.length;
			for(int i = 0; i < len; i++) {
				for(int j = 1; j < len - i; j++) {
					if(arr[j] < arr[j-1]) {
						//交换两者的值
						int tmp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = tmp;
					}
				}
			}
		}
	}
}
