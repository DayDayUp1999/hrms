package com.king.hrmsdev.controller;

import com.king.hrmsdev.entity.Aleave;
import com.king.hrmsdev.entity.Echeck;
import com.king.hrmsdev.pojo.aleaveinfo;
import com.king.hrmsdev.pojo.echeckinfo;
import com.king.hrmsdev.service.AttendanceService;
import com.king.hrmsdev.service.RewardService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SimpleFormatter;

@RestController
public class AttendanceController {

    @Resource
    private AttendanceService attendanceservice;

    @Resource
    private RewardService rewardService;

    @RequestMapping(value = "/Findallaleave", method = RequestMethod.POST)
    public List<aleaveinfo> Findallaleave(){
        List<aleaveinfo> FindallList = attendanceservice.Findallaleave();
        System.out.println(FindallList);
        return FindallList;
    }

    @RequestMapping(value = "/Findallapproval", method = RequestMethod.POST)
    public List<aleaveinfo> Findallapproval(){
        List<aleaveinfo> Findallapprovallist = attendanceservice.Findallapproval();
        return Findallapprovallist;
    }

    @RequestMapping(value = "/Findallrefuse", method = RequestMethod.POST)
    public List<aleaveinfo> Findallrefuse(){
        List<aleaveinfo> Findallrefuselist = attendanceservice.Findallrefuse();
        return Findallrefuselist;
    }


    @RequestMapping(value = "/Findalluntreated", method = RequestMethod.POST)
    public List<aleaveinfo> Findalluntreated(){
        List<aleaveinfo> Findalluntreatedlist = attendanceservice.Findalluntreated();
        return Findalluntreatedlist;
    }

    @RequestMapping(value = "/Approvalaleave", method = RequestMethod.POST)
    public int Approvalaleave(@RequestParam("aleave_id") int aleave_id){
        int flag=attendanceservice.Approvalaleave(aleave_id);
        return flag;
    }

    @RequestMapping(value = "/Refusealeave", method = RequestMethod.POST)
    public int Refusealeave(@RequestParam("aleave_id") int aleave_id){

        int flag=attendanceservice.Refusealeave(aleave_id);
        return flag;
    }

    @RequestMapping(value = "/Insertaleave", method = RequestMethod.POST)
    public int Insertaleave(@RequestParam(value = "aleave_id",required=false,defaultValue="") Integer aleave_id,
                             @RequestParam("job_id") int job_id,
                             @RequestParam("btime") @DateTimeFormat(pattern="yyyy-MM-dd") Date btime,
                             @RequestParam("etime") @DateTimeFormat(pattern="yyyy-MM-dd") Date etime,
                             @RequestParam(value = "reason",required=false) String reason,
                             @RequestParam("examine") int examine){
        Aleave aleave=new Aleave();

        if(aleave_id != null){
            aleave.setAleave_id(aleave_id);
        }
        aleave.setJob_id(job_id);
        aleave.setBtime(btime);
        aleave.setEtime(etime);

        if (reason!=null){
        aleave.setReason(reason);
        }
        aleave.setExamine(examine);
        int flag=attendanceservice.Insertaleave(aleave);
        return flag;

    }

