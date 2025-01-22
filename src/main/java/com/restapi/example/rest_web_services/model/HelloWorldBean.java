package com.restapi.example.rest_web_services.model;

public class HelloWorldBean {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public HelloWorldBean(String helloWorldBean) {
        this.msg = helloWorldBean;
    }
}
