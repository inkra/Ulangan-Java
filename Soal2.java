package logically;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bil;
        System.out.println("MENENTUKAN BILANGAN GANJIL / GENAP");
        System.out.println("=================================== ");
        System.out.print("Masukan Bilangan    = ");
        bil = input.nextInt();
        
        if (bil % 2==0){
            System.out.println("\nBilangan "+ bil +" adalah bilangan genap");
        }else {
             System.out.println("\nBilangan "+ bil +" adalah bilangan ganjil");
        }
    
    }
}
