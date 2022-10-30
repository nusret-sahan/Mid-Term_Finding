package csd;

import java.util.Scanner;

class App {

	public static void main(String[] args) 
	{
		for (;;)
			NumberUtilTest.run();
	}

}


class NumberUtilTest {
	public static void run() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Üç tane sayı giriniz:");
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		System.out.printf("Bu üç sayının ortancası = %d%n", NumberUtil.mid(a, b, c));
	}
}

class NumberUtil {
	public static int mid(int a, int b, int c)
	{
		if (b <= a && a <= c || c <= a && a <= b)
        	return a;
		
		else if (a <= b && b <= c || c <= b && b <= a)
            return b;
         
        else
        	return c;	
	}
}