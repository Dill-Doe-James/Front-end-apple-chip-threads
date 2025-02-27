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
public class SinhVien extends Person {
    private String MSSV;
    private Mydate registerDate;
    public SinhVien(){
        super();
        this.MSSV = new String("00000");
        this.registerDate = new Mydate();
    }
    public SinhVien(SinhVien sv){
        super(sv);
        this.MSSV = new String(sv.MSSV);
        this.registerDate = new Mydate(sv.registerDate);
    }
    @Override
    public void nhap(){                
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap MSSV: ");
        this.MSSV = sc.nextLine();
        System.out.println("Ngay nhap hoc: ");
        this.registerDate.nhap();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("MSSV: " + this.MSSV);
        System.out.print("Ngay nhap hoc: ");
        this.registerDate.xuat();
    }
    @Override
    public String toString(){
       return  "Ho va ten: " + this.getName()+ "\nMSSV: " + this.MSSV +
                    "\nNgay nhap hoc: " +this.registerDate.toString();
    }
}