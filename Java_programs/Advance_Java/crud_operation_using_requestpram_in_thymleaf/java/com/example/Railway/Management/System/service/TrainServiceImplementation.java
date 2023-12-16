package com.example.Railway.Management.System.service;

import com.example.Railway.Management.System.dao.TrainCreation;
import com.example.Railway.Management.System.entity.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
@Service
public class TrainServiceImplementation implements TrainService{

    private TrainCreation trainCreation;
    @Autowired

    public TrainServiceImplementation(TrainCreation trainCreation) {
        this.trainCreation = trainCreation;
    }

    @Override
    public List<Train> showList() {
        return trainCreation.findAll();
    }

    @Override
    @Transactional
    public Train saveData(@ModelAttribute("save") Train train) {
        return trainCreation.save(train);
    }

    @Override
    @Transactional
    public Train updateRecord(String train_id) {
       Train train= trainCreation.findById(train_id).get();
       return  train;
    }

    @Override
    public void deleteRecord(String train_id) {
                   trainCreation.deleteById(train_id);
    }
}
