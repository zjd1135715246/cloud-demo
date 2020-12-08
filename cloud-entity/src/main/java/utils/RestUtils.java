package utils;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjd
 * @date 2020/12/7
 */
@Configuration
public class RestUtils {

    private static  RestTemplate restTemplate = new RestTemplate();

    public static  <T> T  getForEntity(String url,Class<T> clazz){
        return JSON.parseObject(JSON.toJSONString(restTemplate.getForObject(url, Object.class)), clazz);
    }


}
