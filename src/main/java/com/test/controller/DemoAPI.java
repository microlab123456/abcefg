package com.test.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/guowang/dwmoAPI")
public class DemoAPI {
    @RequestMapping(value = "/getDemo/{userName}", method = RequestMethod.GET)
    public String getDemo(@PathVariable String userName) {
        String i = "aaa";
        userName = userName + i;
        return "您输入的数据是:"+ userName;
    }
    public static int count = 0;
    @RequestMapping(value = "/postDemo",method = RequestMethod.POST)
    public String postDemo(@RequestParam String userName){
        count++;
        String result = "接口是第"+count+"次被调用，您的用户名是"+userName;
        return result;
    }
}
