import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlPenggunaan;
        double tarifListrik = 1500.0, total;
        boolean cekPenggunaan;

        System.out.println("jumlah penggunaan listrik: ");
        jmlPenggunaan = input.nextInt();
        
        total = jmlPenggunaan * tarifListrik;
        cekPenggunaan = jmlPenggunaan > 500;

        System.out.println("total tagihan listrik: " + total);
        System.out.println("apakah penggunaan listrik melebihi 500: " + cekPenggunaan);
    }
    
}