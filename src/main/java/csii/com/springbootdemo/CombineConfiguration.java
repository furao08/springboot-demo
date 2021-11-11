package csii.com.springbootdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author FuRao
 * @date 2021/10/8 17:41
 * @desc 添加类描述
 */
@ComponentScan(
        basePackages = {
                "csii.com.controller"
        }
)
@Configuration
public class CombineConfiguration {
}
