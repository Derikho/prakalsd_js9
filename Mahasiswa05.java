public class Mahasiswa05 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    // Konstruktor
    public Mahasiswa05(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // Nilai default jika belum dinilai
    }

    // Method untuk memberi nilai tugas
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    // Method untuk konversi desimal ke biner (berdasarkan nilai tugas)
    public String konversiDesimalKeBiner(int desimal) {
        if (desimal < 0) {
            return "Nilai tidak valid untuk konversi biner (harus non-negatif)";
        }
        if (desimal == 0) {
            return "0";
        }
        StackKonversi stackKonversi = new StackKonversi(); // Gunakan StackKonversi yang Anda berikan
        while (desimal > 0) {
            int sisa = desimal % 2;
            stackKonversi.push(sisa);
            desimal = desimal / 2;
        }
        String biner = "";
        while (!stackKonversi.isEmpty()) {
            biner += stackKonversi.pop();
        }
        return biner;
    }
}

// Kelas StackKonversi (sesuai dengan yang Anda berikan)
class StackKonversi {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi() {
        this.size = 32; // Asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            System.out.println("Stack kosong!");
            return -1; // Atau throw exception
        }
    }
}