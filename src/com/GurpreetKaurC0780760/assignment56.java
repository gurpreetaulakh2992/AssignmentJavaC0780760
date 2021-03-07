package com.GurpreetKaurC0780760;

import javax.swing.*;

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
