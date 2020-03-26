package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.FeedbackDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedbackService {
    /**
     * 查找用户的所有有效反馈单
     * @param user_id 用户ID
     * @return list
     */
    List<FeedbackDomain> queryValidFeedback(Integer user_id);

    /**
     * 查找所有过期的反馈单
     * @param user_id 用户ID
     * @return list
     */
    List<FeedbackDomain> queryExpiredFeedback(Integer user_id);

    /**
     * 撤销反馈单
     * @param feedback_id 反馈单ID
     */
    void cancelFeedback(Integer feedback_id);

    /**
     * 删除反馈单
     * @param feedback_id 反馈单ID
     */
    void deleteFeedback(Integer feedback_id);
}
