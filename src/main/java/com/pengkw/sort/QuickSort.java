package com.pengkw.sort;

/**
 * 快速排序
 */
public class QuickSort {
	
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
		int len = arr.length;
		sort(arr, 0, len-1);
	}
	
	private static void sort(int[] arr, int from, int to) {
		if(from < to) {
			int partition = partition(arr, from, to);
			sort(arr, from, partition - 1);
			sort(arr, partition + 1, to);
		}
	}
	
	private static int partition(int[] arr, int left, int right) {
		int tmp = arr[left];
		while(left < right) {
			//首先从右往左找
			while(left < right && arr[right] >= tmp) {
				right--;
			}
			if(left < right) {
				arr[left++] = arr[right];
			}
			
			//从左往右找
			while(left < right && arr[left] <= tmp) {
				left++;
			}
			if(left < right) {
				arr[right--] = arr[left];
			}
		}
		//结束的时候left等于right
		arr[left] = tmp;
		return left;
	}
}
