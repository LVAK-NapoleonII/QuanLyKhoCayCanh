/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhocaycanh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuanLy a = new QuanLy();
        CayCanh b;
        DSNhapKho c;
        int n;
        Scanner input = new Scanner(System.in);
        do {
            a.menuChinh();
            System.out.print(
                    "Lua chon: ");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    b = new DSNhapKho();
                    a.DScay(b);
                }
                case 2 -> {
                    a.hienDSnhapkho();
                }
                case 3 -> {

                    b = new DSXuatKho();
                    a.DScay(b);
                }
                case 4 -> {
                    a.hienDSxuatkho();
                }
                case 5 -> {
                    b = new ThongKe();
                    a.DScay(b);
                }
                case 6 -> {
                    a.hienThongKe();
                }
                case 7 -> {
                    String tenfile;
                    System.out.print("NHAP TEN FILE: ");
                    input.nextLine();
                    tenfile = input.nextLine();
                    a.ghiFile(tenfile);
                }
                case 8 -> {
                    String tenfile;
                    System.out.print("NHAP TEN FILE: ");
                    input.nextLine();
                    tenfile = input.nextLine();
                    a.docFile(tenfile);
                }

                case 9 -> {
                    a.SuaDoi();
                }
                case 10 -> {
                    a.SapXep();
                    c.Xuat();
                }
                case 11 -> {
                    String MaCC;
                    System.out.println("Nhap Ma cay can tim: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    a.timkiemNhapKho(MaCC);
                }
                case 12->{
                    String MaCC;
                    System.out.println("Nhap Ma cay can tim: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    a.timkiemXuatKho(MaCC);
                }
                default -> {
                }
            }
        } while (n != 0);
    }

}
