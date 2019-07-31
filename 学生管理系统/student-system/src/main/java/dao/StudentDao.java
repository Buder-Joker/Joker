package dao;


import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBManger;
import user.Student;

public class StudentDao extends DBManger implements JieKou<Student> {
    //增加
    @Override
    public void add(Student t) {
        // TODO Auto-generated method stub
        String sql = "insert into student(stuId, stuName, stuSex, stuBid)"+ "values(?,?,?,?)";
        int count = super.update(sql, t.getId(), t.getName(),t.getSex(), t.getBid());
        System.out.println(t.getName());
        if(count > 0 ) {
            System.out.println("存储成功");
        } else {
            System.out.println("存储失败");
        }

    }
    //改
    @Override
    public void modify(Student t) {
        String sql = "update student set stuName = ?, stuSex =?, stuBid = ? where stuId = ?";
        int count = super.update(sql,t.getName(),t.getSex(), t.getBid(), t.getId());
        if(count > 0 ) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }

    }
    //删除
    @Override
    public void remove(Serializable id) {
        // TODO Auto-generated method stub
        String sql = "delete from student where stuId = ?";
        int count = super.update(sql, id);
        if(count > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    @Override
    public List<Student> list() {
        // TODO Auto-generated method stub
        List<Student> l = new ArrayList<Student>();
        String sql = "select * from student";
        super.rs = super.query(sql);
        try {
            while(rs.next()) {
                Student s = new Student(rs.getString("stuId"),
                        rs.getString("stuName"),
                        rs.getString("stuSex"),
                        rs.getString("stuBid"));
                l.add(s);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return l;
    }
    @Override
    public boolean findById(Serializable id) {
        boolean flag = true;

        String sql = "select * from student where stuId = ?";
        this.rs = super.query(sql, id);
        try {
            if(rs.next()) {
                flag = false;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            super.allClose();
        }

        return flag;
    }


    public Student findByIdStudent(Serializable id) {
        Student student = null;

        String sql = "select * from student where stuId = ?";
        super.rs = super.query(sql, id);
        try {
            if(rs.next()) {
                student = new Student(rs.getString("stuId"),
                        rs.getString("stuName"),
                        rs.getString("stuSex"),
                        rs.getString("stuBid"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            super.allClose();
        }

        return student;
    }
}
