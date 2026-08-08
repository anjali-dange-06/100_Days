package String;

import java.util.Scanner;

public class StringBasics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// String Array
		String[] str = { "raj", "sam", "anju", "aadi" };

		for (String st : str) {
			System.out.println(st);
		}

		// Basic String Methods
		String stt = "Anjali Dange";

		System.out.println(stt.charAt(3));
		System.out.println(stt.length());

		// Count Vowels
		String s = "ierwjcxurgciopcmxkxcqijmiivw";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		System.out.println("Vowels = " + count);

		// Palindrome
		System.out.print("Enter String : ");
		String strr = sc.nextLine();

		boolean isPalindrome = true;

		for (int i = 0; i < strr.length() / 2; i++) {

			if (strr.charAt(i) != strr.charAt(strr.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

		//Reverse the String
		String rev = "";
		String namee = "ilajna";

		for (int i = namee.length() - 1; i >= 0; i--) {
		    rev = rev + namee.charAt(i);
		}

		System.out.println("The reverse of the string is " + rev);
		// Built in Methods

		String anj = "Arpit Bansal";

		System.out.println(anj.indexOf(' '));
		System.out.println(anj.lastIndexOf('a'));

		System.out.println(anj.toLowerCase());
		System.out.println(anj.toUpperCase());

		System.out.println(anj.contains("Ban"));
		System.out.println(anj.contains("Raj"));

		System.out.println(anj.startsWith("Ar"));
		System.out.println(anj.endsWith("sal"));

		String s1 = "Java";
		String s2 = "java";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));

		System.out.println(anj.substring(6));
		System.out.println(anj.substring(0, 5));

		System.out.println(anj.replace('a', 'x'));
		System.out.println(anj.replace("Arpit", "Rahul"));

		String empty = "";
		System.out.println(empty.isEmpty());

		System.out.println(anj.concat(" Developer"));

		// Split

		String[] arr = anj.split(" ");

		for (String name1 : arr) {
			System.out.println(name1);
		}

		// toCharArray

		char[] ch = anj.toCharArray();

		for (char c : ch) {
			System.out.print(c + " ");
		}

		System.out.println();

		// Join

		String joined = String.join("-", "Java", "Python", "C++");
		System.out.println(joined);

		// Print All Substrings

		String name = "Gopi";

		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j <= name.length(); j++) {
				System.out.println(name.substring(i, j));
			}
		}

		// == and equals()

		String a1 = "Raghav";
		String a2 = new String("Raghav");
		String a3 = new String("Raghav");

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

		System.out.println(a2 == a3);
		System.out.println(a2.equals(a3));

		System.out.println(a1 == a3);
		System.out.println(a1.equals(a3));

		// Custom Equals Function

		System.out.println(Equals("Java", "Java"));
		System.out.println(Equals("Java", "java"));
		System.out.println(Equals("Hello", "Hello"));

		sc.close();
	}

	public static boolean Equals(String a1, String a2) {

		if (a1.length() != a2.length())
			return false;

		for (int i = 0; i < a1.length(); i++) {

			if (a1.charAt(i) != a2.charAt(i))
				return false;
		}

		return true;
	}
}