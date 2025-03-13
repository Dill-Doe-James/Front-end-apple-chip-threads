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
public class SinhVienNN extends SinhVien {
    private String nation;
    public SinhVienNN(){
        super();
        this.nation = "NULL";
    }
    public SinhVienNN(SinhVienNN sv){
        super(sv);
        this.nation = sv.nation;
    }
    @Override
    public boolean svnn(){
        return true;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap quoc tich: ");
        this.nation = sc.nextLine();
    }
    @Override
    public void xuat(){
        System.out.println("----------------------------------");
        super.xuat();
        System.out.println("Quoc tich: " + nation);
        System.out.println("----------------------------------");
    }
}
