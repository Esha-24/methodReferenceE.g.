
package Assignment5;


import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q2_update {

	public static void main(String[] args) {
		
		String urlOracle="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="sys as sysdba";
		String password="#Database1818";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWhich column you want to update?\nEnter 1 to update name\nEnter 2 to update address\nEnter 3 to update courseID\n");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter your id ");
		int inpID = sc.nextInt();
		String query = null;
		
		try{
			
			if(choice==1) {
				System.out.println("Enter your new name : ");
				String name = sc.next();
				query = "update student set name = \'" +name+ "\' where id = \'" +inpID+ "\'";
			}
			else if(choice==2) {
				System.out.println("Enter your new address : ");
				String address = sc.next();
				query = "update student set address = \'" +address+ "\' where id = \'" +inpID+ "\'";
			}
			else if(choice==3) {
				System.out.println("Enter your new courseID : ");
				int courseId = sc.nextInt();
				query = "update student set courseId = \'" +courseId+ "\' where id = \'" +inpID+ "\'";
			}
			
			Connection conOracle = DriverManager.getConnection(urlOracle,username,password);	
			System.out.println("\nConnection Successful");

			Statement stmt = conOracle.createStatement();
			int x = stmt.executeUpdate(query);
			System.out.println("\n"+x+" Record updated Successfully");			
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
			
	}
}
		
//		try {
//			Connection conOracle = DriverManager.getConnection(urlOracle,username,password);	
//			System.out.println("Connection Successful");
//			String query = "insert into student values(1007,'Anushree',15,'Delhi',3)";
//			Statement stmt = conOracle.createStatement();
//			int x = stmt.executeUpdate(query);
//			System.out.println(x+"Record insertion Successful");			
//			
//		}
//		catch(SQLException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
		
