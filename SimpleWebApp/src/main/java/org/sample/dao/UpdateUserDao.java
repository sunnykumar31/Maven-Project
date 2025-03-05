package org.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.sample.dto.User;
import org.sample.util.ConnectionUtils;

public class UpdateUserDao {

    public boolean updateUser(User userObj) throws ClassNotFoundException {
      
    	boolean rs = false;
    	PreparedStatement pst = null;
    	Connection con = null;
        try {
			con = ConnectionUtils.getConnection();
		    pst = con.prepareStatement("update public.user set first_name = ?,last_name = ?, email = ?, username = ?, password = ? where email = ?;");
 
            pst.setString(1, userObj.getFirstName());
            pst.setString(2, userObj.getLastName());
            pst.setString(3, userObj.getEmail());
            pst.setString(4, userObj.getUsername());
            pst.setString(5, userObj.getPassword());
//            pst.setString(6, String.valueOf(userObj.getId()));
            pst.setString(6, userObj.getEmail());
            
            rs = pst.executeUpdate()>0;

        } 
        catch (SQLException e) {
            System.out.println("Updation failed" + e);
        }
        finally {
        	if(pst!=null) {
        		try {
					pst.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
        	}
        	if(con != null) {
        		try {
					con.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
        	}
        }
        return rs;
    }
}