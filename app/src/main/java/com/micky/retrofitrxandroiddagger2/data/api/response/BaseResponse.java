package com.micky.retrofitrxandroiddagger2.data.api.response;

/**
 * @Project CommonProject
 * @Packate com.micky.commonproject.data.api.response
 * @Description
 * @Author Micky Liu
 * @Email mickyliu@126.com
 * @Date 2015-12-21 16:39
 * @Version 0.1
 */
public class BaseResponse {
    public int code;
    public String message;

    public boolean isSuccess() {
        if (code == 1) {
            return true;
        } else {
            return false;
        }

    }
}
