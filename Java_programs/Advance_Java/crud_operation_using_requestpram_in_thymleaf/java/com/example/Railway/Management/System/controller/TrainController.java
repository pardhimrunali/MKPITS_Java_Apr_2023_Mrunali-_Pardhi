package com.example.Railway.Management.System.controller;

import com.example.Railway.Management.System.entity.Train;
import com.example.Railway.Management.System.service.TrainServiceImplementation;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TrainController {
    private TrainServiceImplementation trainServiceImplementation;

    public TrainController(TrainServiceImplementation trainServiceImplementation) {
        this.trainServiceImplementation = trainServiceImplementation;
    }
@GetMapping("/home")
    public String showAllData(Model model){
       List<Train> trainDataList =trainServiceImplementation.showList();
       model.addAttribute("show",trainDataList);
       return "homepage";
    }

    @GetMapping("/register")
    public String register(Model model){
        Train train=new Train();
        model.addAttribute("save",train);
        return "form";
    }
    @PostMapping("/saveRecord")
    public String saveDetails(@ModelAttribute("save") Train trainadd)
    {
        trainServiceImplementation.saveData(trainadd);
        return "redirect:home";

    }
    @GetMapping("/update")
    public String updateRecord(@RequestParam("train_id")String id,Model model){
        Train train_update=trainServiceImplementation.updateRecord(id);
        model.addAttribute("save",train_update);
        return "form";
    }

    @GetMapping("/deleteRecord")
    public String DeleteTrain(@RequestParam("train_id") String train_id){
        trainServiceImplementation.deleteRecord(train_id);
        return "redirect:home";
    }
}
