package lesson155;

import java.sql.*;

public class Main {
    static final String URL = "jdbc:mysql://localhost:3306/lesson155";
    static final String USER = "root";
    static final String PASSWORD = "senin_sifren";

    public static void main(String[] args) {
        System.out.println("--- 1. Məhsul əlavə olunur ---");
        create("Iphone", 1500.0, 1);
        create("MacBook", 3000.0, 2);

        System.out.println("\n--- 2. Bütün siyahı (Left Join) ---");
        read();

        System.out.println("\n--- 3. Məhsul yenilənir ---");
        update(1, "Iphone 15", 2000.0);
        read();

        System.out.println("\n--- 4. Ada görə axtarış ---");
        searchByName("Iphone");

        System.out.println("\n--- 5. Category_id-ə görə axtarış ---");
        searchByCategory(2);

        System.out.println("\n--- 6. Məhsul silinir ---");
        delete(2);
        read();
    }

    public static void create(String name, double price, int catId) {
        String sql = "INSERT INTO items (name, price, category_id) VALUES (?, ?, ?)";
        try (Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1, name);
            p.setDouble(2, price);
            p.setInt(3, catId);
            p.executeUpdate();
            System.out.println("Əlavə olundu: " + name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        String sql = "SELECT i.id, i.name, i.price, c.name AS category_name FROM items i LEFT JOIN categories c ON i.category_id = c.id";
        try (Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement s = c.createStatement();
             ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getDouble("price") + " | " + rs.getString("category_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(int id, String name, double price) {
        String sql = "UPDATE items SET name = ?, price = ? WHERE id = ?";
        try (Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1, name);
            p.setDouble(2, price);
            p.setInt(3, id);
            p.executeUpdate();
            System.out.println("Yeniləndi ID: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM items WHERE id = ?";
        try (Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setInt(1, id);
            p.executeUpdate();
            System.out.println("Silindi ID: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchByName(String name) {
        String sql = "SELECT i.id, i.name, i.price, c.name AS category_name FROM items i LEFT JOIN categories c ON i.category_id = c.id WHERE i.name LIKE ?";
        try (Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1, "%" + name + "%");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                System.out.println("Tapıldı -> " + rs.getString("name") + " | " + rs.getString("category_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchByCategory(int catId) {
        String sql = "SELECT i.id, i.name, i.price, c.name AS category_name FROM items i LEFT JOIN categories c ON i.category_id = c.id WHERE i.category_id = ?";
        try (Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setInt(1, catId);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                System.out.println("Kateqoriya üzrə -> " + rs.getString("name") + " | " + rs.getString("category_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}