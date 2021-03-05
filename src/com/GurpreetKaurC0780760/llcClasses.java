package com.GurpreetKaurC0780760;

import javax.swing.*;


public class llcClasses {
    //Variable declaration for Credential detail
    private String userName;
    private String passWord;


    //Variable for first and last name
    private String firstName;
    private String lastName;

    //variable for choices,options and items selection
    private String services;
    private String options;
    private String items;
    private int serviceCost;
    private float optionCost;
    private float itemCost;

    //variable for total cost
    float total;

    // empty constructor
    public llcClasses() {
    }

    //constructor overloading
    public llcClasses(String userName,String passWord)
    {
        this.userName=userName;
        this.passWord=passWord;
    }

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

    //getter and setters for options, items and services
    public String getServices() {
        services = JOptionPane.showInputDialog(null, "Please select services(Enter A or B for selection and " +
                "press any other character to skip)"+
                "\n"+"Package A-$100/hr"+"\n"+"Package B-$150/hr");
        if(services.equalsIgnoreCase("A"))
        {
            serviceCost=100;
        }
        else if(services.equalsIgnoreCase("B"))
        {
           serviceCost=150;
        }
        else
        {
            serviceCost=0;
//            JOptionPane.showInputDialog(null, "Invalid Selection");
        }
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getOptions() {
        options = JOptionPane.showInputDialog(null, "Please select options (Enter A or B for selection and press any " +
                "other character to skip)"+
                "\n"+"Storage small-$8/day"+"\n"+"Storage large-$20.11/day");
        if(options.equalsIgnoreCase("A"))
        {
            optionCost=8;
        }
        else if(options.equalsIgnoreCase("B"))
        {
            optionCost= (float) 20.11;
        }
        else
        {
            optionCost = 0;
//            JOptionPane.showInputDialog(null, "Invalid Selection");
        }
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getItems() {
        items = JOptionPane.showInputDialog(null, "Please select options (Enter A or B for selection and " +
                "press any other character to skip)"+
                "\n"+"Boxes Small-$2.50/box"+"\n"+"Boxes Large-$4.50/box");
        if(items.equalsIgnoreCase("A"))
        {
            itemCost= 2.50F;
        }
        else if(items.equalsIgnoreCase("B"))
        {
            itemCost= (float) 2.50;
        }
        else
        {
            itemCost=0;
//            JOptionPane.showInputDialog(null, "Invalid Selection");
        }
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getServiceCost() {
        JOptionPane.showMessageDialog(null,"Service cost is "+serviceCost);
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }

    public float getOptionCost() {
        return optionCost;
    }

    public void setOptionCost(float optionCost) {
        this.optionCost = optionCost;
    }

    public float getItemCost() {
        return itemCost;
    }

    public void setItemCost(float itemCost) {
        this.itemCost = itemCost;
    }

    //method to check user credential and limit upto 3 tries
    public boolean checkUserCredentials() {
        String username = JOptionPane.showInputDialog(null, "Enter username");
        String password = JOptionPane.showInputDialog(null, "Enter password");
        //check if username and password is correct
        if (username.equalsIgnoreCase(userName) && password.equals(passWord)) {
            return true;
        } else {
            return false;
        }

    }

    //method for total
    public float totalAmount()
    {
        total=this.serviceCost+this.optionCost+this.itemCost;
        if(total>0) {
            JOptionPane.showMessageDialog(null, "Your total is $" + this.total + " " +
                    "that includes \n service $" + this.serviceCost + " , options $" + this.optionCost + " and items $" + this.itemCost + " cost)");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Not selected any option");
        }
        return total;
    }




}
