/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhocaycanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLy {

    ArrayList<CayCanh> caycanh = new ArrayList<>();
    ArrayList<DSNhapKho> nhapkho = new ArrayList<>();
    ArrayList<DSXuatKho> xuatkho = new ArrayList<>();
    ArrayList<ThongKe> thongke = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public QuanLy() {
        caycanh = new ArrayList<>();
        nhapkho = new ArrayList<>();
    }

    public void DScay(CayCanh a) {
        System.out.print("Nhap so luong can them: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ": ");
            if (a instanceof ThongKe) {
                a = new ThongKe();
                a.Nhap();
            } else if (a instanceof DSNhapKho) {
                a = new DSNhapKho();
                a.Nhap();
            } else if (a instanceof DSXuatKho) {
                a = new DSXuatKho();
                a.Nhap();
            }
            caycanh.add(a);
        }
    }

    public void menuSuaDoi() {
        System.out.println("-------------Moi ban lua chon -----------");
        System.out.println("1. thay doi thong tin nhap cay canh");
        System.out.println("2. Xoa thong tin nhap cay canh");
        System.out.println("3. thay doi thong tin xuat cay canh ");
        System.out.println("4. xoa thong tin xuat cay canh");
        System.out.println("5. thay doi thong tin Thong Ke");
        System.out.println("6.  xoa thong tin trong Thong Ke");
        System.out.println("7. Sap xep theo gia thanh");
        System.out.println("----------- Chon so 0 de thoat ----------");
    }

    public void SuaDoi() {

        int n;
        do {
            menuSuaDoi();
            System.out.println("Chon: ");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    String MaCC;
                    System.out.println("Nhap Ma cay  can sua: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    suaNhapkho(MaCC);
                }
                case 2 -> {
                    String MaCC;
                    System.out.println("Nhap ma cay can xoa: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    xoaNhapkho(MaCC);
                }
                case 3 -> {
                    String MaCC;
                    System.out.println("Nhap Ma cay can sua:");
                    input.nextLine();
                    MaCC = input.nextLine();
                    suaXuatkho(MaCC);
                }
                case 4 -> {
                    String MaCC;
                    System.out.println("Nhap ma cay can xoa: ");
                    input.nextLine();
                    MaCC = input.nextLine();
                    xoaXuatkho(MaCC);
                }
                case 5 -> {
                    System.out.println("Nhap ma cay canh can sua");
                    input.nextLine();
                    String MaCC = input.nextLine();
                    suaThongKe(MaCC);
                }
                case 6 -> {
                    System.out.println("Nhap ma cay canh can xoa");
                    input.nextLine();
                    String MaCC = input.nextLine();
                    xoaThongKe(MaCC);
                }
                default -> {
                }
            }
        } while (n != 0);
    }

    public void suaNhapkho(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof DSNhapKho) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    x.Nhap();
                }
            }
        }
    }

    public void xoaNhapkho(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof DSNhapKho) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }

    public void suaXuatkho(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof DSXuatKho) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    x.Nhap();
                }
            }
        }
    }

    public void xoaXuatkho(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof DSXuatKho) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }

    public void suaThongKe(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof ThongKe) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    x.Nhap();
                }
            }
        }
    }

    public void xoaThongKe(String MaCC) {
        for (CayCanh x : caycanh) {
            if (x instanceof ThongKe) {
                if (x.getMaCC().compareTo(MaCC) == 0) {
                    caycanh.remove(x);
                }
            }
        }
    }

    public void hienDS() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            x.Xuat();
        }
    }

    public void hienDSnhapkho() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            if (x instanceof DSNhapKho) {
                x.Xuat();
            }
        }
    }

    public void hienDSxuatkho() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            if (x instanceof DSXuatKho) {
                x.Xuat();
            }
        }
    }

    public void hienThongKe() {
        System.out.println("----------------------------------------------");
        for (CayCanh x : caycanh) {
            if (x instanceof ThongKe) {
                x.Xuat();
            }
        }
    }

    public void ghiFile(String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.flush();
            oos.writeObject(caycanh);
            oos.close();
            fos.close();
            System.out.println("Luu file thanh cong, ten file: " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void docFile(String fileName) {
        try {
            caycanh = new ArrayList<>();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin);
            caycanh = (ArrayList) fout.readObject();
            hienDS();
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.print("\nKhong thay file.\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void SapXep() {
        Collections.sort(nhapkho,(o1, o2) -> (int)(o1.getgiathanh()-o2.getgiathanh()));
    }

    public void timkiemXuatKho(String Macc) {
        for (CayCanh x : caycanh) {
            if (x instanceof DSXuatKho && ((DSXuatKho) x).getMaCC().equalsIgnoreCase(Macc) == true) {
                x.Xuat();
            }
        }
    }

    public void timkiemNhapKho(String Macc) {
        for (CayCanh x : caycanh) {
            if (x instanceof DSNhapKho && ((DSNhapKho) x).getMaCC().equalsIgnoreCase(Macc) == true) {
                x.Xuat();
            }
        }
    }

    public void menuChinh() {
        System.out.println("------QUAN LY CAY CANH------");
        System.out.println("1. NHAP KHO ");
        System.out.println("2. HIEN DANH SACH NHAP KHO ");
        System.out.println("3.XUAT KHO");
        System.out.println("4.HIEN DANH SACH XUAT KHO ");
        System.out.println("5.NHAP BANG THONG KE");
        System.out.println("6.HIEN BANG THONG KE");
        System.out.println("7. LUU FILE NHAP");
        System.out.println("8. DOC DU LIEU TU FILE");
        System.out.println("9.SUA DOI THONG TIN");
        System.out.println("10.SAP XEP THONG TIN");
        System.out.println("11.TIM KIEM CAY TRONG NHAP KHO");
        System.out.println("12.TIM KIEM CAY TRONG XUAT KHO");
        System.out.println("-----Nhan 0 de thoat chuong trinh-----");
    }
}
