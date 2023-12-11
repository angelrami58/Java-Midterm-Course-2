/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez.rivera_midterm;

/**
 *
 * @author angelramirez-rivera
 */

public class Customer extends Person {
    private String customerNumber;
    private boolean onMailingList;

    // Constructor
    public Customer(String name, String address, String phoneNumber, String customerNumber, boolean onMailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    // Accessor methods specific to Customer
    public String getCustomerNumber() {
        return customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    // Mutator methods specific to Customer
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }
}
