package projekt;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner=new Scanner(System.in);
	      System.out.print("Shenoje numrin : ");
	      int num=scanner.nextInt();
	      
	       
	       //pjestimi  me 2
	      if (num % 2 == 0) {
		      System.out.println("2 plotpjeston " + num + "? True");
		    } else {
		      System.out.println("2 plotpjeston " + num + "? False");
		    }

		    // pjestimi me 3
		    if (num % 3 == 0) {
		      System.out.println("3 plotpjeston " + num + "? True");
		    } else {
		      System.out.println("3 plotpjeston " + num + "? False");
		    }

		    // pjestimi me 5
		    if (num % 5 == 0) {
		      System.out.println("5 plotpjeston " + num + "? True");
		    } else {
		      System.out.println("5 plotpjeston " + num + "? False");
		    }

		    // pjestimi me 7
		    if (num % 7 == 0) {
		      System.out.println("7 plotpjeston " + num + "? True");
		    } else {
		      System.out.println("7 plotpjeston " + num + "? False");
		    }

		  }

	
	}


