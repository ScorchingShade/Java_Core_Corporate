
import java.sql.*;

public class JDBCTutes {

    private static final String url="jdbc:oracle:thin:@localhost:1521:XE";
    private static final String user="System";
    private static final String pass="Newuser123";

    Connection Connections(Connection conn) throws SQLException{


        try {
            conn=DriverManager.getConnection(url,user,pass);
            Class.forName("oracle.jdbc.driver.OracleDriver");



            System.out.println("Connected");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return conn;

        }

        return conn;

    }



    void Insertion(Connection conn) throws SQLException,ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=Connections(conn);
        String query="Insert into product values(109,'Sujala',90)";
        Statement st= conn.createStatement();
        int i=st.executeUpdate(query);
        System.out.println("Query is updated "+i);

        String query1="Select * from product";

        ResultSet rs= st.executeQuery(query1);

        while(rs.next()){

            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(1));

        }


    }



    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        JDBCTutes jd=new JDBCTutes();

        Connection conn=null;
        jd.Insertion(conn);




    }

}
