/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.*;

/**
 *
 * @author Win 10
 */
public class XJDBC {
//    connection Url: chuỗi kết nối

    private static String connUrl = "jdbc:sqlserver://localhost:1433;database=EduSys;integratedSecurity=false;encrypt=true;trustServerCertificate=true;";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String user = "sa";
    private static String pass = "123456";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws Exception {
        Connection conn = DriverManager.getConnection(connUrl, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    public static int update(String sql, Object... args) throws Exception {
        try {
            PreparedStatement stmt = XJDBC.getStmt(sql,args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet query(String sql, Object... args) throws Exception {
        PreparedStatement stmt = XJDBC.getStmt(sql, args);
        return stmt.executeQuery();
    }
    public static Object value(String sql, Object... args){
        try{
            ResultSet rs = XJDBC.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
}
