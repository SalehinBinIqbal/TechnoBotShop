/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author saleh
 */

public class Queries {
    
    String UserID;
    String UserPassword;
    
    public void login()throws SQLException{
        String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        String user = "sa";
        String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            
            String sql = "Select * From USERS";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                UserID = rs.getString("USERNAME");
                UserPassword = rs.getString("PSWRD");
                
            }
            
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR");
        }
    }
}
