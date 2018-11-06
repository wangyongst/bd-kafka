package com.myweb.service;


import com.myweb.domain.*;
import com.utils.Result;

public interface OneService {

    public Result sendMessage(XiuZheng xiuZheng);

    public Result sendMessage(CeLue ceLue);

    public Result sendMessage(JiHua jiHua);

    public Result sendMessage(XiaoShou xiaoShou);

    public Result sendMessage(ZengXian zengXian);
}
