/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DAO {
    public static Connection con;
	
	public DAO(){
		if(con == null){
			String dbUrl = "jdbc:mysql://localhost:3306/create-user-table?autoReconnect=true&useSSL=false";
			String dbClass = "com.mysql.cj.jdbc.Driver";
			try {
				Class.forName(dbClass);
				con = DriverManager.getConnection (dbUrl, "root", "2109");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
