/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package earl2day.javapos_testapp;
import java.util.logging.Level;
import java.util.logging.Logger;
import jpos.CashDrawer;
import jpos.JposException;

/**
 *
 * @author ea185039
 */
public class JavaPOS_TestApp {

    public static void main(String[] args) {
        CashDrawer cd = new CashDrawer();
        try {
            cd.open("cd001");
        } catch (JposException ex) {
            Logger.getLogger(JavaPOS_TestApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
