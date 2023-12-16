package com.example.Railway.Management.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Train {
    @Id
    private String train_id;
    private String train_name;
    private String source_stations;

    private int no_of_bogie;

    private String define_train_types;
private  String end_station;
private  String types_of_bogie;
private int no_of_seats;
private boolean train_frequency;

    public Train() {
    }

    public Train(String train_id, String train_name, String source_stations, int no_of_bogie, String define_train_types, String end_station, String types_of_bogie, int no_of_seats, boolean train_frequency) {
        this.train_id = train_id;
        this.train_name = train_name;
        this.source_stations = source_stations;
        this.no_of_bogie = no_of_bogie;
        this.define_train_types = define_train_types;
        this.end_station = end_station;
        this.types_of_bogie = types_of_bogie;
        this.no_of_seats = no_of_seats;
        this.train_frequency = train_frequency;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getSource_stations() {
        return source_stations;
    }

    public void setSource_stations(String source_stations) {
        this.source_stations = source_stations;
    }

    public int getNo_of_bogie() {
        return no_of_bogie;
    }

    public void setNo_of_bogie(int no_of_bogie) {
        this.no_of_bogie = no_of_bogie;
    }

    public String getDefine_train_types() {
        return define_train_types;
    }

    public void setDefine_train_types(String define_train_types) {
        this.define_train_types = define_train_types;
    }

    public String getEnd_station() {
        return end_station;
    }

    public void setEnd_station(String end_station) {
        this.end_station = end_station;
    }

    public String getTypes_of_bogie() {
        return types_of_bogie;
    }

    public void setTypes_of_bogie(String types_of_bogie) {
        this.types_of_bogie = types_of_bogie;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public boolean isTrain_frequency() {
        return train_frequency;
    }

    public void setTrain_frequency(boolean train_frequency) {
        this.train_frequency = train_frequency;
    }
}
