
// Kelas utama untuk menguji penambahan pengguna
public class Main {
    public static void main(String[] args) {
        // Mencoba menambahkan pengguna dengan data valid
        addUser("Adi", "adi@indomail.com");  // Pengguna valid
        // Mencoba menambahkan pengguna dengan data tidak valid
        addUser("", "inibukanemail.com");         // Pengguna tidak valid
    }

    // Fungsi untuk menambahkan pengguna baru
    public static void addUser(String name, String email) {
        // Memeriksa apakah nama dan email valid sebelum membuat objek User
        if (userValidator.isValidName(name) && userValidator.isValidEmail(email)) {
            User user = new User(name, email);
            System.out.println("Pengguna '" + user.getName() + "' dengan email '" + user.getEmail() + "' berhasil ditambahkan.");
        } else {
            System.out.println("Data pengguna tidak sesuai. Periksa lagi nama dan email yang dimasukkan.");
        }
    }
}
