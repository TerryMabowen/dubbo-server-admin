package ai.bell.dubbo.server.admin.common.enums;

/**
 * @author Mabowen
 * @date 2019-12-20 17:10
 */
public interface BaseEnumStatus<T> {
    T getValue();

    String getDesc();
}
