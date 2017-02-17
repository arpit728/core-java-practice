package practice;
import java.sql.*;
class First
{
	public static void main(String[]args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("insert into practice1 values(6,'jay')");
			rs=stmt.executeQuery("select * from practice1");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));				
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}