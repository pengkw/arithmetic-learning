package com.pengkw.string;

import java.util.HashMap;

/**
 *	给定两个分别由字母组成的字符串A和字符串B，字符串B的长度比字符串A短。请问，如何最快地判断字符串B中所有字母是否都在字符串A里？

 *	为了简单起见，我们规定输入的字符串只包含大写英文字母，请实现函数bool StringContains(string &A, string &B)
	
 *	比如，如果是下面两个字符串：
	
 *	String 1：ABCD
	
 *	String 2：BAD
	
 *	答案是true，即String2里的字母在String1里也都有，或者说String2是String1的真子集。
	
 *	如果是下面两个字符串：
	
 *	String 1：ABCD
	
 *	String 2：BCE
	
 *	答案是false，因为字符串String2里的E字母不在字符串String1里。
	
 *	同时，如果string1：ABCD，string 2：AA，同样返回true。
 *
 */
public class ContainString {

	public static void main(String[] args) {
		String m = "abcde";
		String n = "def";
		
		System.out.println(String.format("%s contain %s is %s", m, n, contain(m, n)));
	}
	
	/**
	 * 当时想到的解法是用HashMap
	 * 遍历长点的字符串，将其包含的字符放入map中，然后在遍历短字符串，看其是否包含在map中
	 * 这个方法的时间复杂度为O(m+n)，空间复杂度为O(m)
	 * @param m
	 * @param n
	 * @return
	 */
	public static boolean contain(String m, String n) {
		int len = m.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(len);
		for(int i = 0; i < len; i++) {
			map.put(m.charAt(i), 1);
		}
		
		len = n.length();
		for(int i = 0; i < len; i++) {
			if(map.get(n.charAt(i)) == null) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * https://github.com/julycoding/The-Art-Of-Programming-By-July/blob/master/ebook/zh/01.02.md
	 * 给出了时间复杂度为O(m+n)，空间复杂度为O(1)的解法
	 * @param m
	 * @param n
	 * @return
	 */
	public static boolean contain2(String m, String n) {
		int len = m.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(len);
		for(int i = 0; i < len; i++) {
			map.put(m.charAt(i), 1);
		}
		
		len = n.length();
		for(int i = 0; i < len; i++) {
			if(map.get(n.charAt(i)) == null) {
				return false;
			}
		}
		return true;
	}
}
