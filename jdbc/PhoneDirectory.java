import java.sql.*;
import java.util.Scanner;
class Detail
{
	String name;
	int sn;
	long cont;
	PreparedStatement pstmt;
	Scanner sc=new Scanner(System.in);
	Statement stmt;
	ResultSet rs;
	void getDetail()
	{
		System.out.print("Enter Serial Number: ");
		sn=sc.nextInt();
		System.out.print("Enter name : ");
		name=sc.next();
		System.out.print("Enter Contact Number : ");
		cont=sc.nextLong();
	}
	void showDetail(Connection con)throws Exception
	{
		stmt=con.createStatement();	
		rs=stmt.executeQuery("select*from phone");
		System.out.println("sno.\tName\tContact");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getLong(3));
		}
	}
	void insert(Connection con)throws Exception
	{	
		this.getDetail();
		pstmt=con.prepareStatement("insert into phone values(?,?,?)");
		pstmt.setInt(1,sn);
		pstmt.setString(2,name);
		pstmt.setLong(3,cont);
		pstmt.executeUpdate();
	}
	void search(Connection con)throws Exception
	{
		System.out.println("Enter a contact to be searched : ");
		long n=sc.nextLong();
		pstmt=con.prepareStatement("Select * from phone where contact=?");
		pstmt.setLong(1,n);
		rs=pstmt.executeQuery();
		if(rs.next())
		{
			System.out.println("sno.\tName\t\tContact");
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getLong(3));
		}
		else
		{
			System.out.println("Contact not found");
		}
	}
	void delete(Connection con)throws Exception
	{
		System.out.println("Enter a contact to be deleted : ");
		long n=sc.nextLong();
		pstmt=con.prepareStatement("delete from phone where contact = ?");
		pstmt.setLong(1,n);
		pstmt.executeUpdate();
	}
}
class PhoneDirectory
{
	public static void main(String[]args)
	{
		ResultSet rs;
		Statement stmt;
		PreparedStatement pstmt;
		Scanner sc=new Scanner(System.in);
		Detail d=new Detail();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arpit","root","root");
			int ans;
			do
			{
				System.out.print("\nEnter your Choice\n1.Insert\n2.Delete\n3.Search\n4.Display\n5.exit\nHere:");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						d.insert(con);
						break;
					case 2:
						d.delete(con);
						break;
					case 3:
						d.search(con);
						break;
					case 4:
						d.showDetail(con);
						break;
					case 5:
						System.exit(0);
						break;
					default:
						System.out.print("\nWrong Choice!!");
				}
				System.out.print("\nDo you want to perform operation again(1/2):");
				ans=sc.nextInt();
			}
			while(ans==1);
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(ClassNotFoundException se)
		{
			System.out.println(se);
		}
		catch(Exception e)
		{}
	}
}