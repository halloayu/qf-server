package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.TaskDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
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
     * 更新任务单状态
     */
    void updateTaskStatus(@Param("task_id") Integer task_id, @Param("status") Integer status);

    /**
     * 更新任务单
     */
    void updateTask(@Param("task_id") Integer task_id, @Param("size_id") Integer size_id,
                    @Param("expect_amount") BigDecimal expect_amount, @Param("delivery") String delivery,
                    @Param("score") Integer score, @Param("supplement") String supplement, @Param("create_time") String create_time);

    /**
     * 根据user_id查找所有任务单
     * @param user_id 用户ID
     * @return list
     */
    List<TaskDomain> queryTask(@Param("user_id") Integer user_id, @Param("status") Integer status);

    /**
     * 根据ID查询任务单
     * @param task_id 任务单ID
     * @return TaskDomain
     */
    TaskDomain findTaskById(@Param("task_id") Integer task_id);
}
