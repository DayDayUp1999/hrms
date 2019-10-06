package com.king.hrmsdev.entity;

import java.util.Date;

public class Aleave {
    private int aleave_id;
    private int job_id;
    private Date btime;
    private Date etime;
    private String reason;
    private int examine;

    public int getAleave_id() {
        return aleave_id;
    }

    public void setAleave_id(int aleave_id) {
        this.aleave_id = aleave_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getExamine() {
        return examine;
    }

    public void setExamine(int examine) {
        this.examine = examine;
    }

    public Aleave(int aleave_id, int job_id, Date btime, Date etime, String reason, int examine) {
        this.aleave_id = aleave_id;
        this.job_id = job_id;
        this.btime = btime;
        this.etime = etime;
        this.reason = reason;
        this.examine = examine;
    }

    public Aleave() {
    }

    @Override
    public String toString() {
        return "Aleave{" +
                "aleave_id=" + aleave_id +
                ", job_id=" + job_id +
                ", btime=" + btime +
                ", etime=" + etime +
                ", reason='" + reason + '\'' +
                ", examine=" + examine +
                '}';
    }
}
