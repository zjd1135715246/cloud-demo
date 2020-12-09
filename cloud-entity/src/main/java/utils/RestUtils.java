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

public class RestUtils {

    public   RestTemplate restTemplate(){
        return new RestTemplate();
    };


}
