package com.tce.common.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;

// 如果是真实的开发  他是一个 所有返回给页面的json格式数据 集合
public class JsonResult implements Serializable{
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();
    // 响应业务状态
    private Integer status;
    // 响应消息
    private String msg;
    // 响应中的数据
    private Object data;

    /**
     * 无参构造器
     */
    public JsonResult() {}

    /**
     * @param data 响应数据
     */
    public JsonResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    /**
     *
     * @param status http状态码：

    200("OK")
    一切正常。实体主体中的文档（若存在的话）是某资源的表示。

    400("Bad Request")
    客户端方面的问题。实体主题中的文档（若存在的话）是一个错误消息。希望客户端能够理解此错误消息，并改正问题。

    500("Internal Server Error")
    服务期方面的问题。实体主体中的文档（如果存在的话）是一个错误消息。该错误消息通常无济于事，因为客户端无法修复服务器方面的问题。

    301("Moved Permanently")
    当客户端触发的动作引起了资源URI的变化时发送此响应代码。另外，当客户端向一个资源的旧URI发送请求时，也发送此响应代码。

    404("Not Found") 和410("Gone")

     * @param msg  提示信息
     * @param data 响应数据
     */
    public JsonResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }


    public static JsonResult build(Integer status, String msg, Object data) {
        return new JsonResult(status, msg, data);
    }
    public static JsonResult build(Integer status, String msg) {
        return new JsonResult(status, msg, null);
    }

    /**get，set方法*/

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
