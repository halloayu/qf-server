package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.FeedbackDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FeedbackDao {
    /**
     * 查找用户的所有反馈单
     * @param user_id 用户ID
     * @param status 反馈单状态
     * @return list
     */
    List<FeedbackDomain> queryFeedbackByUserId(@Param("user_id") Integer user_id, @Param("status") Integer status);

    /**
     * 改变反馈单状态
     * @param feedback_id 反馈单ID
     * @param status 状态
     */
    void updateFeedbackStatus(@Param("feedback_id") Integer feedback_id, @Param("status") Integer status);

}
