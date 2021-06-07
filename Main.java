package two;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//1
		for (int i=1; i<=10; i++) {
			System.out.println(i*1 + "\t" + i*2 + "\t" + i*3 + "\t" + i*4 + "\t" + i*5 + "\t" + 
								i*6 + "\t" + i*7 + "\t" + i*8 + "\t" + i*9);
		}
		//2
		int n = 10, first = 0, second = 1;
		System.out.println("Fibonacci Series until " + n + " terms: ");
		
		for (int i = 1; i <= n; ++i) {
			System.out.println(first + ", ");
			int sum = first + second;
			first = second;
			second = sum;
		}
		//3
			for(char c = 'a'; c <= 'z'; ++c) {
				System.out.println(c);
			}
		//4	
			int num = 1234;
			int reversed = 0;
		while(num != 0) {
			int temp = num % 10;
			reversed = reversed * 10 + temp;
			num /=10;
		}
		
		System.out.println(num);
		//5
		int number=5;
		int var = number;
		for(int power = 3; power > 1; power--) {
			number *= var;
		}
	System.out.println(number);
		//6
		double[] arr = {1, 2, 3, 4, 5, 7};

		double ssum = 0;
		(for int k = 0; k <= arr.length; k++) {
			ssum += arr[k];
		}
		System.out.println("The average is " + (sum/arr.length));
		//7
		int[][] one = {{1,2}, {3,4}};
		int[][] two = {{2,4}, {6,8}};
		int[][] combo = new int[2][2];
		int sum = 0;
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i< 2; i++) {
				combo[i][j] = one[i][j] + two[i][j];
				sum += combo[i][j];
		}
	}
		System.out.println(combo[0][0] + " : " + combo[0][1] + "\n" + combo[1][0] + " : " + combo[1][1]);
		System.out.println(sum);
		//8
		String str;
			int vowel=0, cons=0, numbers=0, spaces=0;
				Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the String ");
			str=scan.nextLine();
			for(int i=0; i<=str.length()-1; i++) {
				char ch=str.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
					|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
					vowel++;
				}
				else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )) {
					cons++;
				}
				else if(ch >='0' && ch<='9') {
					numbers++;
				}
				else if(ch==' ') { // check spaces
					spaces++;
				}
			}
			System.out.println("\nVowels: " + vowel + "\nConsonants: " + cons + "\nDigits: " + numbers + "\nSpaces: " + spaces);
			
			//9
			int row = 5;
			for(int i =1; i <= row; ++i) {
				for(int j = 1; j <= 1; ++j) {
					System.out.println();
				}
			//10
			Scanner s = new Scanner(System.in);
			System.out.println("Input a sentence");
			String string = s.nextLine();
			
			String[] arrays = string.split(" ");
			System.out.println("The amount of words is: " + arrays.length);
			
			//11
			Scanner scanner = new Scanner(System.in);
			System.out.println("Input a sentence");
			String stri = s.nextLine();
			System.out.println("Input a character");
			char c = scanner.nextLine().charAt(0);
			char[] array = string.toCharArray();
			
			//12
			Scanner scr = new Scanner(System.in);
			System.out.print("Input a sentence");
			String st = scr.nextLine();
			String newSt = st.replaceAll(" ",  "");
			String[] arry = st.split(" ");
			System.out.println(newSt);
			//13
			Compute add = new Addition();
			UseCompute.useCom(add,  1,  2);
			Compute sub = new Subtraction();
			UseCompute.useCom(sub,  1,  2);
			Compute div = new Division();
			UseCompute.useCom(div,  1,  2);
			Compute mult = new Multiplication();
			UseCompute.useCom(mult, 1, 2);
			
			//14
			Cylinder cy1 = new Cylinder(1.5,2.5);
			System.out.println("The area is: " + cy1.area());
			System.out.println("The volume is: " + cy1.volume());
			cy1.setColor("Silver");
			System.out.println("The color is: " + cy1.color);

			//15
			int my_first=0; my_last=0; my_comma=0;
			String hello = "Hello, World!";
			char[] ch = hello.toCharArray();
			
			for(int i=0; i<ch.length; i++) {
				if(ch[i] == 'o') {
					my_last = i;
					break;
				}
			}
			for(int i = ch.length-1; i > 0; i--) {
				if(ch[i] == 'o') {
					my_last = i;
					break;
				}
			}
			for(int i = 0; i < ch.length; i++) {
				if(ch[i] == ',') {
					my_comma = i;
					break;
				}
			}
			System.out.println("The first o appears at index: " + my_first + "\nThe last o appears at index: " + my_last + "\nThe comma appears at index: " + my_comma);
			//16
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Input a sentence");
			String s = scan1.nextLine();
			int largestval = 0;
			String largestLetter = "";
			int acount, bcount, ccount, dcount, fcount, gcount, hcount, icount, jcount, kcount, lcount, mcount, ncount, ocount, pcount,qcount, rcount, scount, tcount,ucount, vcount, wcount, xcount,ycount, zcount;
			s = str.toLowerCase();
			acount = str.length() - str.replaceAll("a",  "").length();
			str = str.replaceAll("a",  "");
			if(acount > largestval) {
				largestval = acount;
				largestLetter = "a";
			}
			bcount = str.length() - str.replaceAll("b",  "").length();
			str = str.replaceAll("b",  "");
			if(bcount > largestval) {
				largestval = ccount;
				largestLetter = "b";
			}
			ccount = str.length() - str.replaceAll("c",  "").length();
			str = str.replaceAll("c",  "");
			if(ccount > largestval) {
				largestval = ccount;
				largestLetter = "c";
			}
			dcount = str.length() - str.replaceAll("d",  "").length();
			str = str.replaceAll("d",  "");
			if(dcount > largestval) {
				largestval = ccount;
				largestLetter = "d";
			}
			fcount = str.length() - str.replaceAll("f",  "").length();
			str = str.replaceAll("f",  "");
			if(fcount > largestval) {
				largestval = ccount;
				largestLetter = "f";
			}
			gcount = str.length() - str.replaceAll("g",  "").length();
			str = str.replaceAll("g",  "");
			if(gcount > largestval) {
				largestval = gcount;
				largestLetter = "g";
			}
			hcount = str.length() - str.replaceAll("h",  "").length();
			str = str.replaceAll("h",  "");
			if(gcount > largestval) {
				largestval = gcount;
				largestLetter = "h";
			}
			hcount = str.length() - str.replaceAll("h",  "").length();
			str = str.replaceAll("h",  "");
			if(gcount > largestval) {
				largestval = gcount;
				largestLetter = "h";
			}
			hcount = str.length() - str.replaceAll("h",  "").length();
			str = str.replaceAll("h",  "");
			if(hcount > largestval) {
				largestval = gcount;
				largestLetter = "h";
			}
			icount = str.length() - str.replaceAll("i",  "").length();
			str = str.replaceAll("i",  "");
			if(icount > largestval) {
				largestval = icount;
				largestLetter = "i";
			}
			jcount = str.length() - str.replaceAll("j",  "").length();
			str = str.replaceAll("",  "");
			if(jcount > largestval) {
				largestval = jcount;
				largestLetter = "j";
			}
			kcount = str.length() - str.replaceAll("k",  "").length();
				str = str.replaceAll("k",  "");
				if(kcount > largestval) {
					largestval = kcount;
					largestLetter = "k";
			}
			lcount = str.length() - str.replaceAll("l",  "").length();
			str = str.replaceAll("l",  "");
			if(lcount > largestval) {
				largestval = lcount;
				largestLetter = "l";
			}
			mcount = str.length() - str.replaceAll("m",  "").length();
			str = str.replaceAll("m",  "");
			if(mcount > largestval) {
				largestval = mcount;
				largestLetter = "m";
			}
			ncount = str.length() - str.replaceAll("n",  "").length();
			str = str.replaceAll("n",  "");
			if(ncount > largestval) {
				largestval = ncount;
				largestLetter = "n";	
			}
			ocount = str.length() - str.replaceAll("o",  "").length();
			str = str.replaceAll("o",  "");
			if(ocount > largestval) {
				largestval = ocount;
				largestLetter = "o";
			}
			pcount = str.length() - str.replaceAll("p",  "").length();
			str = str.replaceAll("p",  "");
			if(pcount > largestval) {
				largestval = pcount;
				largestLetter = "p";
			}
			qcount = str.length() - str.replaceAll("q",  "").length();
			str = str.replaceAll("q",  "");
			if(qcount > largestval) {
				largestval = qcount;
				largestLetter = "q";
			}
			rcount = str.length() - str.replaceAll("r",  "").length();
			str = str.replaceAll("r",  "");
			if(rcount > largestval) {
				largestval = rcount;
				largestLetter = "r";
			}
			scount = str.length() - str.replaceAll("s",  "").length();
			str = str.replaceAll("s",  "");
			if(scount > largestval) {
				largestval = scount;
				largestLetter = "s";
			}
			tcount = str.length() - str.replaceAll("t",  "").length();
			str = str.replaceAll("t",  "");
			if(tcount > largestval) {
				largestval = tcount;
				largestLetter = "t";
			}
			ucount = str.length() - str.replaceAll("u",  "").length();
			str = str.replaceAll("u",  "");
			if(ucount > largestval) {
				largestval = ucount;
				largestLetter = "u";
			}
			vcount = str.length() - str.replaceAll("v",  "").length();
			str = str.replaceAll("v",  "");
			if(vcount > largestval) {
				largestval = vcount;
				largestLetter = "v";
			}
			wcount = str.length() - str.replaceAll("w",  "").length();
			str = str.replaceAll("w",  "");
			if(wcount > largestval) {
				largestval = wcount;
				largestLetter = "w";
			}
			xcount = str.length() - str.replaceAll("x",  "").length();
			str = str.replaceAll("x",  "");
			if(xcount > largestval) {
				largestval = xcount;
				largestLetter = "x";
			}
			ycount = str.length() - str.replaceAll("y",  "").length();
			str = str.replaceAll("y",  "");
			if(ycount > largestval) {
				largestval = ycount;
				largestLetter = "y";
			}
			zcount = str.length() - str.replaceAll("z",  "").length();
			str = str.replaceAll("z",  "");
			if(zcount > largestval) {
				largestval = zcount;
				largestLetter = "z";
			}
			System.out.println("A:" + acount
							+"\nB:" + bcount
							+"\nC:" + ccount
							+"\nD:" + dcount
							+"\nE:" + ecount
							+"\nF:" + fcount
							+"\nG:" + gcount
							+"\nH:" + hcount			
							+"\nI:" + icount
							+"\nJ:" + jcount
							+"\nK:" + kcount	
							+"\nL:" + lcount
							+"\nM:" + mcount	
							+"\nN:" + ncount
							+"\nO:" + ocount
							+"\nP:" + pcount
							+"\nQ:" + qcount
							+"\nR:" + rcount
							+"\nS:" + scount
							+"\nT:" + tcount
							+"\nU:" + ucount
							+"\nV:" + vcount
							+"\nW:" + wcount
							+"\nX:" + xcount
							+"\nY:" + ycount
							+"\nZ:" + zcount
							
							);
			System.out.println("The largest letter is: " + largestLetter + "\nWith a total count of: "+ largestval);
			
			//17
			Scanner scnnr = new Scanner(System.in);
			System.out.println("Input a sentence");
			String stringer = scnnr.nextLine();
			
			char [] d = str.toCharArray();
			String rev = "";
			for(int i=0; i< d.length; i++) {
				rev = rev + d[i];
			}
			System.out.println(stringer);
			System.out.println(rev);
			if(rev.equals(stringer)) {
				System.out.println("Yep, its a Palindrome");
			} else {
				System.out.println("Nope, it's not a Palindrome");
			}
			//18
			String string1 = "This is an umbrella";
			
			String[] arrys = string1.split(" ");
			
			int smallestindex = 10;
			int smallest = 10;
			int largest = 0;
			int largestindex = 0;
			
			for(int i=0; i<arr.length;i++) {
				if(arrys[i].toCharArray().length <= smallest) {
						smallestindex = i;
						smallest = arrys[i].toCharArray().length;
				}
				if(arrys[i].toCharArray().length >= largest) {
					largestindex = i;
					largest = arrys[i].toCharArray().length;
				}
			}
			System.out.println("The smallest word is \"" + arr[smallestindex] + "\" excluding multiple words");
			System.out.println("The smallest word is \"" + arr[largestindex] + "\" excluding multiple words");
			
			//19
			String[] friends = {"Gary", "John", "David", "Amanda", "Braxton", "Elle", "Oni", "Nate", "Matt", "Omar"};
			Arrays.sort(friends);
			for(int l=0; l<friends.length; l++) {
				System.out.println(friends[l]);
			}
			
			try {
				int num1 = 0;
				int num2 = 2/num1;
				System.out.println(num2);
				System.out.println("I tried");
			}catch(ArithmeticException e) {
				System.out.println("well that killed it");
			}
		}
	}	
}