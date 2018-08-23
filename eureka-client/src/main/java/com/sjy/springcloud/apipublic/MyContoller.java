package com.sjy.springcloud.apipublic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjiyun on 2018/8/7.
 */

@RestController
public class MyContoller {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        System.out.println("aaa");
        System.out.println("bbbbbbbbbb");
        System.out.println("cccccccccc");
        return services;
    }


    @GetMapping("/dc2")
    public String dc2() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        System.out.println("aaa2");
        System.out.println("bbbbbbbbbb2");
        System.out.println("cccccccccc2");
        return services;
    }

    @GetMapping("/")
    public String index() {

        return "/this is 8087 euraka-client1111";
    }
}
