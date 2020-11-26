package Class;

import java.util.ArrayList;
import java.util.Scanner;

class KhachSan {
   private ArrayList<Khachtro> ds;
   public KhachSan(){
       ds=new ArrayList<Khachtro>(10);
   }
   public void themKhachtro(Khachtro kt){

       ds.add(kt);
   }
   public void nhapDanhsach(Scanner sc){
       Khachtro khach;
       System.out.print("nhap so luong khach");
       int n=sc.nextInt();
       sc.nextLine();
       System.out.println("nhap vao thong tin khach tro");
       for (int i=0;i<n;i++){
           System.out.println("khac tro thu " +(i+1)+"la");
           khach=new Khachtro();
           khach.nhapThongtin(sc);
           themKhachtro(khach);
       }
   }
   public void hienthidanhsach(){
       for (Khachtro khach :ds){
           khach.hienThithongtin();
       }

   }
   public double tinhtien(int CMND){
       double tien=0;
       for (Khachtro khach:ds){
          if (khach.getCMND()==CMND){
              tien=khach.getSoNgaytro()*khach.getGiaPhong();
          }
       }
       return tien;
   }
}

