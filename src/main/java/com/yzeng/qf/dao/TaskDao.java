package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.TaskDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TaskDao {

    /**
     * 添加任务单
     * @param taskDomain TaskDomain
     */
    void addTask(TaskDomain taskDomain);

    /**
     * 根据user_id查找所有任务单
     * @param user_id 用户ID
     * @return list
     */
    List<TaskDomain> queryTask(@Param("user_id") Integer user_id, @Param("status") Integer status);
}
