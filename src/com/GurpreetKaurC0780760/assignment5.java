package com.GurpreetKaurC0780760;
import javax.swing.*;

/**
 * to run this program enter
 * username = gurpreet
 * password=12345
 */

public class assignment5 {
    public static void main(String[] args)
    {
        llcClasses test = new llcClasses("gurpreet","12345");
        //give user 3 tries
        for(int i =1; i<=3; i++) {
            if (test.checkUserCredentials()) {
                test.getFirstName();
                test.getLastName();
                test.getServices();
                test.getOptions();
                test.getItems();
                test.totalAmount();
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Username or password not match");
                if(i==3){
                    JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye.”");
                }
            }
        }
    }
}
