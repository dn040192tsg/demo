package com.springliqpay.demo.controller;
import com.liqpay.LiqPay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("action", "pay");
        params.put("amount", "1");
        params.put("currency", "USD");
        params.put("description", "description text");
        params.put("order_id", "order_id_1");
        params.put("version", "3");


        LiqPay liqpay = new LiqPay("i66823577067"
                , "RUtwa6WZfpnbcgEZKANifBXc8Rz0z2usEp9a8kP9");
        String html = liqpay.cnb_form(params);
        System.out.println(html);
        return html;
    }



}