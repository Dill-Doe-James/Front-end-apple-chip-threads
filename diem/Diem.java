/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diem;

/**
 *
 * @author student
 */
import java.util.Scanner;

class Diem {

    private int x;
    private int y;
    public Diem(){
        this(0,0);
    }
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("x = ");
        this.x = sc.nextInt();
        System.out.println("y = ");
        this.y = sc.nextInt();
    }

    public void hienthi() {
        System.out.print("(" + x + "," + y + ")");
    }

    public void doidiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int giatriX() {
        return x;
    }

    public int giatriY() {
        return y;
    }

    public float khoangcach() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float khoangcach(Diem d) {
        float a = (float) (x - d.x);
        float b = (float) (y - d.y);
        return (float) Math.sqrt(a * a + b * b);
    }
}

