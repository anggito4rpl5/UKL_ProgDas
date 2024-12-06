
package soalsedang;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner bola = new Scanner(System.in);
        System.out.println("(anda ingin menghitung luas bola) ya/tidak ");
        String jawaban = bola.nextLine();

        if ("ya".equals(jawaban)) {
            System.out.print("masukkan jari jari bola : ");
            int jari = bola.nextInt(); // Menggunakan long untuk variabel

            double luas = hitungLuas(jari); // Menghitung luas dengan tipe double
            System.out.println(" luas bola diketahui = " + luas );

        } else if ("tidak".equals(jawaban)) {
            System.out.print("program dihentikan  ");
        } else {
            System.out.print("pilih hanya ya/tidak ");
        }

        bola.close();
    }

    // fungsimethod dan parameter
    public static double hitungLuas(int jarijari) {
        double phi = 3.14 
        

        
        ;
        return phi * 4 * jarijari * jarijari;
    }
}
