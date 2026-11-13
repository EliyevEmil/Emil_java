package lesson155;

import java.sql.*;

public class Main {
    static final String URL = "jdbc:mysql://localhost:3306/senin_baza_adin";
    static final String USER = "root";
    static final String PASSWORD = "Emil_Aliyev!2014!@#";

    public static void main(String[] args) {
    }

    public static void mehsulElaveEt(String name, double price, int categoryId) {
        String query = "INSERT INTO products (name, price, category_id) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, categoryId);
            pstmt.executeUpdate();
            System.out.println("Məhsul uğurla əlavə olundu!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mehsullariGoster() {
        String query = "SELECT p.id, p.name, p.price, c.name AS category_name " +
                "FROM products p LEFT JOIN categories c ON p.category_id = c.id";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        " | Ad: " + rs.getString("name") +
                        " | Qiymət: " + rs.getDouble("price") +
                        " | Kateqoriya: " + rs.getString("category_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mehsulYenile(int id, String newName, double newPrice) {
        String query = "UPDATE products SET name = ?, price = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, newName);
            pstmt.setDouble(2, newPrice);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("Məhsul məlumatları yeniləndi!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mehsulSil(int id) {
        String query = "DELETE FROM products WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Məhsul silindi!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void adaGoreAxtar(String searchName) {
        String query = "SELECT p.id, p.name, p.price, c.name AS category_name " +
                "FROM products p LEFT JOIN categories c ON p.category_id = c.id " +
                "WHERE p.name LIKE ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "%" + searchName + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Tapıldı -> Ad: " + rs.getString("name") +
                        " | Qiymət: " + rs.getDouble("price") +
                        " | Kateqoriya: " + rs.getString("category_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void kateqoriyayaGoreAxtar(int catId) {
        String query = "SELECT p.id, p.name, p.price, c.name AS category_name " +
                "FROM products p LEFT JOIN categories c ON p.category_id = c.id " +
                "WHERE p.category_id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, catId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Kateqoriya məhsulu -> Ad: " + rs.getString("name") +
                        " | Qiymət: " + rs.getDouble("price") +
                        " | Kateqoriya: " + rs.getString("category_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}