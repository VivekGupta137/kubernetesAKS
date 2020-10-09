package com.iiitb.apiserver.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
public class ApiServer {
    @Value("${com.iiitb.apiserver.datasource}")
    String datasource;
    @Value("${spring.datasource.url}")
    String datasource_url;
    @RequestMapping("/")
    public Map<String,String> getStatus(){
        Map<String, String> map = new HashMap<>();
        map.put("status", "Application Running");
        map.put("data-source", datasource);
        map.put("data-source url", datasource_url);
        return map;
    }
}
