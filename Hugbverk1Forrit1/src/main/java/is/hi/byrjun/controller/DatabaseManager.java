package is.hi.byrjun.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
	
	public DatabaseManager() {
		
	}
	
	//Fall sem nær tengingu við gagnagrunninn
	private static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:src/main/resources/database2.db";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;          
    }
	
	//Fall sem sækir spurniningu með gefnu ID
	 public String getQuestion(int ID) {
	           
	                String sql;
	                sql = "SELECT Question FROM MultipleChoiceQuestions WHERE ID = " + ID;
	                String question = "";
		    try (Connection conn = connect();
	            Statement stmt  = conn.createStatement();
	            ResultSet rs    = stmt.executeQuery(sql)){     
		    while (rs.next()) {
		       question = rs.getString("question");
		    System.out.println(question);
	            }	
	        } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        }
	        return question;
	    }
	 
	 //Fall sem sækir valmöguleika spurningu með ID
	 public String[] getChoices(int ID) {
         
	         String sql;
	         sql = "SELECT Choice1, Choice2, Choice3, Choice4 FROM MultipleChoiceQuestions WHERE ID = " + ID;
	         String[] answers = new String[4];
	 try (Connection conn = connect();
	     Statement stmt  = conn.createStatement();
	     ResultSet rs    = stmt.executeQuery(sql)){     
	 while (rs.next()) {
	    answers[0] = rs.getString("Choice1");
	    answers[1] = rs.getString("Choice2");
	    answers[2] = rs.getString("Choice3");
	    answers[3] = rs.getString("Choice4");
	     }	
	 } catch (SQLException e) {
	 System.out.println(e.getMessage());
	 }
	 return answers;
	}
	 
	 
	 //Fall sem nær í svarið við spurningu með ID
	 public String getAnswer(int ID) {
         
	         String sql;
	         sql = "SELECT Answer FROM MultipleChoiceQuestions WHERE ID = " + ID;
	         int index = 0;
	    
	 try (Connection conn = connect();
	     Statement stmt  = conn.createStatement();
	     ResultSet rs    = stmt.executeQuery(sql)){     
	 while (rs.next()) {
	      index = rs.getInt("Answer");
	     }	
	 } catch (SQLException e) {
	 System.out.println(e.getMessage());
	 }
	 String answer = getChoices(ID)[index-1];
	 return answer;
	}
	 
	 
}
