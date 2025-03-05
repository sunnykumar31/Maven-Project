package org.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.sample.util.ConnectionUtils;

public class DeleteUserDao {

	public Boolean deleteUser(int id) {

        // using try-with-resources to avoid closing resources (boiler plate code)
        
        // Step 1: Establishing a Connection
		boolean rowdelete=false;
		Connection con = null;
		PreparedStatement pst = null;
        try {
        	con = ConnectionUtils.getConnection();
        	pst = con.prepareStatement("delete from public.user where id = ?;");
        	pst.setInt(1, id);
            rowdelete = pst.executeUpdate()>0;
            
        } 
        catch (Exception e) {
            System.out.println(e);
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
        return rowdelete;
    }

}