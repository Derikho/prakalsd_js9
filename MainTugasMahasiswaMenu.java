import java.util.Scanner;

public class MainTugasMahasiswaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackTugasMahasiswa05 stackTugas = new StackTugasMahasiswa05(10); // Ukuran stack bisa disesuaikan

        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah"); // Opsi baru
            System.out.println("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();
            

            switch (pilihan) {
                case 1:
                    System.out.println("Nama: ");
                    String nama = input.nextLine();
                    System.out.println("NIM: ");
                    String nim = input.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa05 mahasiswa = new Mahasiswa05(nama, nim, kelas);
                    stackTugas.push(mahasiswa);
                    System.out.println("Tugas " + nama + " berhasil dikumpulkan");
                    System.out.println();
                    break;
                    case 2:
                    if (!stackTugas.isEmpty()) {
                        Mahasiswa05 mhsDinilai = stackTugas.peekBottom();
                        System.out.println("Menilai tugas dari " + mhsDinilai.nama);
                        System.out.println("Masukkan nilai (0-100): ");
                        int nilai = input.nextInt();
                        input.nextLine(); 
                        mhsDinilai.tugasDinilai(nilai);
                        String nilaiBiner = mhsDinilai.konversiDesimalKeBiner(nilai); 
                        System.out.println("Nilai Tugas " + mhsDinilai.nama + " adalah " + nilai);
                        System.out.println("Nilai Biner Tugas: " + nilaiBiner); 
                        System.out.println();
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
                        System.out.println();
                    }
                    break;
                case 3:
                    Mahasiswa05 mhsTeratas = stackTugas.peekBottom();
                    if (mhsTeratas != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + mhsTeratas.nama);
                        System.out.println();
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stackTugas.print();
                    break;
                case 5:
                    Mahasiswa05 mhsTerbawah = stackTugas.peekBottom();
                    if (mhsTerbawah != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + mhsTerbawah.nama);
                        System.out.println();
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                        System.out.println();
                    }
                    break;
                case 6:
                    int jumlahTugas = stackTugas.getSize();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlahTugas);
                    System.out.println();
                    break;    
                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println();
            }
            
        } while (pilihan != 0); // Lanjutkan loop hingga pengguna memilih 0 (atau opsi keluar lainnya)

        input.close();
    }
}