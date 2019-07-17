package MysqlJDBC;

import java.sql.*;

public class Mysql1 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        String url = "jdbc:mysql://localhost:3306/java7?" +
                "useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "lwf13629220283";
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            String sql = "select * from student;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getInt("id")+",");
                System.out.print(rs.getString("name")+",");
                System.out.print(rs.getString("gender")+",");
                //System.out.print(rs.getInt("age"));
                System.out.print("\n");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
