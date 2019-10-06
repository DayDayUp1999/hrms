package com.king.hrmsdev.entity;

import java.util.Date;

public class Reward {
    private int reward_id;
    private int job_id;
    private Date checktime;
    private int overtime;
    private int late;
    private int leaveearly;
    private int aleave;
    private int absenteeism;

    public int getReward_id() {
        return reward_id;
    }

    public void setReward_id(int reward_id) {
        this.reward_id = reward_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public int getLeaveearly() {
        return leaveearly;
    }

    public void setLeaveearly(int leaveearly) {
        this.leaveearly = leaveearly;
    }

    public int getAleave() {
        return aleave;
    }

    public void setAleave(int aleave) {
        this.aleave = aleave;
    }

    public int getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(int absenteeism) {
        this.absenteeism = absenteeism;
    }

    public Reward(int reward_id, int job_id, Date checktime, int overtime, int late, int leaveearly, int aleave, int absenteeism) {
        this.reward_id = reward_id;
        this.job_id = job_id;
        this.checktime = checktime;
        this.overtime = overtime;
        this.late = late;
        this.leaveearly = leaveearly;
        this.aleave = aleave;
        this.absenteeism = absenteeism;
    }

    public Reward() {
    }

    @Override
    public String toString() {
        return "Reward{" +
                "reward_id=" + reward_id +
                ", job_id=" + job_id +
                ", checktime=" + checktime +
                ", overtime=" + overtime +
                ", late=" + late +
                ", leaveearly=" + leaveearly +
                ", aleave=" + aleave +
                ", absenteeism=" + absenteeism +
                '}';
    }
}
