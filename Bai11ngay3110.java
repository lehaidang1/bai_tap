
package bai1.pkg1ngay3110;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bai11ngay3110 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        String ten;
      System.out.print(" nhap ten: ");
      ten = sc.nextLine();
      
        System.out.print(" nhap ngay thang nam sinh: ");
        String birthdayString = sc.nextLine();
        Date birthday = sdf.parse(birthdayString);  
        
        String gioitinh;
      System.out.print(" nhap giơi tinh: ");
      gioitinh = sc.nextLine();
      
      String chuyennganh;
      System.out.print(" nhap chuyen nganh dang hoc: ");
      chuyennganh = sc.nextLine();
      
      System.out.print(" nhap GPA: ");
      int GPA = sc.nextInt();
      
      String quequan;
      System.out.print(" nhap que quan: ");
      sc.nextLine();
      quequan = sc.nextLine();
      System.out.println("  ");
      System.out.println("  ");      
      System.out.println(" == Thong tin sinh vien == ");
      System.out.println("ten: " + ten);
      System.out.println(" ngay thang nam sinh: " + sdf.format(birthday));
      System.out.println("gioi tinh: " + gioitinh);
      System.out.println("chuyen nganh: " + chuyennganh);
      System.out.println("GPA: " + GPA);
      System.out.println("que quan: " + quequan);
    }
    
}
