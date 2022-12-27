package com.jyc.cmpr_net_bd.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2021/11/10 14:54
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    /**
     * 是否成功
     */
    private Boolean succ;

    /**
     * 服务器当前时间戳
     */
    private Long ts = System.currentTimeMillis();

    /**
     * 成功数据
     */
    private T data;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误描述
     */
    private String msg;

    public static Result ofSuccess() {
        Result result = new Result();
        result.succ = true;
        result.code = "0";
        return result;
    }

    public static Result ofSuccess(Object data) {
        Result result = new Result();
        result.succ = true;
        result.code = "0";
        result.setData(data);
        return result;
    }

    public static Result ofFail(String code, String msg) {
        Result result = new Result();
        result.succ = false;
        result.code = code;
        result.msg = msg;
        return result;
    }

    public static Result ofFail(String code, String msg, Object data) {
        Result result = new Result();
        result.succ = false;
        result.code = code;
        result.msg = msg;
        result.setData(data);
        return result;
    }

}
