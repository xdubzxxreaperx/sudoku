package com.example.s2012088.sudoku;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sudoku {
    private int type;
    private String name;
    private String level;
    public Text.(int type,String name,String time) {
        this.type = type;
        this.name = name;
        this.time = time;
    }
    public int getType(){
        return type;
    }
    public void setType(int type){
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
}
