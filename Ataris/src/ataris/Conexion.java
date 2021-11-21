/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ataris;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdk.nashorn.internal.ir.Statement;

/**
 *
 * @author Rafael Rosas
 */
public class Conexion {
      private static final String JDBC_URL="jdbc:mysql://localhost:3306/Ataris?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";            
  private static final String JDBC_USER="root";
  
 
  public static Connection getConnection() throws SQLException{
  return   DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
 }
  public static void close(ResultSet rs) throws SQLException{
    rs.close();
  }
  
  public static void close(PreparedStatement smtm) throws SQLException{
      smtm.close();
  }
  public static void close(Connection conn) throws SQLException{
      conn.close();
  }
  
  
  
  
  
  
  
  
  private static final String JDBC_PASSWORD="123";
}
