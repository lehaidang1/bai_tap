
package bai2ngay3110;

import java.util.Scanner;

public class Bai2ngay3110 {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in) ;
          System.out.print(" nhap mot chuoi: ");
          if (sc.hasNext()){
              String input = sc.nextLine();
              System.out.println(" ban da nhap chuoi: " + input);
          }else {
              System.out.println(" ban da nhap khong phai la chuoi: ");
          }
}
}