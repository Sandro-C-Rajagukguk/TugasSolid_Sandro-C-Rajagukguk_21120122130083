// Kelas untuk menangani validasi pengguna (tanggung jawab: memvalidasi data pengguna)
public class userValidator {

    // Memvalidasi apakah nama pengguna valid (tidak kosong dan panjang minimal 2 karakter)
    public static boolean isValidName(String name) {
        return name != null && name.length() >= 2;
    }

    // Memvalidasi apakah email pengguna valid (memeriksa apakah mengandung '@')
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
