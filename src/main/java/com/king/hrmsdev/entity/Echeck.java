package com.king.hrmsdev.entity;

import java.util.Date;

public class Echeck {
    private int echeck_id;
    private int job_id;
    private Date opentime;
    private Date closetime;
    private int state;

    public int getEcheck_id() {
        return echeck_id;
    }

    public void setEcheck_id(int echeck_id) {
        this.echeck_id = echeck_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Echeck(int echeck_id, int job_id, Date opentime, Date closetime, int state) {
        this.echeck_id = echeck_id;
        this.job_id = job_id;
        this.opentime = opentime;
        this.closetime = closetime;
        this.state = state;
    }

    public Echeck() {
    }

    @Override
    public String toString() {
        return "Echeck{" +
                "echeck_id=" + echeck_id +
                ", job_id=" + job_id +
                ", opentime=" + opentime +
                ", closetime=" + closetime +
                ", state=" + state +
                '}';
    }
}
