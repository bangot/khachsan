package Class;


import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int soCMND;
    protected int tuoi;

    public  Nguoi() {

    }

    public Nguoi(String hoTen, int tuoi, int soCMND) {

        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCMND = soCMND;
    }

    public int getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public void nhapThongTinKhachTro(Scanner sc) {

        System.out.print("Nhập họ tên khách hàng: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuoi: ");
        tuoi= sc.nextInt();
        System.out.print("Nhập số chứng minh nhân dân: ");
        soCMND = sc.nextInt();
    }

    public void hienThiThongTinKhachTro() {
        System.out.println("Họ và tên khách hàng: " + hoTen);
        System.out.println("tuoi: " + tuoi);
        System.out.println("Số chứng minh nhân dân: " + soCMND);
    }
    public int getCMND(){

        return soCMND;
    }
}
