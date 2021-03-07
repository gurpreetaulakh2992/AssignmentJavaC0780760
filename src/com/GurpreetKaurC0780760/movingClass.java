package com.GurpreetKaurC0780760;

import javax.swing.*;

public class movingClass {
    private float serviceCost;
    private float optionCost;
    private float itemsCost;
    private float totalCost;
    private int days;
    private float hours;
    private int box;

    //Variable for first and last name
    private String firstName;
    private String lastName;

    //empty constructor
    public movingClass(){
    }

    //constructor overloading
    public movingClass(float serviceCost,float optionCost,float itemsCost,int days,float hours,int box){
        this.serviceCost = serviceCost;
        this.optionCost = optionCost;
        this.itemsCost = itemsCost;
        this.days = days;
        this.hours = hours;
        this.box = box;
    }

    //get user first and last name
    public String getFirstName() {
        firstName = JOptionPane.showInputDialog(null, "Please enter your first name");
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        lastName = JOptionPane.showInputDialog(null, "Please enter your last name");
        return lastName;
    }
    public void setLastName(String firstName) {
        this.lastName = lastName;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    // service cost
    public float getServiceCost() {
        String servicePackage = JOptionPane.showInputDialog("Choose Service Package:\n" +
                "Enter 1 for Package A - $100/hr\n" +
                "Enter 2 Package B – $150/hr\n" +
                "Enter 3 to skip");
        if (servicePackage.equals("1")) {
            serviceCost = 100.0f;

        } else if (servicePackage.equals("2")) {
            serviceCost = 150.0f;
        }
        else if (servicePackage.equals("3"))
        {
            serviceCost =0;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid selection");
        }
        if(servicePackage.equals("1") || servicePackage.equals("2")) {
            this.hours = Float.parseFloat(JOptionPane.showInputDialog("Enter number of hours: "));
        }
        serviceCost = serviceCost*this.hours;
        System.out.println("Service cost is "+serviceCost);
        return serviceCost;
    }

    public void setServiceCost(float serviceCost) {
        this.serviceCost = serviceCost;
    }
    //getter and setter for days

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //option Cost

    public float getOptionCost() {
        String storageOptions = JOptionPane.showInputDialog("Choose options:\nEnter 1 for Storage Small – $8/day" +
                "\n" +"Enter 2 Storage Large – $20.11/day\n " +
                "Enter 3 to skip");
        if (storageOptions.equals("1")) {
            optionCost = 8;
        } else if (storageOptions.equals("2")) {
            optionCost = 20.11f;
        }
        else if (storageOptions.equals("3")) {
            optionCost = 0;
        }
        if(storageOptions.equals("1") || storageOptions.equals("2")) {
            this.days = Integer.parseInt(JOptionPane.showInputDialog("Enter number of days: "));
        }
        optionCost = optionCost * this.days;
        System.out.println("options cost is "+optionCost);
        return optionCost;
    }

    public void setOptionCost(float optionCost) {
        this.optionCost = optionCost;
    }

    //item cost and boxes getter and setter

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public float getItemsCost() {
        String boxItems = JOptionPane.showInputDialog("Choose Items:\nEnter 1 for Boxes small - $2.50/per box" +
                "\n" + "Enter 2 Boxes large - $4.50/ per box\n " +
                "Enter 3 to skip");
        if (boxItems.equals("1")) {
            itemsCost = 2.50f;
        }else if (boxItems.equals("2")) {
            itemsCost = 4.50f;
        }else if (boxItems.equals("3")) {
            itemsCost = 0;
        }
        if(boxItems.equals("1") || boxItems.equals("2")) {
            this.box = Integer.parseInt(JOptionPane.showInputDialog("Enter number of boxes: "));
        }
        itemsCost = itemsCost*box;
        System.out.println("Item cost is"+itemsCost);
        return itemsCost;
    }

    public void setItemsCost(float itemsCost) {
        this.itemsCost = itemsCost;
    }

    //calculate total
    public float calculateTotal(){
        this.totalCost=this.serviceCost+this.optionCost+this.itemsCost;
        JOptionPane.showMessageDialog(null, "The Service Cost is: $"
                + this.serviceCost+ "\nThe Option Cost is: $" + this.optionCost + "\nThe item cost is :$"+this.itemsCost+
                "\nTotal amount is: $"+totalCost);
        return totalCost;
    }
    //method to verify user credential
    public boolean checkUserCredentials() {
        String userName = "gurpreet";
        String passWord = "12345";
        boolean isValid = false;
        for (int i = 1; i <= 3; i++)
        {
            String username = JOptionPane.showInputDialog(null, "Enter username");
            String password = JOptionPane.showInputDialog(null, "Enter password");
            if (username.equalsIgnoreCase(userName) && password.equals(passWord)) {
                isValid = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password");
            }
            if (i == 3) {
                JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye.”");
            }
        }
        return isValid;
    }
}

