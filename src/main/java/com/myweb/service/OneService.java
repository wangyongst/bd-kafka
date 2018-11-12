package com.myweb.service;


import com.myweb.domain.*;
import com.utils.Result;

public interface OneService {

    public Result sendZengXian(ZengXian zengXian);

    public Result sendCeLue();

    public Result sendJiHua();

    public Result sendXiaoShou();

    public Result sendXiuZheng();
}
