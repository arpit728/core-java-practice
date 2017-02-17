import java.sql.*;
class OperationExample
{
	public static void main(String[]args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from practice1");
			rs.next();
			printRs(rs);
			/*while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			con.close();*/
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}	
	}
}