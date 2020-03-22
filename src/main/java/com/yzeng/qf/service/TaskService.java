package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.TaskDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    /**
     * 添加任务单
     * @param taskDomain TaskDomain
     */
    void saveTask(TaskDomain taskDomain);

    /**
     * 查找所有待发布任务单
     * @param user_id 用户ID
     * @return list
     */
    List<TaskDomain> queryValidTask(Integer user_id);

    /**
     * 查找所有已发布任务单
     * @param user_id 用户ID
     * @return list
     */
    List<TaskDomain> queryReleasedTask(Integer user_id);

    /**
     * 查找所有过期任务单
     * @param user_id 用户ID
     * @return list
     */
    List<TaskDomain> queryInvalidTask(Integer user_id);

    /**
     * 根据任务单ID查询信息
     * @param task_id 任务单ID
     * @return TaskDomain
     */
    TaskDomain findTaskById(Integer task_id);


    /**
     * 更新任务单
     */
    void updateTaskById(TaskDomain task);

    /**
     * 删除任务单
     */
    void deleteTaskById(TaskDomain task);

    /**
     * 发布任务单
     */
    void releaseTaskById(TaskDomain task);

    /**
     * 撤回任务单
     */
    void withdrawTaskById(Integer task);

}
