package bin_to_dec;

import java.util.Scanner;

//appo::cjndcsdc
public class BinToDec {
	private int binary;
	
	public static void main(String[] args) {
		BinToDec trasf = new BinToDec();
		Scanner bin = new Scanner(System.in);
		int decimale=0;
		int p=0;
		
		
        System.out.println("Enter a binary number:");
        int n=bin.nextInt();

        // Stampo scanner
        System.out.println("elemento n = " + n);
        
        while(n!=0)
        {
            decimale+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
        
        System.out.println(decimale);
		
		
		
		
		
	/*	
		int numero;
		int test;
		

		System.out.println("inserisci binario: ");
		test = bin.nextInt();

		
		int appo = test%10;
		
		System.out.println(test);
		//System.out.println(appo*Math.pow(2,0));
		
		
		do 
		{		
		  System.out.println("inserisci binario: ");
		  
		  // insert binary number
		  numero = bin.nextInt();

		  // transform from binary number to decimal number
		  trasf.setBinary(numero);
	  
	  // show decimal number
	  System.out.println(trasf.getBinary());
	}
		while(numero!=0);

		// closing "bin" object
		bin.close();
		
	}

	// Prendo i numero in binario
	public int getBinary() {
		return binary;
	}

	// Trasformo i numeri da bianrio a decimale
	public void setBinary(int binary) {
		
		binary = binary/10;
		this.binary = binary;
	*/
	}
	

}
