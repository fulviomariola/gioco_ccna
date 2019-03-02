package bin_to_dec;

import java.util.Scanner;

//DA RISOLVERE
public class BinToDec {
	
	
	
	public static void main(String[] args) {
		
		Scanner inseriscoBinario = new Scanner(System.in);
		int decimale=0;
		int p=0;
		
		
        System.out.println("Inserire un numero binario: ");
        int n = inseriscoBinario.nextInt();

        
        while(n!=0)
        {
            decimale+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
            
        }
        
        //System.out.println(decimale);
	}

	

}
