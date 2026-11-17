package lesson156;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Xeta: Parol en azi 6 simvol olmalidir!");
        } else {
            this.password = password;
        }
    }

    public String getPassword() {
        if (password == null) {
            return "Parol teyin edilmeyib!";
        }
        return password.substring(0, 2) + "****";
    }
}