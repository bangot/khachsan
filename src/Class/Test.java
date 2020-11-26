package Class;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhachSan ql=new KhachSan();
        ql.nhapDanhsach(sc);
        System.out.println("nhap so cmnd khach tra phong");
        int cmnd=sc.nextInt();
        System.out.println("tong so ten la"+ql.tinhtien(cmnd));


    }

}