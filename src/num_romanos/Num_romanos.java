package num_romanos;

import java.util.Scanner;

public class Num_romanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int num;
		int i;
		int div;
		int resto;
		
		System.out.println("Indica un número: ");
		num= leer.nextInt();
		
		System.out.println("Número romano: ");
		if (num<4000) {
			if (num>=1000) {
				div=num/1000;
				resto=num%1000;
			
				for (i=0;i<div;i++) {
					System.out.print("M");
				}
				num=resto;
			}
			
			if (num>=900) {
				div=num/900;
				resto=num%900;
			
				for (i=0;i<div;i++) {
					System.out.print("CM");
				}
				num=resto;
			}
				
			if (num>=500) {
				div=num/500;
				resto=num%500;
				
				for (i=0;i<div;i++) {
					System.out.print("D");
				}
				num=resto;
			}
			
			if (num>=400) {
				div=num/1000;
				resto=num%1000;
			
				for (i=0;i<div;i++) {
					System.out.print("CD");
				}
				num=resto;
			}
					
			if (num>=100) {
				div=num/100;
				resto=num%100;
					
				for (i=0;i<div;i++) {
					System.out.print("C");
				}
				num=resto;
			}
			
			if (num>=90) {
				div=num/90;
				resto=num%90;
			
				for (i=0;i<div;i++) {
					System.out.print("XC");
				}
				num=resto;
			}
			
			if (num>=50) {
				div=num/50;
				resto=num%50;
						
				for (i=0;i<div;i++) {
					System.out.print("L");
				}
				num=resto;
			}
			
			if (num>=40) {
				div=num/40;
				resto=num%40;
			
				for (i=0;i<div;i++) {
					System.out.print("XL");
				}
				num=resto;
			}
							
			if (num>=10) {
				div=num/10;
				resto=num%10;
							
				for (i=0;i<div;i++) {
					System.out.print("X");
				}
				num=resto;
			}
			
			if (num>=9) {
				div=num/9;
				resto=num%9;
			
				for (i=0;i<div;i++) {
					System.out.print("IX");
				}
				num=resto;
			}
								
			if (num>=5) {
				div=num/5;
				resto=num%5;
								
				for (i=0;i<div;i++) {
					System.out.print("V");
				}
				num=resto;
			}
			
			if (num>=4) {
				div=num/4;
				resto=num%4;
			
				for (i=0;i<div;i++) {
					System.out.print("IV");
				}
				num=resto;
			}
				
			if (num>=1) {
				div=num/1;
				resto=num%1;
									
				for (i=0;i<div;i++) {
					System.out.print("I");
				}
				num=resto;
			}
		}else {
			System.out.println("ERROR");
		}
		
	
	}

}

