package com.chen.vo;

import com.chen.core.type.RType;
import lombok.Data;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 15:52
 * Description:统一结果返回 整个系统的 接口的统一返回格式
 */
@Data
public class R<T> {
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回码的字符串信息
     */
    private String msg;
    /**
     * 返回的数据
     */
    private T data;

    public static <T> R setR(int c, String m, T obj) {
        R r = new R();
        r.setCode(c);
        r.setData(obj);
        r.setMsg(m);
        return r;
    }

    /**
     * 成功
     * @return
     */
    public static R ok() {
        return setR(RType.成功.getVal(), "OK", null);
    }

    /**
     * 成功
     * @param t
     * @param <T>
     * @return
     */
    public static <T> R ok(T t){
        return setR(RType.成功.getVal(),"OK",t);
    }

    /**
     * 失败
     * @return
     */
    public static R fail(){
        return setR(RType.失败.getVal(),"Fail",null);
    }

}