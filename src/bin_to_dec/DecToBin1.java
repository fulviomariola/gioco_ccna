package bin_to_dec;
//TO DO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//TO DO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//TO DO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


import java.util.Scanner;

public class DecToBin1 {
	//int n;

	public static void main(String[] args) {
        
        int count = 0;
        int a;
        int n;
            
        String x = "";
        
        // valori che inserisco
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero decimale: ");
        n = input.nextInt();
        
        
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
	
	
	/*
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	*/
	
	
}
