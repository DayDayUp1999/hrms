package com.king.hrmsdev.service;


import com.king.hrmsdev.entity.Reward;
import com.king.hrmsdev.mapper.AttendanceMapper;
import com.king.hrmsdev.mapper.RewardMapper;
import com.king.hrmsdev.pojo.rewardinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RewardService {
    @Resource
    private RewardMapper rewardMapper;
    @Resource
    private AttendanceMapper attendanceMapper;

    public List<rewardinfo> Findallreward(){
        List<rewardinfo> rewardinfoList=rewardMapper.Findallreward();
        return rewardinfoList;
    }

    public List<rewardinfo> Findalllate(){
        List<rewardinfo> rewardinfoList=rewardMapper.Findalllate();
        return rewardinfoList;
    }

    public List<rewardinfo> Findallleaveearly(){
        List<rewardinfo> rewardinfoList=rewardMapper.Findallleaveearly();
        return rewardinfoList;
    }

    public List<rewardinfo> Findallleave(){
        List<rewardinfo> rewardinfoList=rewardMapper.Findallleave();
        return rewardinfoList;
    }

    public List<rewardinfo> Findallabsenteeism(){
        List<rewardinfo> rewardinfoList=rewardMapper.Findallabsenteeism();
        return rewardinfoList;
    }


    public rewardinfo FindByID(int reward_Id){
        rewardinfo reward=rewardMapper.FindByID(reward_Id);
        return reward;
    }
    public int Insertreward(Reward reward){
        int flag=1;
        try {
            rewardMapper.Insertreward(reward);
        } catch (Exception e) {
            flag=0;
        }
        finally {
            return flag;
        }
    }

    public int Updatereward(Reward reward){

        int flag=1;
        try {

            rewardMapper.Updatereward(reward);
        }
        catch (Exception e){
            flag=0;
        }
        finally {
            return flag;
        }

    }//可能有bug

    public int deletereward(int reward_id){
        int flag=1;
        try {
            rewardMapper.deletereward(reward_id);
        } catch (Exception e) {
            flag=0;
        }
        finally {
            return flag;
        }

    }

    public List<rewardinfo> Findworkhard(){
        List<rewardinfo> rewardinfoList=rewardMapper.Findworkhard();
        return rewardinfoList;
    }

    public List<rewardinfo> RewardFuzzyreward(Map<String,Object> map){
        Integer job_id = (Integer) map.get("job_id");
        Integer reward_id=(Integer) map.get("reward_id");
        Date beginDate= (Date) map.get("beginDate");
        Date endDate=(Date)map.get("endDate");

        Map map1=new HashMap();

        map1.put("job_id",job_id);
        map1.put("reward_id",reward_id);
        map1.put("beginDate",beginDate);
        map1.put("endDate",endDate);

        List list=rewardMapper.RewardFuzzyreward(map1);

        return list;

    }


//    public int Updaterewardeveryday(Map map){
//        int flag=1;
//        try {
//
//            Map map1=new HashMap();
//            map1=map;
//
//
//            int late=attendanceMapper.findstate0(map1);
//            int laveearly=attendanceMapper.findstate1(map1);
//            int aleave=attendanceMapper.findstate2(map1);
//            int absenteeism=attendanceMapper.findstate3(map1);
//            int overtime=attendanceMapper.findstate4(map1);
//
//            Reward reward=new Reward();
//
//            reward.setLate(late);
//            reward.setLeaveearly(laveearly);
//            reward.setAleave(aleave);
//            reward.setAbsenteeism(absenteeism);
//            reward.setOvertime(overtime);
//
//            rewardMapper.Updatereward(reward);
//
//        } catch (Exception e) {
//            flag=0;
//        }
//        finally {
//            return flag;
//        }
//
//    }
//
//
//    public int selectreward_id(int job_id){
//        return rewardMapper.selectreward_id(job_id);
//    }
}
