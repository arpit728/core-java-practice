import java.sql.*; 
class First
{
	public static void main(String[]args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arpit","root","root");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select contact from phone");
			while(rs.next())
			{
				//System.out.println(rs.getInt()+"  "+rs.getString+" "+rs.getLongInt());  
				System.out.println(rs.getInt(1));  
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
	}
}
