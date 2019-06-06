package work;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int check;
		System.out.println("Number 1-100");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number = ");
		int number = sc.nextInt();
		int x,y;
		
		for (x = 2; x <= number; x++) {
			
			check = 1;
			
			for (y = 2; y < x; y++) {
				
				if (x % y == 0)
					
					check = 0;
			
			}

			if (check == 1)
				
				System.out.print(x + " " );
				System.out.print("Total Prime number");
		}
	}
}
//
//
//	public static void main(String[] args) {
//		
//		
//		
//		int a ;
//		
//			
//			for(a = 1 ; a <= 100 ; a++) {
//				if(a % 3== 0  &&  a % 5==0)
//					System.out.println("FizzBuzz");
//					
//					else if( a % 3 == 0) {
//						System.out.println("fizz");
//					}else if (a % 5 == 0) {
//						System.out.println("Buzz");
//					}else {
//						System.out.println(a);
//					}
//				}
//			}
//		
//	}



