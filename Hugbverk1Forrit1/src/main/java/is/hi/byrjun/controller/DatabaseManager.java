package is.hi.byrjun.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
	
	public DatabaseManager() {
		
	}

	private static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:src/main/resources/database.db";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;          
    }
	
	 public String getQuestion() {
	           
	                String sql;
	                sql = "SELECT Question FROM MultipleChoiceQuestions";
	                String question = "";
		    try (Connection conn = connect();
	            Statement stmt  = conn.createStatement();
	            ResultSet rs    = stmt.executeQuery(sql)){     
		    while (rs.next()) {
		       question = rs.getString("question");
		   
	            }	
	        } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        }
	        return question;
	    }
}
