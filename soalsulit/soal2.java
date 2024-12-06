package soalsulit;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        System.out.println("Program validasi angka negatif dalam array");
        Scanner in = new Scanner(System.in);

        int[] angka = new int[15]; 

        for (int i = 0; i < angka.length; i++) { 
            System.out.print("Masukkan angka ke-" + (i+1)  + ": ");
            angka[i] = in.nextInt();
        }
        boolean tidaknegatif = false;
        boolean adaNegatif = false;
        if (tidaknegatif) {
            System.out.println("Elemen yang mengandung angka negatif:");
        }
        

     

        for (int i = 0; i < angka.length; i++) { 
            if (angka[i] < 0) { 
                
       

                System.out.println(angka[i]);
                adaNegatif = true;
                tidaknegatif = true;
            }
        }

        if (!adaNegatif) {
            System.out.println("(Tidak ada angka negatif di dalam array.)");
        }
        in.close(); 
    }
}

