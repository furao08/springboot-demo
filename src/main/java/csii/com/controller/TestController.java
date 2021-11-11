package csii.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FuRao
 * @date 2021/8/9 16:23
 * @desc 添加类描述
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello world.";
    }

}
