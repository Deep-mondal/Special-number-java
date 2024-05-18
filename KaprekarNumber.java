package specialNumber;

import java.util.Scanner;

public class KaprekarNumber {
	static int pow(int x,int n) {
		//return x*x;
		for(int i=1;i<n;i++)
			x=x*x;
		return x;
	}
	static int count(int x) {
		int digit;int n=x,c=0;
		while(n>0) {
			digit=n%10;
			c++;
			n=n/10;
		}
		return c;
	}
	static boolean kaprekar(int x) {
		int p=pow(x,2);
		int limit=count(p);
		int demo,digit;
		for(int i=limit;i>=1;i--) {
			digit=p%(pow(10,i-1));
			demo=p/(pow(10,i-1));
			if(demo+)
		}
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number=in.nextInt();
		boolean res=mystery(number);
		if(res==true)
			System.out.print("YES");
		else 
			System.out.print("NO");
		in.close();

	}

}
