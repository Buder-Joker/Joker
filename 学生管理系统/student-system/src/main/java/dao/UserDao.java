package dao;

import db.DBManger;
import user.User;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends DBManger implements JieKou<User> {
    public boolean user(String account, String password) {
        boolean flag = false;
        String sql = "select * from manger where account = ? and password = ?";
        rs = super.query(sql, account, password);
        try {
            if(rs.next()) {
                System.out.println("登录成功");
                flag = true;
            } else {
                System.out.println("登录失败");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return flag;
    }
    @Override
    public void add(User t) {
        // TODO Auto-generated method stub
    }

    @Override
    public void modify(User t) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Serializable id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<User> list() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean findById(Serializable id) {
        // TODO Auto-generated method stub
        return false;
    }

}
