package logically;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bil;
        int a = 0;
        int sum = 0;
        int i = a;
        
        System.out.println("MENGHITUNG TOTAL PENJUMLAHAN DARI ANGKA 1-N");
        System.out.println("===========================================\n ");
        System.out.print("Masukan Bilangan    : ");
        bil = input.nextInt();
        
         while (i <= bil) {
           sum = sum + i;
           i++;
          }
         System.out.println("====================> " + sum);   
    }
}
