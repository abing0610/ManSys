package com.inga.service.impl;

import com.inga.bean.Info;
import com.inga.dao.InfoDao;
import com.inga.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by abing on 2016/8/23.
 */
@Service("testService")
public class TestServicImpl implements TestService {

    @Resource
    private InfoDao infoDao;

    public List<Info> queryList(Info info) {

        List<Info> list = infoDao.queryInfoPage(info);

        return list;
    }

    @Override
    public void delInfo(Info info) {

        infoDao.delInfo(info.getId());
    }

    @Override
    public void updateInfo(Info info) {
        infoDao.updateInfo(info);
    }

    @Override
    public void addInfo(Info info) {
        infoDao.addInfo(info);
    }

    @Override
    public Info queryInfoById(int id) {

        return infoDao.queryInfoById(id);
    }
}
