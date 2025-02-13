/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gach;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class SDGach {

    public static Gach min(Gach[] G) {
        float min = G[0].gia() / (float) (G[0].dienTich());
        int save = 0;
        float A[];
        A = new float[G.length];
        for (int i = 1; i < G.length; i++) {
            A[i] = G[i].gia() / (long) (G[i].dienTich());
            if (A[i] < min) {
                min = A[i];
                save = i;
            }
        }
        return G[save];
    }
    public static void chiPhi(Gach G){
        System.out.println(G.gia()*G.soLuongHop(500,2000));
    }
    public static void main(String[] args) {
        int n, i;
        System.out.println("Nhap so loai gach: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Gach G[];
        G = new Gach[n];
        for (i = 0; i < n; i++) {
            G[i] = new Gach();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Gach thu " + (i+1));
            G[i].nhap();
        }
//        for (i = 0; i < n; i++) {
//            G[i].hienthi();
//        }
        Gach pick = new Gach();
        pick = min(G);
        System.out.println("Gach co chi phi lot thap nhat : ");
        pick.hienthi();
        for(i = 0;i<n;i++){
            System.out.println("chi phi loai gach thu " + (i+1));
            chiPhi(G[i]);
        }
    }
}
