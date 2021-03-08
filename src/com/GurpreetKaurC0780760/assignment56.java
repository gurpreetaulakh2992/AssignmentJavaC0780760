package com.GurpreetKaurC0780760;

/**
 * @author Gurpreet
 * To run this program enter username gurpreet
 * password-12345
 */

public class assignment56 {
    public static void main(String[] args) {
        movingClass moving=new movingClass();
        boolean isValid= moving.checkUserCredentials();
        if (isValid) { // if password is matched then option menu for user to select
            moving.getFirstName();
            moving.getLastName();
            moving.getServiceCost();
            moving.getOptionCost();
            moving.getItemsCost();
            moving.calculateTotal();
        }

    }
}
