// Kelas untuk menyimpan data pengguna (tanggung jawab: menyimpan informasi pengguna)
public class User {
    private String name;
    private String email;

    // Konstruktor untuk menyimpan nama dan email pengguna
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Mendapatkan nama pengguna
    public String getName() {
        return name;
    }

    // Mendapatkan email pengguna
    public String getEmail() {
        return email;
    }
}