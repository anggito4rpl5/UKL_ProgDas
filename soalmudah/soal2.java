package soalmudah;
import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        //program menentukan bilangan prima atau bukan

        Scanner prima = new Scanner(System.in);
        System.out.print("masukkan bilangan : ");
        int a = prima.nextInt();
        boolean b = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("bilangan prima");
        } else {
            System.out.println("bukan bilangan prima");
        }

     
        


        prima.close();

    }
    
}