    @RequestMapping(value = "/AleaveFuzzyreward", method = RequestMethod.POST)
    public List<aleaveinfo> AleaveFuzzyreward(@RequestParam(value = "job_id",required=false,defaultValue="") Integer job_id,
                                              @RequestParam(value = "aleave_id",required=false,defaultValue="") Integer aleave_id,
                                              @RequestParam(value = "department_id",required=false,defaultValue="") Integer department_id,
                                              @RequestParam(value = "btime",required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date btime,
                                              @RequestParam(value = "etime",required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date etime){

        Map map=new HashMap();

        map.put("job_id",job_id);
        map.put("aleave_id",aleave_id);
        map.put("department_id",department_id);
        map.put("btime",btime);
        map.put("etime",etime);

        List list=attendanceservice.AleaveFuzzyreward(map);
        return list;
    }





    @RequestMapping(value = "/Findallecheck", method = RequestMethod.POST)
    public List<echeckinfo> Findallecheck(){
        List<echeckinfo> echeckinfoList=attendanceservice.Findallecheck();
        return  echeckinfoList;
    }

    @RequestMapping(value = "/FindByecheck_id", method = RequestMethod.POST)
    public echeckinfo FindByecheck_id(@RequestParam("echeck_id") int echeck_id){
        echeckinfo echeckinfo = attendanceservice.FindByecheck_id(echeck_id);
        return echeckinfo;
    }

    @RequestMapping(value = "/Insertecheck", method = RequestMethod.POST)
    public int Insertecheck(@RequestParam(value = "echeck_id",required=false,defaultValue="") Integer echeck_id,
                             @RequestParam("job_id") Integer job_id,
                             @RequestParam("opentime") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date opentime,
                             @RequestParam(value = "closetime",required=false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date closetime,
                             @RequestParam("state") Integer state){

        Echeck echeck=new Echeck();
        if (echeck_id !=null){
            echeck.setEcheck_id(echeck_id);
        }
        echeck.setJob_id(job_id);
        echeck.setOpentime(opentime);
        echeck.setClosetime(closetime);
        echeck.setState(state);

        int flag=attendanceservice.Insertecheck(echeck);
        return flag;
    }




    @RequestMapping(value = "/Updateecheck", method = RequestMethod.POST)
    public int Updateecheck(@RequestParam("echeck_id") Integer echeck_id,
                             @RequestParam("job_id") Integer job_id,
                             @RequestParam("opentime") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date opentime,
                             @RequestParam(value = "closetime",required=false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date closetime,
                             @RequestParam("state") Integer state){
        Echeck echeck=new Echeck();

        echeck.setEcheck_id(echeck_id);
        echeck.setJob_id(job_id);
        echeck.setOpentime(opentime);
        echeck.setClosetime(closetime);
        echeck.setState(state);

        int flag=attendanceservice.Updateecheck(echeck);

        return flag;

//        if (closetime != null){
//            int worktime=(int) (closetime.getTime()-opentime.getTime())/(1000*60*60);
//            if(worktime>6)
//                echeck.setState(0);
//            if (worktime<6)
//                echeck.setState(1);
//        }
//
//        int reward_id=rewardService.selectreward_id(job_id);
//
//        Map map=new HashMap();
//        map.put("opentime",opentime);
//        map.put("closetime",closetime);
//        map.put("reward_id",reward_id);
//
//        int flag1=rewardService.Updaterewardeveryday(map);
//        int flag=attendanceservice.Updateecheck(echeck);
//
//        if (flag1==1 && flag==1){
//            return 1;
//        }
//        else return 0;
    }


    @RequestMapping(value = "/Deleteecheck", method = RequestMethod.POST)
    public int Deleteecheck(@RequestParam("echeck_id") int echeck_id){

        int flag=attendanceservice.Deleteecheck(echeck_id);
        return flag;
    }

    @RequestMapping(value = "/EcheckFuzzyreward", method = RequestMethod.POST)
    public List<echeckinfo> EcheckFuzzyreward(@RequestParam(value = "job_id",required=false,defaultValue="") Integer job_id,
                                              @RequestParam(value = "echeck_id",required=false,defaultValue="") Integer echeck_id,
                                              @RequestParam(value = "opentime",required=false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date opentime,
                                              @RequestParam(value = "closetime",required=false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date closetime){

        Map map=new HashMap();

        map.put("job_id",job_id);
        map.put("echeck_id",echeck_id);
        map.put("opentime",opentime);
        map.put("closetime",closetime);

        List list=attendanceservice.EcheckFuzzyreward(map);

        return list;
    }


}
