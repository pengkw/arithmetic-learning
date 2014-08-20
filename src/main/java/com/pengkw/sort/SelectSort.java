package com.pengkw.sort;

/**
 * 直接选择排序
 * 
 * 每次都从无序区中选择最小的放到前面有序区最后
 */
public class SelectSort {
	
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
		int len = arr.length, index = 0, tmp = 0;
		while(index < len) {
			int min = index;
			for(int i = index + 1; i < len; i++) {
				if(arr[i] < arr[min]) {
					min = i;
				}
			}
			tmp = arr[min];
			arr[min] = arr[index];
			arr[index++] = tmp;
		}
	}
}
