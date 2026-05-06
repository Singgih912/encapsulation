import java.util.Scanner;

class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Simulasi Mahasiswa
        System.out.println("--- Input Data Mahasiswa ---");
        System.out.print("Nama Mahasiswa: ");
        String sName = input.nextLine();
        System.out.print("Alamat Mahasiswa: ");
        String sAddress = input.nextLine();
        
        // Perbaikan: Ganti student menjadi Student
        student mhs = new student(sName, sAddress);
        mhs.addCourseGrade("PBO", 90);
        mhs.addCourseGrade("Basis Data", 85);
        
        System.out.println(mhs.toString());
        mhs.printGrades();
        System.out.println("Rata-rata: " + mhs.getAverageGrade());

        // Simulasi Dosen
        System.out.println("\n--- Input Data Dosen ---");
        System.out.print("Nama Dosen: ");
        String tName = input.nextLine();
        System.out.print("Alamat Dosen: ");
        String tAddress = input.nextLine();

        // Perbaikan: Ganti teacher menjadi Teacher
        teacher dsn = new teacher(tName, tAddress);
        System.out.println(dsn.toString());

        // Simulasi tambah/hapus kursus
        String matkul = "Pemrograman Java";
        if (dsn.addCourse(matkul)) {
            System.out.println("Berhasil menambah matkul: " + matkul);
        }
        if (!dsn.addCourse(matkul)) {
            System.out.println("Gagal! Matkul " + matkul + " sudah ada.");
        }

        input.close();
    }
}