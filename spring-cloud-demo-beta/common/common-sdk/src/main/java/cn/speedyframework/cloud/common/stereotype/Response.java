package cn.speedyframework.cloud.common.stereotype;

/**
 * desc
 * date
 */
public interface Response<T> {

    String getCode();

    String getMessage();

    T getData();
}
