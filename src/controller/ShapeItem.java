/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import model.ShapeManager;
import model.Circle;
import model.Rectangle;
import static model.ShapeManager.inputCircle;
import static model.ShapeManager.inputRectangle;
import static model.ShapeManager.inputTriangle;
import model.Triangle;
/**
 *
 * @author Admin
 */
public class ShapeItem extends Menu<String>{
    
    public ShapeItem(String td, String[] mc) {
        super(td, mc);
    }
    @Override
    public void execute(int n) {
        switch (n) {
                case 1:
                    ShapeManager.inputRectangle();
//                  ShapeManager.displayRec(rectangle);
             
                    break;
                case 2:
                    ShapeManager.inputTriangle();
//                    ShapeManager.displayTri(triangle);
                    break;
                case 3:
                    ShapeManager.inputCircle();
//                    ShapeManager.displayCir(circle);
                    break;
                case 4:
                    return;      
        }
    }
    
}

