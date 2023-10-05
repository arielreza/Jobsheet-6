import java.util.Scanner;
public class Pemilihan2Percobaan118 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        System.out.print("Masukkkan Tahun : ");
        int tahun = input18.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
             } else {
                System.out.println("Bukan Tahun Kabisat");
             }
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }
        }
    }
