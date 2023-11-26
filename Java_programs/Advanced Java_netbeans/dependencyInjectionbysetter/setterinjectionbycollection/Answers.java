/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjectionbycollection;

/**
 *
 * setter injection with non string collection(having dependent object)
 */
public class Answers {
    private String id;
    private String name;
    private String by;

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

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    @Override
    public String toString() {
        return "Answers{" + "id=" + id + ", name=" + name + ", by=" + by + '}';
    }

   
    
    
}
