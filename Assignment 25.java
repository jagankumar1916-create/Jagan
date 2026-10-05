import java.sql.*;

class Main {
    public static void main(String[] args) {

        try {
            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            // Create Students table
            String createTable = "CREATE TABLE Students (" +
                    "student_id INT PRIMARY KEY, " +
                    "roll_no INT, " +
                    "name VARCHAR(50) NOT NULL, " +
                    "age INT, " +
                    "date_of_birth DATE, " +
                    "email_id VARCHAR(100) NOT NULL, " +
                    "phone_number VARCHAR(15) NOT NULL, " +
                    "address VARCHAR(100))";

            st.executeUpdate(createTable);

            // Insert three records
            String insert = "INSERT INTO Students " +
                    "(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address) " +
                    "VALUES " +
                    "(1, 101, 'Rahul', 20, '2006-05-10', 'rahul@gmail.com', '9876543210', 'Bangalore')," +
                    "(2, 102, 'Anil', 21, '2005-08-15', 'anil@gmail.com', '9876543211', 'Mysore')," +
                    "(3, 103, 'Priya', 20, '2006-01-20', 'priya@gmail.com', '9876543212', 'Hubli')";

            st.executeUpdate(insert);

            System.out.println("Table created successfully.");
            System.out.println("Three records inserted successfully.");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
