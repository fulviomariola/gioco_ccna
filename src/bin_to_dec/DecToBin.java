package bin_to_dec;
//TO DO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//TO DO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//TO DO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci un numero decimale: ");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Numero binario: "+x);
        System.out.println("Numero di 1: "+count);

	}

}
