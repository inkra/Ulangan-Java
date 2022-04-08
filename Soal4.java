package logically;
import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
     public static void main(String[] args) {
        int i, jumlah, bil[];
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("MENENTUKAN NILAI MAKSIMUM DARI BILANGAN2");
        System.out.println("======================================== \n");
        System.out.print("Masukkan jumlah elemen : ");
        jumlah = scan.nextInt();
        bil = new int[jumlah];
    
        System.out.println("Masukkan "+jumlah+" angka");
        for(i = 0; i < jumlah; i++) {
          System.out.print("Elemen ke-"+ (i+1) +"            : " );
          bil[i] = scan.nextInt();
        }
        
        String arr = Arrays.toString(bil);
        System.out.println("\nElemen-elemen array yang dimasukkan: " + arr);
    
        System.out.print("Bilangan Genap                     :  ");
        for (i = 0; i < jumlah; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil                    :  ");
        for (i = 0; i < jumlah; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }      
        System.out.println("");
    }
}
