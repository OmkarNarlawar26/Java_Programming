import java.sql.*;

class MarvellousJDBC
{
    public static void main(String A[])
    {
        try
        {
            // Step 1 : Load the database driver
            class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 : Connect the driver with database
            Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53","root","");

            // Step 3 : Create statement class object
            Statement sobj = cobj.createStatement();

            // Step 4 : Execute the query
            ResultSet robj = sobj.executeQuery("Select * from student");

            // Step 5 : Display the result
            while(robj.next())
            {
                System.out.println("Roll no : "+ robj.getInt("Rno"));
                System.out.println("Name : "+ robj.getString("Name"));
                System.out.println("City : "+ robj.getString("City"));
                System.out.println("Marks : "+ robj.getint("Marks"));
            }

            robj.close();
            sobj.close();
            cobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }
    }
}