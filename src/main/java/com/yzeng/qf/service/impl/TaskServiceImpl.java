package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.TaskDao;
import com.yzeng.qf.pojo.model.TaskDomain;
import com.yzeng.qf.service.TaskService;
import com.yzeng.qf.util.DateKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskDao taskDao;

    @Autowired
    public TaskServiceImpl(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @Override
    public void saveTask(TaskDomain taskDomain) {
        taskDomain.setCreate_time(DateKit.getNowTime());
        taskDao.addTask(taskDomain);
    }

    @Override
    public List<TaskDomain> queryValidTask(Integer user_id) {
        return taskDao.queryTask(user_id, 1);
    }

    @Override
    public List<TaskDomain> queryReleasedTask(Integer user_id) {
        return taskDao.queryTask(user_id, 2);
    }

    @Override
    public List<TaskDomain> queryInvalidTask(Integer user_id) {
        return taskDao.queryTask(user_id, 3);
    }

    @Override
    public TaskDomain findTaskById(Integer task_id) {
        return taskDao.findTaskById(task_id);
    }

    @Override
    public void updateTaskById(TaskDomain task) {
        Integer taskId = task.getTask_id();
        Integer sizeId = task.getSize_id();
        BigDecimal expectAmount = task.getExpect_amount();
        String delivery = task.getDelivery();
        Integer score = task.getScore();
        String supplement = task.getSupplement();
        String curTime = DateKit.getNowTime();
        taskDao.updateTask(taskId, sizeId, expectAmount, delivery, score, supplement, curTime);
    }

    @Override
    public void deleteTaskById(TaskDomain task) {
        Integer taskId = task.getTask_id();
        taskDao.updateTaskStatus(taskId, 0);
    }

    @Override
    public void releaseTaskById(TaskDomain task) {
        Integer taskId = task.getTask_id();
        taskDao.updateTaskStatus(taskId, 2);
    }

    @Override
    public void withdrawTaskById(Integer taskId) {
        taskDao.updateTaskStatus(taskId, 1);
    }
}
