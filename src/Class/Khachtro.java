package Class;

import java.util.Scanner;

public class Khachtro extends Nguoi {
    private int soNgaytro;
    private int loaiPhong;
    private double giaPhong;
    public Khachtro(){

    }

    public Khachtro(String hoTen, int tuoi, int soCMND, int soNgaytro, int loaiPhong, Double giaPhong) {
       this.hoTen=hoTen;
       this.tuoi=tuoi;
       this.soCMND=soCMND;
        this.soNgaytro = soNgaytro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }
    public void nhapThongtin(Scanner sc){
        super.nhapThongTinKhachTro(sc);
        System.out.println("\tNhap so ngay tro");
        soNgaytro=sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap loai phong");
        loaiPhong=sc.nextInt();
        System.out.println("\tNhap gia phong");
        giaPhong=sc.nextDouble();sc.nextLine();
    }
    public void hienThithongtin(){
        super.hienThiThongTinKhachTro();
        System.out.println("so ngay tro"  + soNgaytro);
        System.out.println("nhap loai phong" +loaiPhong);
        System.out.println("nhap gia phong " + giaPhong);
    }
    public int getSoNgaytro(){
        return soNgaytro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }
}

