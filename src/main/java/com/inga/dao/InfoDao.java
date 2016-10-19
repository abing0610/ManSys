package com.inga.dao;

import com.inga.bean.Info;
import com.inga.utils.mybatis.MyBatisDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by abing on 2016/8/23.
 */
@MyBatisDao
public interface InfoDao {
    /**
     * 查询表信息
     * @param info
     * @return
     */
    List<Info> queryInfoPage(Info info);

    /**
     * 添加info
     * @param info
     */
    void addInfo(Info info);

    /**
     * 更新info
     * @param info
     */
    void updateInfo(Info info);

    /**
     * 删除info
     * @param id
     */
    void delInfo(@Param("id") int id);
}
