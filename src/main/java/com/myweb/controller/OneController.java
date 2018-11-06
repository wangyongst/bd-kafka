package com.myweb.controller;

import com.myweb.domain.XiuZheng;
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
    @RequestMapping(value = "/send/xiuzheng", method = RequestMethod.POST)
    public Result send() {
        XiuZheng xiuZheng = new XiuZheng();
        xiuZheng.setLine("1");
        xiuZheng.setName("中国");
        xiuZheng.setMobile("1811131");
        return oneService.sendMessage(xiuZheng);
    }
}
