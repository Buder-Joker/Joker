package MysqlJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mysql2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java7?" +
                "useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "lwf13629220283";
        Connection conn = null;
        List<mysql2table> list = new ArrayList<mysql2table>();
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            String sql = "select * from student;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                mysql2table mt = new mysql2table(rs.getInt("id"),
                        rs.getString("name"),rs.getString("gender"));
                list.add(mt);
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
        for(mysql2table mt: list){
            System.out.println(mt);
        }
    }
}
