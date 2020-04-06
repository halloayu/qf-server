package com.yzeng.qf.controller;

import com.yzeng.qf.constant.UrlConstant;
import com.yzeng.qf.pojo.model.*;
import com.yzeng.qf.service.*;
import com.yzeng.qf.util.APIResponse;
import com.yzeng.qf.util.DateKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ApiController {

    private final PictureService pictureService;
    private final ModelService modelService;
    private final TaskService taskService;
    private final SupplierService supplierService;
    private final FeedbackService feedbackService;
    private final ProductService productService;
    private final UserService userService;

    @Autowired
    public ApiController(
            PictureService pictureService,
            ModelService modelService,
            TaskService taskService,
            SupplierService supplierService,
            FeedbackService feedbackService,
            ProductService productService,
            UserService userService) {
        this.pictureService = pictureService;
        this.modelService = modelService;
        this.taskService = taskService;
        this.supplierService = supplierService;
        this.feedbackService = feedbackService;
        this.productService = productService;
        this.userService = userService;
    }

    @RequestMapping(value = UrlConstant.Api.GET_CATEGORY_DATA)
    @ResponseBody
    public APIResponse getCategoryData(@RequestParam("productId") Integer product_id) {
        List<PictureDomain> picture = pictureService.getPictureByProductId(product_id);
        return APIResponse.success("奇服商城", picture);
    }

    @PostMapping(value = UrlConstant.Api.GET_MODEL_DATA)
    @ResponseBody
    public APIResponse saveModelData(@RequestBody ModelDomain model) {
        model.setCreate_time(DateKit.getNowTime()); // 插入当前时间
        System.out.println(model);
        if (modelService.addModelByUserId(model) == 1) {
            return APIResponse.success("设计稿存储成功");
        } else {
            return APIResponse.fail("设计稿存储失败");
        }
    }

    @GetMapping(value = UrlConstant.Api.POST_MODEL_DATA)
    @ResponseBody
    public List<ModelDomain> giveModelData(@RequestParam("user_id") Integer userId) {
        return modelService.queryModelByUserId(userId);
    }

    @GetMapping(value = UrlConstant.Api.CUR_MODEL_DATA)
    @ResponseBody
    public ModelDomain getModelById(@RequestParam("model_id") Integer modelId) {
        return modelService.queryValidModels(modelId);
    }

    @GetMapping(value = UrlConstant.Api.DELETE_MODEL)
    @ResponseBody
    public APIResponse deleteModelById(@RequestParam("model_id") Integer modelId) {
        modelService.deleteByModelId(modelId);
        return APIResponse.success("设计稿成功删除");
    }

    @PostMapping(value = UrlConstant.Api.SAVE_TASK)
    @ResponseBody
    public APIResponse saveTask(@RequestBody TaskDomain task) {
        taskService.saveTask(task);
        return APIResponse.success("任务单生成成功");
    }

    @GetMapping(value = UrlConstant.Api.QUERY_TASK)
    @ResponseBody
    public List<TaskDomain> queryTask(@RequestParam("user_id") Integer user_id) {
        return taskService.queryValidTask(user_id);
    }

    @GetMapping(value = UrlConstant.Api.QUERY_SUPPLIER)
    @ResponseBody
    public SupplierDomain querySupplier(@RequestParam("supplier_id") Integer supplier_id) {
        return supplierService.queryValidSupplierById(supplier_id);
    }

    @GetMapping(value = UrlConstant.Api.FIND_TASK)
    @ResponseBody
    public TaskDomain findTask(@RequestParam("task_id") Integer task_id) {
        return taskService.findTaskById(task_id);
    }

    @PostMapping(value = UrlConstant.Api.UPDATE_TASK)
    @ResponseBody
    public APIResponse updateTask(@RequestBody TaskDomain task) {
        taskService.updateTaskById(task);
        return APIResponse.success("任务单更新成功");
    }

    @PostMapping(value = UrlConstant.Api.DELETE_TASK)
    @ResponseBody
    public APIResponse deleteTask(@RequestBody TaskDomain task) {
        taskService.deleteTaskById(task);
        return APIResponse.success("删除成功");
    }

    @PostMapping(value = UrlConstant.Api.RELEASE_TASK)
    @ResponseBody
    public APIResponse releaseTask(@RequestBody TaskDomain task) {
        taskService.releaseTaskById(task);
        return APIResponse.success("发布成功，请前往已发布拦查看");
    }

    @GetMapping(value = UrlConstant.Api.QUERY_RELEASED_TASK)
    @ResponseBody
    public List<TaskDomain> queryReleasedTask(@RequestParam("user_id") Integer user_id) {
        return taskService.queryReleasedTask(user_id);
    }

    @GetMapping(value = UrlConstant.Api.CANCEL_RELEASED_TASK)
    @ResponseBody
    public APIResponse withdrawReleasedTask(@RequestParam("task_id") Integer task_id) {
        taskService.withdrawTaskById(task_id);
        return APIResponse.success("撤回成功,请前往待发布设计稿查看");
    }

    @GetMapping(value = UrlConstant.Api.QUERY_VALID_FEEDBACK)
    @ResponseBody
    public List<FeedbackDomain> queryValidFeedback(@RequestParam("user_id") Integer user_id) {
        return feedbackService.queryValidFeedback(user_id);
    }

    @GetMapping(value = UrlConstant.Api.QUERY_CANCEL_FEEDBACK)
    @ResponseBody
    public List<FeedbackDomain> queryCancelFeedback(@RequestParam("user_id") Integer user_id) {
        return feedbackService.queryExpiredFeedback(user_id);
    }

    @GetMapping(value = UrlConstant.Api.CANCEL_FEEDBACK)
    @ResponseBody
    public APIResponse cancelFeedback(@RequestParam("feedback_id") Integer feedback_id) {
        feedbackService.cancelFeedback(feedback_id);
        return APIResponse.success("此交易已放弃,请至过期查看");
    }

    @GetMapping(value = UrlConstant.Api.DELETE_FEEDBACK)
    @ResponseBody
    public APIResponse deleteFeedback(@RequestParam("feedback_id") Integer feedback_id) {
        feedbackService.deleteFeedback(feedback_id);
        return APIResponse.success("删除成功");
    }

    @GetMapping(value = UrlConstant.Api.SEARCH_PRODUCT)
    @ResponseBody
    public List<ProductDomain> searchProduct(@RequestParam("name") String name) {
        return productService.searchProductByName(name);
    }

    @GetMapping(value = UrlConstant.Api.PRODUCT_DETAIL)
    @ResponseBody
    public ProductDomain productDetail(@RequestParam("product_id") Integer productId) {
        return productService.getProduct(productId);
    }

    @GetMapping(value = UrlConstant.Api.PRODUCT_PICTURE)
    @ResponseBody
    public List<PictureDomain> productPicture(@RequestParam("product_id") Integer productId) {
        return pictureService.getPictureByProductId(productId);
    }

    @GetMapping(value = UrlConstant.Api.USER_CHECK)
    @ResponseBody
    public APIResponse checkUsername(@RequestParam("username") String username) {
        List<UserDomain> list = userService.queryUsers(username);
        if(list.size() > 0)
            return APIResponse.fail("该用户名已存在");
        else
            return APIResponse.success("有效用户名");
    }

    @PostMapping(value = UrlConstant.Api.USER_REGISTER)
    @ResponseBody
    public APIResponse register(@RequestBody UserDomain userDomain) {
        int result = userService.register(userDomain);
        if(result == 1){
            return APIResponse.success("注册成功");
        }else {
            return APIResponse.fail("注册失败");
        }
    }

    @GetMapping(value = UrlConstant.Api.STORE_MODELS)
    @ResponseBody
    public List<ModelDomain> getStoreModels(@RequestParam("supplier_id") String supplier_id) {
        return modelService.getModelsBySupplier(supplier_id);
    }

    @GetMapping(value = UrlConstant.Api.PICTURES)
    @ResponseBody
    public List<PictureDomain> getPictures(@RequestParam("pictures") List<String> pictures) {
        return pictureService.getAllPictures(pictures);
    }
}
