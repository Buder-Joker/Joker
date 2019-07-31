package db;

import java.sql.*;

public class DBManger {
    private Connection conn;//创建连接对象
    private PreparedStatement ps;//创建预编译执行器
    protected ResultSet rs;//创建结果放回集

    //创建数据库连接对象
    public Connection getConn() {
        final String DB_URL = "jdbc:mysql://localhost:3306/student_manger?useUnicode=" +
                "true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,
                    "root", "lwf13629220283");
            System.out.println("数据库连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.conn;
    }

    //数据库更新
    public int update(String sql, Object... objects) {
        int count = -1;

        try {
            this.conn = this.getConn();
            this.ps = this.conn.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                this.ps.setObject(i + 1, objects[i]);
            }
            count = this.ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            this.allClose();
        }

        return count;
    }

    //数据库查询
    public ResultSet query(String sql, Object... objects) {
        this.conn = this.getConn();
        try {
            this.ps = this.conn.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                this.ps.setObject(i + 1, objects[i]);
            }
            this.rs = this.ps.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return this.rs;
    }

    //关闭数据库资源
    public void allClose() {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (ps != null) {
                ps.close();
                ps = null;
            }
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBManger dbManger = new DBManger();
        dbManger.getConn();
    }

}
