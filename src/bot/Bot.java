/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot;

/**
 *
 * @author junio
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;


public class Bot {
    
    private static Robot robot = null;
    
    public static void main(String[] args) {
       try{
           robot = new Robot();
       } catch (AWTException ex) {
            System.out.println("Errou");
            ex.printStackTrace();
        }
       java.awt.event.KeyEvent evt;
        int i=200;
       while(true){
       click(550,670,i);
            i+=50;
       if(i==450){
           i=200;
       }
       }
    }
    
    public static void click(int x, int y,int z){
        System.out.println("EXECUTE");
        robot.mouseMove(x, y);
        robot.delay(2000);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
    }

    
}
