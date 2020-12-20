package com.example.demo.entity.bo;

import lombok.Data;


//sử dụng generic để nhận các kiểu dữ liệu tùy ý
@Data
public class ResponseEntityBO<T> extends BaseMessage{
    private T result;

    public ResponseEntityBO(Boolean errorResponse, String s, long timeStamp) {
        super(errorResponse,s,timeStamp);
    }
    public ResponseEntityBO(Boolean errorResponse, String s, long timeStamp,T result) {
        super(errorResponse,s,timeStamp);
        this.result=result;
    }
}
