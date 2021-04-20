package com.tricowin.springcloud.controller;

import com.tricowin.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author tricowin
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;  //提供多种便捷访问远程http服务的方法，简单的Restful服务模板~

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     *
     * @param dept
     * @return boolean
     * @author yuxin
     * @creed: Talk is cheap,show me the code
     * @date 2021/1/15 9:49
     */
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        //restTemplate(请求的地址,请求携带的数据,返回的实体)
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        //restTemplate(请求的地址，返回的实体)
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

}
