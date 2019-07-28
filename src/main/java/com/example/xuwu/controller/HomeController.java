package com.example.xuwu.controller;

import com.example.xuwu.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "欢哥");
        return "index";
    }

    @ResponseBody
    @GetMapping(value = "/test")
    public ApiResponse<?> test(){
        return ApiResponse.ofMessage(200, "成功");
    }
}
