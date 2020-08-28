package com.example.javabasic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String args[]) {
		String[] str = { "1212", "1222", "1232", "1242","1252"};
		Pattern p = Pattern.compile("12[1-4]2");
		for (String input : str) {
			Matcher m = p.matcher(input);
			boolean b = m.matches();
			System.out.println(input+" matches the pattern "+b);
		}
	}
}
