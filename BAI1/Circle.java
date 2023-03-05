/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class Circle {
    public double radius;
    public String color;
    
    public Circle(double radius , String color) {
        this.color = color;
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return radius*radius*3.14;
    }
    
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
    
}
