package com.king.hrmsdev.controller;


import com.king.hrmsdev.pojo.rewardinfo;
import com.king.hrmsdev.entity.Reward;
import com.king.hrmsdev.service.RewardService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RewardController {

    @Resource
    private RewardService rewardservice;

    @RequestMapping(value = "/Findallreward", method = RequestMethod.POST)
    public List<rewardinfo> rewardList(){
        List<rewardinfo> FindallList = rewardservice.Findallreward();
        return FindallList;
    }

    @RequestMapping(value = "/Findalllate", method = RequestMethod.POST)
    public List<rewardinfo> Findalllate(){
        List<rewardinfo> FindalllateList = rewardservice.Findalllate();
        return FindalllateList;
    }


    @RequestMapping(value = "/Findallleaveearly", method = RequestMethod.POST)
    public List<rewardinfo> Findallleaveearly(){
        List<rewardinfo> FindallleaveearlyList = rewardservice.Findallleaveearly();
        return FindallleaveearlyList;
    }

    @RequestMapping(value = "/Findallleave", method = RequestMethod.POST)
    public List<rewardinfo> Findallleave(){
        List<rewardinfo> FindallleaveList = rewardservice.Findallleave();
        return FindallleaveList;
    }

    @RequestMapping(value = "/Findallabsenteeism", method = RequestMethod.POST)
    public List<rewardinfo> Findallabsenteeism(){
        List<rewardinfo> FindallabsenteeismList = rewardservice.Findallabsenteeism();
        return FindallabsenteeismList;
    }

    @RequestMapping(value = "/FindByID", method = RequestMethod.POST)
    public rewardinfo FindByID(@RequestParam("reward_id") int reward_id){

        rewardinfo FindByIDinfo = rewardservice.FindByID(reward_id);
        return FindByIDinfo;
    }

    @RequestMapping(value = "/Insertreward", method = RequestMethod.POST)
    public int Insertreward(@RequestParam(value = "reward_id",required=false,defaultValue="") Integer reward_id,
                             @RequestParam("job_id") int job_id,
                             @RequestParam("checktime") @DateTimeFormat(pattern="yyyy-MM-dd") Date checktime,
                             @RequestParam("overtime") int overtime,
                             @RequestParam("late") int late,
                             @RequestParam("leaveearly") int leaveearly,
                             @RequestParam("aleave") int aleave,
                             @RequestParam("absenteeism") int absenteeism){
        Reward reward=new Reward();

        if (reward_id != null) {
            reward.setReward_id(reward_id);
        }
        reward.setJob_id(job_id);
        reward.setChecktime(checktime);
        reward.setOvertime(overtime);
        reward.setLate(late);
        reward.setLeaveearly(leaveearly);
        reward.setAleave(aleave);
        reward.setAbsenteeism(absenteeism);

        int flag=rewardservice.Insertreward(reward);
        return flag;

    }

    @RequestMapping(value = "/Updatereward", method = RequestMethod.POST)
    public int Updatereward(@RequestParam("reward_id") Integer reward_id,
                             @RequestParam("job_id") int job_id,
                             @RequestParam("checktime") @DateTimeFormat(pattern="yyyy-MM-dd") Date checktime,
                             @RequestParam("overtime") int overtime,
                             @RequestParam("late") int late,
                             @RequestParam("leaveearly") int leaveearly,
                             @RequestParam("aleave") int aleave,
                             @RequestParam("absenteeism") int absenteeism){
        Reward reward=new Reward();

        reward.setReward_id(reward_id);
        reward.setJob_id(job_id);
        reward.setChecktime(checktime);
        reward.setOvertime(overtime);
        reward.setLate(late);
        reward.setLeaveearly(leaveearly);
        reward.setAleave(aleave);
        reward.setAbsenteeism(absenteeism);

        int flag=rewardservice.Updatereward(reward);
        return flag;


    }


    @RequestMapping(value = "/deletereward", method = RequestMethod.POST)
    public int deletereward(@RequestParam("reward_id") int reward_id){

        int flag=rewardservice.deletereward(reward_id);
        return flag;

    }

    @RequestMapping(value = "/Findworkhard", method = RequestMethod.POST)
    public List<rewardinfo> Findworkhard(){
        List<rewardinfo> FindworkhardList = rewardservice.Findworkhard();
        return FindworkhardList;
    }


    @RequestMapping(value = "/RewardFuzzyreward", method = RequestMethod.POST)
    public List<rewardinfo> RewardFuzzyreward(@RequestParam(value = "job_id",required=false,defaultValue="") Integer job_id,
                                              @RequestParam(value = "reward_id",required=false,defaultValue="") Integer reward_id,
                                              @RequestParam(value = "beginDate",required=false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date beginDate,
                                              @RequestParam(value = "endDate",required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate
                                             ){
        Map map=new HashMap();

        map.put("job_id",job_id);
        map.put("reward_id",reward_id);
        map.put("beginDate",beginDate);
        map.put("endDate",endDate);

        List list=rewardservice.RewardFuzzyreward(map);

        return list;

    }

//    @RequestMapping(value = "/reward/{job_id}", method = RequestMethod.GET)
//    public Reward reward(@PathVariable("job_id") int job_id){
//        Reward reward = rewardservice.FindByID(job_id);
//        return reward;
//    }

}
