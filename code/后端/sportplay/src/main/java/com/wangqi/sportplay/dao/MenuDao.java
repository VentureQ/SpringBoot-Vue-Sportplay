package com.wangqi.sportplay.dao;

import com.wangqi.sportplay.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangqi
 * @version 1.0
 * @date 2021/10/10 16:44
 */

@Repository
public interface MenuDao {
    public List<MainMenu> getMainMenus();

}
