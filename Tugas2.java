import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        int jamKerja, upah, gaji;
        double bonus, pajak, gajiBersih;

        System.out.println("Jumlah jam kerja: ");
        jamKerja = input.nextInt();

        System.out.println("Jumlah upah: ");
        upah = input.nextInt();
        
        gaji = jamKerja * upah;
        bonus = (gaji * 0.10) + gaji;
        pajak = bonus * 0.05;
        gajiBersih = bonus - pajak;

        System.out.println("Gaji bersih yang didapatkan karyawan itu adalah " + gajiBersih);

    }
}
