package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.FeedbackDao;
import com.yzeng.qf.pojo.model.FeedbackDomain;
import com.yzeng.qf.service.FeedbackService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackDao feedbackDao;

    public FeedbackServiceImpl(FeedbackDao feedbackDao) {
        this.feedbackDao = feedbackDao;
    }

    @Override
    public List<FeedbackDomain> queryValidFeedback(Integer user_id) {
        return feedbackDao.queryFeedbackByUserId(user_id, 2);

    }

    @Override
    public List<FeedbackDomain> queryExpiredFeedback(Integer user_id) {
        return feedbackDao.queryFeedbackByUserId(user_id, 3);

    }

    @Override
    public void cancelFeedback(Integer feedback_id) {
        feedbackDao.updateFeedbackStatus(feedback_id, 3);
    }

    @Override
    public void deleteFeedback(Integer feedback_id) {
        feedbackDao.updateFeedbackStatus(feedback_id, 0);
    }
}
