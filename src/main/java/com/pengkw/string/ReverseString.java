package com.pengkw.string;

/**
 * 给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部，
 * 如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串的尾部，
 * 使得原字符串变成字符串“cdefab”。请写一个函数完成此功能，
 * 要求对长度为n的字符串操作的时间复杂度为 O(n)，空间复杂度为 O(1)
 */
public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(reverseString("abcdefg", 2));
	}
	
	/**
	 * 将一个字符数组指定位旋转过来
	 * @param arr
	 * @param from
	 * @param to
	 * @return
	 */
	public static void reverseString(char[] arr, int from, int to) {
		while(from < to) {
			char tmp = arr[from];
			arr[from++] = arr[to];
			arr[to--] = tmp;
		}
	}
	
	/**
	 * 将一个字符串的前多少位字符反转
	 * @param str
	 * @param len
	 */
	public static String reverseString(String str, int len) {
		if(str != null && len > 0) {
			int size = str.length();
			if(len <= size) {
				char[] arr = str.toCharArray();
				//旋转前半部分
				reverseString(arr, 0, len-1);
				//旋转后半部分
				reverseString(arr, len, size - 1);
				//整体旋转
				reverseString(arr, 0, size - 1);
				str = new String(arr);
			}
		}
		return str;
	}
}
