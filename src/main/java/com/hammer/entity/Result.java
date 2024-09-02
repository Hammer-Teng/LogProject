package com.hammer.entity;

import java.io.Serializable;
  
/**  
 * 统一返回结果类  
 */  
public class Result<T> implements Serializable {  
  
    private static final long serialVersionUID = 1L;  
  
    // 状态码  
    private Integer code;  
  
    // 消息  
    private String message;  
  
    // 数据内容  
    private T data;  
  
    // 构造函数，用于快速创建成功或失败的返回结果  
  
    // 成功返回  
    public static <T> Result<T> success(T data) {  
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);  
    }  
  
    // 成功返回，无数据  
    public static <T> Result<T> success() {  
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), null);  
    }  
  
    // 失败返回  
    public static <T> Result<T> error(ResultCode resultCode) {
        return new Result<>(resultCode.getCode(), resultCode.getMessage(), null);  
    }
    // 失败返回
    public static <T> Result<T> error(String msg) {
        return new Result<>(ResultCode.ERROR.getCode(), msg, null);
    }

    // 失败返回，带自定义消息  
    public static <T> Result<T> error(Integer code, String message) {
        return new Result<>(code, message, null);  
    }  
  
    // 私有构造函数，防止外部直接实例化  
    private Result(Integer code, String message, T data) {  
        this.code = code;  
        this.message = message;  
        this.data = data;  
    }  
  
    // Getter 和 Setter 省略，建议使用Lombok来自动生成  
  
    // 例如，使用Lombok可以这样写  
    // @Data  
    // public class Result<T> implements Serializable {  
    //     // 省略字段定义，直接使用Lombok的@Data注解自动生成getter和setter  
    // }  
  
    // 假设有一个枚举类用于定义状态码和消息  
    public enum ResultCode {  
        SUCCESS(200, "操作成功"),
        ERROR(500, "操作失败"),
        // 可以继续添加其他状态码和消息  
        ;  
  
        private Integer code;  
        private String message;  
  
        ResultCode(Integer code, String message) {  
            this.code = code;  
            this.message = message;  
        }  
  
        public Integer getCode() {  
            return code;  
        }  
  
        public String getMessage() {  
            return message;  
        }  
    }  
}