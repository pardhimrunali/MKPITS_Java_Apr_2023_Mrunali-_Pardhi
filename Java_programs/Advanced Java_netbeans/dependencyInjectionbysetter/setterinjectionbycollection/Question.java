/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjectionbycollection;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author HP
 */
public class Question {
    private String id;
    private String name;
    private List<String> answers;

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

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
    
    public void displayInformation(){
    System.out.println(id+" "+name);
    System.out.println("answers are:");
    Iterator<String> itr=answers.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    
    }
    
    }
    
}
