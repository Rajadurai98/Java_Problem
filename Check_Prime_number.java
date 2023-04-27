package program.org;

import java.util.Scanner;

public class Check_Prime_number {
	public static void main(String[] args) {
		int num=9, i=2, count=0;
		
		 
		 while(i<num)
		 {
		 if(num%i == 0)//f,f,,f,f,f
		 {
		 count++;
		 break; 
		 }
		 i++;
		 }
		 
		 if(count==0)
		 System.out.println("\n" +num+ " is a Prime Number.");
		 else
		 System.out.println("\n" +num+ " is not a Prime Number.");
		}
		}

