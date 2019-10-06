package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.Aleave;
import com.king.hrmsdev.entity.Echeck;
import com.king.hrmsdev.pojo.aleaveinfo;
import com.king.hrmsdev.pojo.echeckinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AttendanceMapper {

    //请假管理
    public List<aleaveinfo> Findallaleave();//查询所有请假条

    public List<aleaveinfo> Findallapproval();//查询所有批准假条

    public List<aleaveinfo> Findallrefuse();//查询所有拒绝假条-

    public List<aleaveinfo> Findalluntreated();//查询所有未处理假条

    public int Approvalaleave(int aleave_id);//同意请假条

    public int Refusealeave(int aleave_id);//拒绝请假条-

    public int Insertaleave(Aleave aleave);//添加假条-

    public List<aleaveinfo> AleaveFuzzyreward(Map map);//请假条模糊查询



    //考勤状况

    public List<echeckinfo> Findallecheck();//查询所有考勤状况

    public echeckinfo FindByecheck_id(int echeck_id);//通过echeck_id查询信息

    public int Insertecheck(Echeck echeck);//添加考勤记录

    public int Updateecheck(Echeck echeck);//通过echeck_id修改考勤记录//可能有bug

    public int Deleteecheck(int echeck_id);//通过echeck_id删除考勤记录

    public List<echeckinfo> EcheckFuzzyreward(Map map);//考勤信息模糊查询


//
//    public int findstate0(Map map);
//    public int findstate1(Map map);
//    public int findstate2(Map map);
//    public int findstate3(Map map);
//    public int findstate4(Map map);



}
