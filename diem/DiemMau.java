/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem;

/**
 *
 * @author student
 */
import java.util.Scanner;

public class DiemMau extends Diem{
    private String mau;
    public DiemMau(){
        super();
        this.mau = "NULL";
    }
    public DiemMau(int x, int y, String mau){
        super(x,y);
        this.mau = mau;
    }
    public void GanMau(String mau){
        this.mau = mau;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap mau: ");
        this.mau = sc.nextLine();
    }
    public void xuat(){        
        super.hienthi();
        System.out.println(": " + this.mau);
    }
}
