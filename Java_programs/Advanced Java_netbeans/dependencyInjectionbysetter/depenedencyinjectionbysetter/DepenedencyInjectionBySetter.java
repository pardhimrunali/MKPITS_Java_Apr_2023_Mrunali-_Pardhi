/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depenedencyinjectionbysetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import primitivestringbasedvalues.Employee;
import setterinjectionbycollection.Question;
import setterinjectionbycollection.Questions;
import setterinjectionwithdependentobject.Student;




/**
 *
 * @author HP
 */
public class DepenedencyInjectionBySetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
    
    Employee e=(Employee) factory.getBean("objectbased");
    e.display();
    
    Student s= (Student) factory.getBean("studentdetail");
    s.displayDetail();
    
    
    Question q=(Question) factory.getBean("listdependency");
    q.displayInformation();
    
     
    Questions que=(Questions) factory.getBean("listString");
    que.displayInformation();
    
    
      
    }
    
}
