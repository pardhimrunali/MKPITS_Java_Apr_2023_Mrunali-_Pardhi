/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivestringbasedvalues;

/**
 *
 * @author HP
 */
public class Employee {
    private String id;
    private String name;
    private String city;

    public Employee() {
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void display(){
    System.out.println(id+" "+name+" "+city);
    }
    
}
