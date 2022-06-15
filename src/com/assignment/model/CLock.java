package com.assignment.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CLock extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println(getClock());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }
    
    public String getClock(){
            Date now = new Date();
            SimpleDateFormat formter = new SimpleDateFormat();
            formter.applyPattern("hh:mm:ss aa");
            return formter.format(now);
    }    
}
