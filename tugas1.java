import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");

            if (scanner.hasNextInt()) {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1 -> loginAdmin(scanner);
                    case 2 -> loginMahasiswa(scanner);
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } else {
                System.out.println("Input harus berupa angka!");
            }
        }
    }

    public static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        String nimTerakhir = "511";

        if (username.equals("Admin" + nimTerakhir) && password.equals("password" + nimTerakhir)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    public static void loginMahasiswa(Scanner scanner) {
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        String namaValid = "hilmiy an naqiy bilal";
        String nimValid = "202410370110511";

        if (nama.equalsIgnoreCase(namaValid) && nim.equals(nimValid)) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}