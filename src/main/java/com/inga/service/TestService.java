package com.inga.service;

import com.inga.bean.Info;

import java.util.List;

/**
 * Created by abing on 2016/8/23.
 */
public interface TestService {
    List<Info> queryList(Info info);

    void delInfo(Info info);

    void updateInfo(Info info);

    void addInfo(Info info);

    Info queryInfoById(int id);
}
