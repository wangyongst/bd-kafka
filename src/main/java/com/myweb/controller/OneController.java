package com.myweb.controller;

import com.myweb.domain.ZengXian;
import com.myweb.service.OneService;
import com.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@Controller
public class OneController {

    @Autowired
    public OneService oneService;

    @ResponseBody
    @RequestMapping(value = "/send/zengxian", method = RequestMethod.POST)
    public Result sendZengxian(@RequestBody ZengXian zengXian) {
        return oneService.sendZengXian(zengXian);
    }

    @ResponseBody
    @RequestMapping(value = "/send/celue", method = RequestMethod.POST)
    public Result sendCeLue() {
        return oneService.sendCeLue();
    }

    @ResponseBody
    @RequestMapping(value = "/send/jihua", method = RequestMethod.POST)
    public Result sendJiHua() {
        return oneService.sendJiHua();
    }

    @ResponseBody
    @RequestMapping(value = "/send/xiuzheng", method = RequestMethod.POST)
    public Result sendXiuZheng() {
        return oneService.sendXiuZheng();
    }

    @ResponseBody
    @RequestMapping(value = "/send/xiaoshou", method = RequestMethod.POST)
    public Result sendXiaoShou() {
        return oneService.sendXiaoShou();
    }
}
