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
public class SinhVien extends Person{
    private String MSSV;
    private float DTB;
    private myDate ngaynhaphoc;
    public SinhVien(){
        super();
        this.MSSV = "NULL";
        this.ngaynhaphoc = new myDate();        
    }
    public SinhVien(SinhVien sv){
        super(sv);
        this.MSSV = new String(sv.MSSV);
        this.ngaynhaphoc = new myDate(sv.ngaynhaphoc);
    }
    public boolean svnn(){
        return false;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap MSSV: ");
        this.MSSV = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        sc = new Scanner(System.in);
        this.DTB = sc.nextFloat();
        
    }
    @Override
    public void xuat(){
        System.out.println("----------------------------------");
//        System.out.println("Thong tin sinh vien:");
        super.xuat();
        System.out.println("MSSV: " + this.MSSV);
        System.out.println("Diem trung binh: " + this.DTB);
        System.out.println("----------------------------------");
    }
    public float getDTB(){
        return this.DTB;
    }
    public int sosanh(SinhVien sv){
        int check = 0;
        if(this.DTB < sv.DTB) check = -1;
        if(this.DTB > sv.DTB) check = 1;
        return check;
    }
}