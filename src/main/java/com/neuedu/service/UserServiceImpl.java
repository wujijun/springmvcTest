package com.neuedu.service;

import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserDaoImpl;
import com.neuedu.pojo.User;

import java.util.List;


public class UserServiceImpl implements IUserService {
    private IUserDao dao = new UserDaoImpl();
    @Override
    public int insert(User user) {
        return dao.insert(user);
    }

    @Override
    public int update(User user) {
        return dao.update(user);
    }

    @Override
    public List<User> getLists() {
        return dao.getLists();
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public User getOne(int id) {
        return dao.getOne(id);
    }
}
