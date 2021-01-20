package com.cit.lotus.lineservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class lineService {

    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String home() {
        return "hi, welcome! ";
    }

//    @Value("${foo}")
//    String foo;
//    @GetMapping("/foo")
//    public String getFoo() {
//        return foo;
//    }

//    @GetMapping("/getStatusAll")
//    public String getStatusAll(){
//        RestTemplate restTemplate=new RestTemplate();
//        return restTemplate.getForObject("http://172.26.134.44:8602/getStatusAll/",String.class);
//    }
//
//    @GetMapping("/getLineLogs")
//    public String getLineLogs(){
//        RestTemplate restTemplate=new RestTemplate();
//        return restTemplate.getForObject("http://172.26.134.44:8602/getLineLogs/",String.class);
//    }
//
//    @GetMapping("/getLineLogsRealTime")
//    public String getLineLogsRealTime(){
//        RestTemplate restTemplate=new RestTemplate();
//        return restTemplate.getForObject("http://172.26.134.44:8602/getLineLogsRealTime/",String.class);
//    }

}
