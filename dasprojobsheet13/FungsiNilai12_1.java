import java.util.Scanner;

public class FungsiNilai12_1 {
    static int jumlahMahasiswa;
    static int jumlahMinggu;
    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;

    public static void main(String[] args) {
        inputJumlahMahasiswaDanMinggu();
        inputDataNilaiMahasiswa();
        tampilkanNilaiMahasiswa();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }

    static void inputJumlahMahasiswaDanMinggu() {
        Scanner sc12 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc12.nextInt();

        System.out.print("Masukkan jumlah minggu: ");
        jumlahMinggu = sc12.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc12.next();
        }
        System.out.println("");
    }

    static void inputDataNilaiMahasiswa() {
        Scanner sc12 = new Scanner(System.in);
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai tugas " + namaMahasiswa[i] + " per minggu:");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc12.nextInt();
            }
        }
        System.out.println("");
    }

    static void tampilkanNilaiMahasiswa() {
        System.out.println("Nilai Mahasiswa:");
        System.out.print("Minggu\t");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + "\t");
        }
        System.out.println();

        for (int j = 0; j < jumlahMinggu; j++) {
            System.out.print("Minggu ke-" + (j + 1) + "\t");
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
    }

    static void cariHariNilaiTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < jumlahMinggu; j++) {
            int totalNilaiMinggu = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalNilaiMinggu += nilaiMahasiswa[i][j];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                hariTertinggi = j + 1;
            }
        }

        System.out.println("Hari dengan nilai tertinggi adalah Minggu ke-" + hariTertinggi);
        System.out.println("");
    }

    static void tampilkanMahasiswaNilaiTertinggi() {
        System.out.println("Mahasiswa dengan nilai tertinggi:");

        int nilaiTertinggi = 0;
        int indexMahasiswa = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilaiMahasiswa = 0;
            for (int j = 0; j < jumlahMinggu; j++) {
                totalNilaiMahasiswa += nilaiMahasiswa[i][j];
            }
            if (totalNilaiMahasiswa > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMahasiswa;
                indexMahasiswa = i;
            }
        }

        System.out.println(namaMahasiswa[indexMahasiswa] + " memiliki nilai tertinggi sebesar " + nilaiTertinggi);

        System.out.println("Rincian nilai per minggu:");
        for (int j = 0; j < jumlahMinggu; j++) {
            System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[indexMahasiswa][j]);
        }
        System.out.println("");
    }

}