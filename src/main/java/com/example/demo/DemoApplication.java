package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.vo.TestVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(value = "/helloQueue",method = RequestMethod.GET)
    public String getStr(@RequestParam(required = false ,name = "param1") String param){
        String res = param ==null?"":"frevd";
        TestVo testVo = new TestVo();
        testVo.setDesc("ferfvfr");
        return JSON.toJSONString(testVo);
    }
}
