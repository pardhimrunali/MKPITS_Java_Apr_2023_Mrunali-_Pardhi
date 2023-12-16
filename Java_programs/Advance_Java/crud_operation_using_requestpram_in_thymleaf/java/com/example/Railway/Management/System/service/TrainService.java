package com.example.Railway.Management.System.service;

import com.example.Railway.Management.System.entity.Train;

import java.util.List;

public interface TrainService {
    List<Train> showList();
    Train saveData(Train train);
    Train updateRecord(String train_id);

    void deleteRecord(String train_id);

}
