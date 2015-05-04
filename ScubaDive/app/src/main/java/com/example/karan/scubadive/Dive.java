package com.example.karan.scubadive;


public class Dive {

    //private variables
    int _id;
    String _depth;
    String _time;
    String _pressure;
    // Empty constructor
    public Dive(){

    }
    // constructor
    public Dive(int id, String _depth, String _time, String _pressure){
        this._id = id;
        this._depth = _depth;
        this._time = _time;
        this._pressure = _pressure;
    }

    // constructor
    public Dive(String _depth, String _time, String _pressure){
        this._depth = _depth;
        this._time = _time;
        this._pressure = _pressure;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting depth
    public String getDepth(){
        return this._depth;
    }

    // setting depth
    public void set_depth(String depth){
        this._depth = depth;
    }

    // getting time
    public String getTime(){
        return this._time;
    }

    // setting time
    public void setTime(String time){
        this._time = time;
    }
    // getting pressure
    public String getPressure(){
        return this._pressure;
    }

    // setting time
    public void setPressure(String pressure){
        this._pressure = pressure;
    }
}
