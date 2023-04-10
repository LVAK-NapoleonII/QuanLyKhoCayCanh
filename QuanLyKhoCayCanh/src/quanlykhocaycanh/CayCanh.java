/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlykhocaycanh;

import java.util.Scanner;
import java.io.Serializable;

import java.io.Serializable;

public class CayCanh implements Serializable {

    String MaCC, tencay, phanloai;
    double soluong;
    int ngay, thang, nam;

    public CayCanh(String MaCC, String tencay, String phanloai, double soluong, int ngay, int thang, int nam) {
        this.tencay = tencay;
        this.phanloai = phanloai;
        this.MaCC = MaCC;
        this.soluong = soluong;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public CayCanh() {
    }

    public String gettencay() {
        return tencay;
    }

    public void settencay(String tencay) {
        this.tencay = tencay;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getsoluong() {
        return soluong;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

     public void ThoiGian() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Nhap thang: ");
            thang = input.nextInt();
            System.out.println("Nhap nam: ");
            nam = input.nextInt();
            if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
                do {
                    System.out.println("Nhap ngay: ");
                    ngay = input.nextInt();
                } while (ngay > 31 || ngay < 0);
            }
            if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                do {
                    System.out.println("Nhap ngay: ");
                    ngay = input.nextInt();
                } while (ngay > 30 || ngay < 0);
            }
            if (thang == 2) {
                do {
                    System.out.println("Nhap ngay: ");
                    ngay = input.nextInt();
                } while (ngay > 28 || ngay < 0);
            }
        } while (thang < 0 || thang > 12 || nam < 0);
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ten Cay:");
        tencay = input.nextLine();
        System.out.println("Nhap Loai Cay:");
        phanloai = input.nextLine();
        System.out.println("Nhap Ma Cay:");
        MaCC = input.nextLine();
        System.out.println("Nhap So Luong Cay ");
        soluong = input.nextInt();
        ThoiGian();
    }

    public void Xuat() {
        System.out.println("-----| Ma Cay Canh: " + getMaCC() + "|" + "| Ten Cay: " + gettencay() + "| Phan Loai: " + getPhanloai() + "| soluong: " + getsoluong() + "| Thoi gian: " + ngay + "|" + thang + "|" + nam + "|----");
    }
}
