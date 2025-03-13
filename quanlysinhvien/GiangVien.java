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
public class GiangVien extends Person{
    private String MSCB;
    public GiangVien(){
        super();
        this.MSCB = "NULL";
    }
    public GiangVien(GiangVien gv){
        super(gv);
        this.MSCB = new String(gv.MSCB);
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so can bo: ");
        this.MSCB = sc.nextLine();
    }
    public void xuat(){
        System.out.println("----------------------------------");
//        System.out.println("Thong tin giang vien:");
        super.xuat();
        System.out.println("Ma so can bo: " + this.MSCB);
        System.out.println("----------------------------------");
    }
}