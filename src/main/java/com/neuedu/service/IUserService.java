package com.neuedu.service;

import com.neuedu.pojo.User;

import java.util.List;

public interface IUserService {
    public int insert(User user);
    public int update(User user);
    public List<User> getLists();
    public int delete(int id);
    public User getOne(int id);
}
