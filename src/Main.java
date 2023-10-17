/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.ShapeItem;
import java.util.ArrayList;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        String title = "SHAPE MANAGERMENT ";
        String[] s = new String[]{"RECTANGLE", "TRIANGLE",
            "CIRCLE","Exit"};
        Menu<String> menu = new ShapeItem(title, s);
        menu.run();
    }
}
