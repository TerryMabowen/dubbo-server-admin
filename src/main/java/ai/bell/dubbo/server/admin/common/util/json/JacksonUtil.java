package ai.bell.dubbo.server.admin.common.util.json;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

/**
 * Jackson 工具类
 *
 * @author Mabowen
 * @date 2020-05-20 17:08
 */
@Slf4j
public class JacksonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String beanToJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("Object to json string error: {}", e.getMessage(), e);
            return StrUtil.EMPTY;
        }
    }

    public static <T> T jsonToBean(String jsonStr, Class<T> clz) {
        try {
            return objectMapper.readValue(jsonStr, clz);
        } catch (IOException e) {
            log.error("json string to Object error: {}", e.getMessage(), e);
            return null;
        }
    }

    public static <T> List<T> jsonToList(String jsonStr, Class<T> clz) {
        try {
            return objectMapper.readValue(jsonStr, new TypeReference<List<T>>(){});
        } catch (IOException e) {
            log.error("json string to Object error: {}", e.getMessage(), e);
            return null;
        }
    }
}
