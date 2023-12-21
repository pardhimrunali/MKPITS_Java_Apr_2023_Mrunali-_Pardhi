package com.example.demoRestAPI.Controller;

import com.example.demoRestAPI.entity.Address;
import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.service.AddressService;
import com.example.demoRestAPI.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    private AddressService addressService;
    private StudentService studentService;
    @Autowired

    public AddressController(AddressService addressService, StudentService studentService) {
        this.addressService = addressService;
        this.studentService = studentService;
    }

    @GetMapping("/address/{id}")
    public Address showaddress(@PathVariable int id){
        return  addressService.findByAddress(id);
    }

    @GetMapping("/addressall/{id}")
    public Student showStudent(@PathVariable int id){
        Address address=addressService.findByAddress(id);
       Student student=address.getStudent();
        return student;
    }

@DeleteMapping("/address/{id}")
    public String DeleteRecord(@PathVariable int id){
        Address address=showStudent(id).getAddress();
        Student student=address.getStudent();
        student.setAddress(null);
        addressService.delete(id);
        return "data delete";
}
     


}
