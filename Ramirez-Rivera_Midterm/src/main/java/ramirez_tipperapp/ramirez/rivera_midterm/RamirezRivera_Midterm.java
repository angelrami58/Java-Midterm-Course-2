/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez.rivera_midterm;

/**
 *
 * @author angelramirez-rivera
 */

public class RamirezRivera_Midterm {
    
  public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer("John Doe", "123 Main St", "555-123-4567", "1001", true);

        // Access and display customer information
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Phone Number: " + customer.getPhoneNumber());
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        if(customer.isOnMailingList())
            System.out.println("Is on Mailing List: Yes");
        else
            System.out.println("Is on Mailing List: No");
    }
}