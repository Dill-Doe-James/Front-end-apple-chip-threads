/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysinhvien;

/**
 *
 * @author student
 */
import java.util.Scanner;

public class LopHoc {

    private GiangVien gv;
    private SinhVien[] list;
    private int soluongsv;

    public LopHoc() {
        this.gv = new GiangVien();
        this.list = new SinhVien[100];
        this.soluongsv = 0;
    }

    public LopHoc(LopHoc room) {
        this.gv = new GiangVien(room.gv);
        this.list = new SinhVien[room.soluongsv];
        for (int i = 0; i < soluongsv; i++) {
            this.list[i] = new SinhVien(room.list[i]);
        }
    }

    public void nhap() {
//        System.out.println("Nhap thong tin giang vien:");
//        this.gv.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong sinh vien: ");
        this.soluongsv = sc.nextInt();
        sc = new Scanner(System.in);
        for (int i = 0; i < soluongsv; i++) {
            System.out.print("Is forgein? (y/n) ");
            String x = sc.nextLine();
            if (x.equals("n")) {
                System.out.println("Nhap thong tin sinh vien VN:");
                this.list[i] = new SinhVien();

            } else if (x.equals("y")) {
                System.out.println("Nhap thong tin sinh vien NN: ");
                this.list[i] = new SinhVienNN();

            }
            this.list[i].nhap();
        }
    }

    public void xuat() {
        for (int i = 0; i < soluongsv; i++) {
            this.list[i].xuat();
        }
    }

    public int getNumber() {
        return this.soluongsv;
    }

    public int getBirthday(int i) {
        return this.list[i].getYear();
    }

    public String getTinh(int i) {
        return this.list[i].getTinh();
    }

    public void xuat(int i) {
        this.list[i].xuat();
    }

    public void swap(SinhVien sv1, SinhVien sv2) {
        SinhVien temp = new SinhVien(sv1);
        sv1 = new SinhVien(sv2);
        sv2 = new SinhVien(temp);
    }

    public void sapxepDTB() {
        for (int i = 0; i < this.soluongsv; i++) {
            for (int j = i + 1; j < this.soluongsv; i++) {
                if (list[i].sosanh(list[i + 1]) == 1) {
                    swap(list[i], list[i + 1]);
                }
            }
        }
    }

}
