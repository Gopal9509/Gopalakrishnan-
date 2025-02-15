package Java;

import java.util.Scanner;

public class Pangram {
    public static boolean pangram(String s) {
    	s=s.toLowerCase();
    	boolean alphabet[]=new boolean[26];
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(c>='a' && c<='z') {
    			alphabet[c - 'a']=true;
    		}
    	}
    	for(boolean letter: alphabet) {
    		if(!letter) {
    			return false;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String s=sc.nextLine();
		if(pangram(s)) {
			System.out.println("The given sentence is pangram");
		}else {
			System.out.println("The given sentence is not pangram");
		}
		sc.close();
	}

}
