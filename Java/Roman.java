package Java;

import java.util.Scanner;

public class Roman {
        public static int roman(String s) {
        	int total=0;
           for(int i=0;i<s.length();i++) {
        	   int c=romanValue(s.charAt(i));
        	   if(i+1<s.length() && c<romanValue(s.charAt(i+1))) {
        		   total=total-c;
        	   }else {
        		   total=total+c;
        	   }
           }
           return total;
        }
        public static int romanValue(char roman) {
        	switch(roman){
        		case 'I': return 1;
        		case 'V': return 5;
        		case 'X': return 10;
        		case 'L': return 50;
        		case 'C': return 100;
        		case 'D': return 500;
        		case 'M': return 1000;
        		default : return 0;
        	}
        }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Roman Number : ");
		String r=sc.nextLine();
		int i=roman(r);
		System.out.println("The integer value of "+r+" is : "+i);
        sc.close();
	}

}
