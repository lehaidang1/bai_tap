
package bai1ngay3110;

import java.util.Scanner;

public class Bai1ngay3110 {

    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
      String ten;
      System.out.println(" nhap ten: ");
      ten = sc.nextLine();
      
      System.out.println(" nhap tuoi: ");
      int tuoi = sc.nextInt();
      
      String gioitinh;
      System.out.println(" nhap giơi tinh: ");
      gioitinh = sc.nextLine();
      
      String chuyennganh;
      System.out.println(" nhap chuyen nganh dang hoc: ");
      chuyennganh = sc.nextLine();
      
      System.out.println(" nhap GPA: ");
      int GPA = sc.nextInt();
      
      String quequan;
      System.out.println(" nhap que quan: ");
      quequan = sc.nextLine();
      
      System.out.println("ten: " + ten);
      System.out.println("tuoi: " + tuoi);
      System.out.println("gioi tinh: " + gioitinh);
      System.out.println("chuyen nganh: " + chuyennganh);
      System.out.println("GPA: " + GPA);
      System.out.println("que quan: " + quequan);
    }
    
}
