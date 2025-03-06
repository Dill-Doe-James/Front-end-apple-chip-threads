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
    private SinhVien[] sv;
    private int soluongsv;
    private SinhVienNN[] svnn;
    private int soluongsvnn;

    public LopHoc() {
        this.gv = new GiangVien();
        this.sv = new SinhVien[100];
        this.svnn = new SinhVienNN[100];
        this.soluongsv = 0;
        this.soluongsvnn = 0;           
    }

    public LopHoc(LopHoc room) {
        this.gv = new GiangVien(room.gv);
        this.sv = new SinhVien[room.soluongsv];
        this.svnn = new SinhVienNN[room.soluongsvnn];
        for (int i = 0; i < soluongsv; i++) {
            this.sv[i] = new SinhVien(room.sv[i]);
        }
        for (int i = 0; i < soluongsvnn; i++) {
            this.svnn[i] = new SinhVienNN(room.svnn[i]);
        }
    }

    public void nhap() {
//        System.out.println("Nhap thong tin giang vien:");
//        this.gv.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong sinh vien: ");
        this.soluongsv = sc.nextInt();
        this.soluongsvnn = 0;
        for (int i = 0; i < soluongsv; i++) {
            System.out.print("Is forgein? (y/n) ");
            String x = sc.nextLine();
            if (x.equals("n")) {
                System.out.println("Nhap thong tin sinh vien VN:");
                this.sv[i] = new SinhVien();
                this.sv[i].nhap();
            }
            else if(x.equals("y")){
                System.out.println("Nhap thong tin sinh vien NN: ");
                this.svnn[this.soluongsvnn] = new SinhVienNN();
                this.svnn[this.soluongsvnn].nhap();
                this.soluongsv++;
            }
        }
    }
    public int getNumber(){
        return this.soluongsv;
    }
    public int getNumberNN(){
        return this.soluongsvnn;
    }
    public int getBirthday(int i){
        return this.sv[i].getYear();
    }
    public int getBirthdayNN(int i){
        return this.svnn[i].getYear();
    }
    public void xuat(int i){
        sv[i].xuat();
    }
    public void xuatNN(int i){
        svnn[i].xuat();
    }
}
