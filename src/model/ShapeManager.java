/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
import common.Validation;
import static common.Validation.checkInputDouble;
/**
 *
 * @author THAYCACAC
 */
public class ShapeManager {

    private static final Scanner in = new Scanner(System.in);


    public static Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                Triangle triangle= new Triangle(a,b,c); // Tạo đối tượng Rectangle
                displayTri(triangle); // Gọi hàm để hiển thị thông tin
                return triangle;
            } else {
                System.out.println("Re-input");
            }
        }
    }

    public static Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = checkInputDouble();
        Rectangle rectangle = new Rectangle(width, length); // Tạo đối tượng Rectangle
        displayRec(rectangle); // Gọi hàm để hiển thị thông tin
        return rectangle; // Trả về đối tượng Rectangle
    }

    public static Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = checkInputDouble();
        Circle circle = new Circle(radius); // Tạo đối tượng Rectangle
        displayCir(circle); // Gọi hàm để hiển thị thông tin
        return circle;
    }

    public static void displayRec(Rectangle rectangle) {
        rectangle.printResult();
    }
    public static void displayTri(Triangle trigle) {
        
        trigle.printResult();
    }
    public static void displayCir( Circle circle) {
        circle.printResult();
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = inputRectangle();
//        Circle circle = inputCircle();
//        Triangle trigle = inputTriangle();
//
//        display(trigle, rectangle, circle);
//    }
}