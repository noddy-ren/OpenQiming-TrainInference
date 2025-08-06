package com.ctdi.llmtc.xtp.traininfer.service;

import com.ctdi.llmtc.xtp.traininfer.beans.req.TrainReq;
import com.ctdi.llmtc.xtp.traininfer.util.OperateResult;

/**
 * @author ctdi
 * @since 2025/6/5
 */
public interface TrainService {

    OperateResult<String> trainSubmit(TrainReq trainReq);

    OperateResult<String> delTrain(String taskId);

    OperateResult<String> delInfer(String taskId);

    OperateResult<String> eval(TrainReq trainReq);

    OperateResult<String> inferSubmit(TrainReq trainReq);

    String inferStatus(String taskId);

    OperateResult<String> intentSync(String taskId);

}
