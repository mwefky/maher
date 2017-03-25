package com.example.wefky.myapplication;

/**
 * Created by wefky on 3/23/2017.
 */

public class Info {
    String heartrate, bloodpressure, cvp, input, output, abnormal;
    int id;

    public Info(int id,String heartrate, String bloodpressure, String cvp, String input, String output, String abnormal) {
        this.heartrate = heartrate;
        this.bloodpressure = bloodpressure;
        this.cvp = cvp;
        this.input = input;
        this.output = output;
        this.abnormal = abnormal;
        this.id = id;
    }

    public Info() {
    }

    public String getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(String heartrate) {
        this.heartrate = heartrate;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getCvp() {
        return cvp;
    }

    public void setCvp(String cvp) {
        this.cvp = cvp;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(String abnormal) {
        this.abnormal = abnormal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}