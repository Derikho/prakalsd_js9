public class StackTugasMahasiswa05 {
    Mahasiswa05[] stack;
    int top;
    int size;

    // Konstruktor
    public StackTugasMahasiswa05(int size) {
        this.size = size;
        stack = new Mahasiswa05[size];
        top = -1;
    }

    // Mengecek apakah stack penuh
    public boolean isFull() {
        return top == size - 1;
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Menambahkan tugas ke stack
    public void push(Mahasiswa05 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // Mengeluarkan tugas dari stack
    public Mahasiswa05 pop() {
        if (!isEmpty()) {
            Mahasiswa05 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Melihat data tugas di posisi paling atas
    // Melihat data tugas di posisi paling bawah (pertama kali dikumpulkan)
    public Mahasiswa05 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Mendapatkan jumlah tugas yang sudah dikumpulkan
    public int getSize() {
        return top + 1;
    }
   // Menampilkan seluruh tugas mahasiswa beserta nilainya
   public void print() {
    System.out.println("Nama\tNIM\tKelas\tNilai");
    for (int i = 0; i <= top; i++) {
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t" + stack[i].nilai);
    }
    System.out.println("");
}}