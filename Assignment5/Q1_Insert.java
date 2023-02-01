package Assignment5;


import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q1_Insert {

	public static void main(String[] args) {
		
		String urlOracle="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="sys as sysdba";
		String password="#Database1818";
		
		Scanner sc = new Scanner(System.in);
		int n=1;
		String choice = "YES";
		
		while(n<=5 && choice.equalsIgnoreCase("yes")) {
			System.out.println("\nEnter your name : ");
			String name = sc.next();
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			System.out.println("Enter your address : ");
			String address = sc.next();
			System.out.println("Enter your courseID : ");
			int courseID = sc.nextInt();
			
			try{
				Connection conOracle = DriverManager.getConnection(urlOracle,username,password);	
				System.out.println("\nConnection Successful");
				String query = "insert into student(name,age,address,courseid) values(\'" +name+ "\',\'" +age+ "\',\'" +address+ "\',\'" +courseID+ "\')";
				Statement stmt = conOracle.createStatement();
				int x = stmt.executeUpdate(query);
				System.out.println("\n"+x+"Record insertion Successful");			
				
			}catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("\nDo you want to continue?enter 'yes' or 'no' : \nEnter your choice : ");
			choice = sc.next();
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
		
	}
}
