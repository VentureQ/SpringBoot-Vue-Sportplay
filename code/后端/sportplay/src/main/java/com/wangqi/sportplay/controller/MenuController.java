package com.wangqi.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wangqi.sportplay.bean.MainMenu;
import com.wangqi.sportplay.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author wangqi
 * @version 1.0
 * @date 2021/10/10 20:10
 */

@RestController
public class MenuController {

    @Autowired
    MenuDao menuDao;

    @RequestMapping("/menus")
    public String getAllMenus(){
        System.out.println("访问成功");
        HashMap<String,Object> data=new HashMap<>();
        int status=404;
        List<MainMenu> menus=menuDao.getMainMenus();
        if(menus!=null){
            data.put("data",menus);
            data.put("status",200);
        }else{
            data.put("status",400);
        }

        String s= JSON.toJSONString(data);
        return s;

    }

}
