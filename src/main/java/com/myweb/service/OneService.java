package com.myweb.service;


import com.myweb.domain.CeLue;
import com.myweb.domain.JiHua;
import com.myweb.domain.XiaoShou;
import com.myweb.domain.XiuZheng;
import com.utils.Result;

public interface OneService {

    public Result sendMessage(XiuZheng xiuZheng);

    public Result sendMessage(CeLue ceLue);

    public Result sendMessage(JiHua jiHua);

    public Result sendMessage(XiaoShou xiaoShou);

}
