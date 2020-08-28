package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenuServiceImpl implements IMenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getUserMenu(String userId) {
        return menuMapper.getUserMenu(userId);
    }
}
