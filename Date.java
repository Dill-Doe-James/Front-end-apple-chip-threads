/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package date;
import java.util.Scanner;
public class Date {

    private int ngay, thang, nam;

    public Date() {
        this(0, 0, 0);
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void hienthi() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    boolean hople() {
        if (ngay < 1 || ngay > 31 || thang < 1 || thang > 12 || nam < 0) {
            return false;
        }
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                if (ngay > 31) {
                    return false;
                }
            }
            case 2: {
                if (nam % 4 == 0 && nam % 100 != 0) {
                    if (ngay > 29) {
                        return false;
                    }
                }
                if (ngay > 28) {
                    return false;
                }
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                if (ngay > 30) {
                    return false;
                }
            }
        }
        return true;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        }while(!hople());        
    }
    
}
