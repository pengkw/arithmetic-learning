package com.pengkw.sort;

/**
 * 希尔排序
 * 先将整个待排元素序列分割成若干个子序列（由相隔某个“增量”的元素组成的）分别进行直接插入排序，
 * 然后依次缩减增量再进行排序，待整个序列中的元素基本有序（增量足够小）时，再对全体元素进行一次直接插入排序。
 * 由于希尔排序是对相隔若干距离的数据进行直接插入排序，因此可以形象的称希尔排序为“跳着插”
 */
public class ShellSort {
	
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
		int len = arr.length, gap = len/2;
		while(gap > 0) {
			for(int i = 0; i < gap; i++) {
				for(int j = i + gap; j < len; j += gap) {
					int tmp = arr[j];
					int k = j - gap;
					//注意这个地方有个等于号
					for(; k >= 0; k -= gap) {
						if(arr[k] > tmp) {
							arr[k + gap] = arr[k];
						} else {
							break;
						}
					}
					arr[k + gap] = tmp;
				}
			}
			gap = gap/2;
		}
	}
}
