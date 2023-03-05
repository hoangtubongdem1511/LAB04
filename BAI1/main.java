/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Cylinder cylinder = new Cylinder(2.4, "red", 10);

        System.out.print("Nhap radius:");
        cylinder.setRadius(sc.nextDouble());
        
        System.out.print("Nhap color:");
        cylinder.setColor(sc.next());
        
        System.out.print("Nhap height:");
        cylinder.setHeight(sc.nextDouble());
        
        System.out.println("Color " + cylinder.getColor());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());

    }
}
