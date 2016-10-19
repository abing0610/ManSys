package com.inga.controller;

import com.inga.bean.Info;
import com.inga.service.TestService;
import com.inga.utils.JsonUtils;
import com.inga.utils.common.Constant;
import com.inga.utils.log.PlatformLogger;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by abing on 2016/8/23.
 */
@Controller
public class Test {

    @Resource
    private TestService testService;

    public static final String ADD="add";

    public static final String DELETE = "del";

    public static final String EDIT ="edit";

    @ResponseBody
    @RequestMapping(value = "/queryInfo" , method = RequestMethod.GET)
    public String queryInfo(Info info) throws IOException {

        PlatformLogger.message("-------------------------------------");

        List<Info> list = testService.queryList(info);

        PlatformLogger.message("--------- size : " + list.size() + " --------------");
        Map<String , Object> map = this.assempMap(list , info);

        return JsonUtils.toJson(map);
    }

    @ResponseBody
    @RequestMapping(value = "/updateInfo" , method = RequestMethod.POST)
    public String updateInfo(Info info){

        int result = 0;
//        System.out.println(info.getId());
        PlatformLogger.message("the oper is  : " + info.getOper());
        switch (info.getOper()){
            case ADD :
                testService.addInfo(info);
                break;
            case DELETE:
                testService.delInfo(info);
                break;
            case EDIT:
                testService.updateInfo(info);
                break;
            default:
                result = -1;
        }
        return  null;
    }


    private Map<String , Object> assempMap(List<Info> list , Info info){
        Map<String , Object> map = new HashedMap();
        map.put("page" , info.getPage());
        map.put("total" , info.getTotalPage());
        map.put("records" , info.getTotal());
        map.put("rows" , list);
        return  map;
    }

}
