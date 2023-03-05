/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class Cylinder extends Circle {
    public double height;
    
    public Cylinder(double radius , String color , double height){
        super(radius , color);
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getVolume(){
        return super.getArea()*height;
    }
}
