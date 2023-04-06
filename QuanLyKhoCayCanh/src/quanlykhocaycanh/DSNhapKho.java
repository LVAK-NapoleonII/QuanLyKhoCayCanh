/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhocaycanh;

import java.util.Scanner;

public class DSNhapKho extends CayCanh {

    private double giathanh;

    public DSNhapKho(double giathanh, String MaCC, String tencay, String phanloai, double soluong, int ngay, int thang, int nam) {
        super(MaCC, tencay, phanloai, soluong, ngay, thang, nam);
        this.giathanh = giathanh;
    }    
    public DSNhapKho(){
        super();
    }
    public double getgiathanh() {
        return giathanh;
    }
    public void setgiathanh(double giathanh) {
        this.giathanh = giathanh;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner input = new Scanner(System.in);
        System.out.print("gia nhap vao cua cay : ");
        giathanh = input.nextDouble();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("| Gia Nhap: " + getgiathanh()+"|");
    }
}