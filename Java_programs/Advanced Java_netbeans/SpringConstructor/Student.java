/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationspring.Example;

/**
 *
 * @author HP
 */


/*
------------------------dependency injection by constructor------
*/
public class Student {
     private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
  public void displayInfo(){  
    System.out.println("Hello: "+name);  
}  
   
    
}
