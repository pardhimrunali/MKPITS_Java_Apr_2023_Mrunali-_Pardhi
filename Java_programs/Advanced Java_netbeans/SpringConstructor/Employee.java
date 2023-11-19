/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeDetail;

/**
 *
 * @author HP
 */
/*---------------------depency injection by object */
public class Employee {
    private int id;
    private String name;
    Address address;

    public Employee() {
    }

    public Employee(int id, String name, Address address) {
            super();  
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
  public  void show(){  
    System.out.println(id+" "+name);
    
    System.out.println(address.toString());  
}  
    
    
}
