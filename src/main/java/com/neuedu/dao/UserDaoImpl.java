package com.neuedu.dao;

import com.neuedu.pojo.User;
import com.neuedu.util.JDBCUtil;
import com.neuedu.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public int insert(User user) {
        return JDBCUtil.executeUpdate("insert into user(id,username,password,email) value(?,?,?,?)",
                user.getId(),user.getName(),user.getPassword(),user.getEmail());
    }

    @Override
    public int update(User user) {
        return JDBCUtil.executeUpdate("update user set username =?, password =?, email =? where id =?",
                user.getName(),user.getPassword(),user.getEmail(),user.getId());
    }

    @Override
    public List<User> getLists() {
        return JDBCUtil.executeQuery("select * from user ", new RowMap<User>() {
            @Override
            public User RowMaping(ResultSet rs) {
                User u = new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setName(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setEmail(rs.getString("email"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, null);
    }

    @Override
    public int delete(int id) {
        return JDBCUtil.executeUpdate("delete from user where id = ?",id);
    }

    @Override
    public User getOne(int id) {
        return JDBCUtil.getOne("select * from user where id = ?", new RowMap<User>() {
            @Override
            public User RowMaping(ResultSet rs) {
                User u = new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setName(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setEmail(rs.getString("email"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, id);
    }


}
