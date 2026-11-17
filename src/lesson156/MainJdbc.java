package lesson156;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/emil";
        String user = "root";
        String pass = "Emil_Aliyev!2014!@#";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            System.out.println("--- INNER JOIN ---");
            String innerSql = "SELECT students.name, courses.course_name FROM students INNER JOIN courses ON students.course_id = courses.id";
            ResultSet rs1 = stmt.executeQuery(innerSql);
            while (rs1.next()) {
                System.out.println(rs1.getString("name") + " - " + rs1.getString("course_name"));
            }

            System.out.println("--- LEFT JOIN ---");
            String leftSql = "SELECT students.name, courses.course_name FROM students LEFT JOIN courses ON students.course_id = courses.id";
            ResultSet rs2 = stmt.executeQuery(leftSql);
            while (rs2.next()) {
                System.out.println(rs2.getString("name") + " - " + rs2.getString("course_name"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}