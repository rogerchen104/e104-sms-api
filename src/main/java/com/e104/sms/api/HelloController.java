package com.e104.sms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @RequestMapping("/table/list")
    public void getTableList() {
    		System.out.println("Hello!!!!!!!!");
    }
    public String index() {
		return "";
    }
}
