package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.TaskDao;
import com.yzeng.qf.pojo.model.TaskDomain;
import com.yzeng.qf.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        taskDomain.setCreate_time(df.format(new Date()));
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
}
