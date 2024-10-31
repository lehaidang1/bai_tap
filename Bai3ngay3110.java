
package bai3ngay3110;

import java.util.Scanner;

public class Bai3ngay3110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" nhap mot so bat ki: ");
        if (sc.hasNextInt()){
            int input = sc.nextInt();
            System.out.println(" ban da nhap so: "+ input);
            
        }else{
            System.out.println(" ban da nhap khong phai la so.");
        }
        
    }
    
}
