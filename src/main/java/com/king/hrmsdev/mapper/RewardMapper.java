package com.king.hrmsdev.mapper;

import com.king.hrmsdev.entity.Reward;
import com.king.hrmsdev.pojo.rewardinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RewardMapper {

    public List<rewardinfo> Findallreward();//查询所有reward

    public List<rewardinfo> Findalllate();//查询所有reward 迟到次数排序

    public List<rewardinfo> Findallleaveearly();//查询所有reward 早退次数排序

    public List<rewardinfo> Findallleave();//查询所有reward 请假次数排序

    public List<rewardinfo> Findallabsenteeism();//查询所有reward 旷工次数排序

    public rewardinfo FindByID(int reward_id);//通过奖惩ID查询员工信息

    public int Insertreward(Reward reward);//插入reward表信息

    public int Updatereward(Reward reward);//通过工号id修改reward数据//可能有bug

    public int deletereward(int reward_id);//通过reward_id删除reward数据

    public List<rewardinfo> Findworkhard();//全勤员工查询

    public List<rewardinfo> RewardFuzzyreward(Map map);//模糊条件查询


//    public int Updaterewardeveryday(Map map);//每天更新表
//
//    public int selectreward_id(int job_id);//通过job_id查reward-id

}
