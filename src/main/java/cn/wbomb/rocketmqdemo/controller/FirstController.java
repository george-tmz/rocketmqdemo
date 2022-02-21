package cn.wbomb.rocketmqdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 滕明志
 * @date 2022/2/21 17:43
 */
@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String index() {
        return "Hello xiao";
    }
}
