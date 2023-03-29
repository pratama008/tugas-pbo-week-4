import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyakDetik, hari, jam, menit, detik, sisa;
        String run;

        run = "Y";
        while(run.equals("Y")){
            System.out.println("======== Program Konversi Detik ========");
            System.out.print("Detik     : ");
            banyakDetik = input.nextInt();
            sisa = banyakDetik % 86400;
            hari = (banyakDetik - sisa) / 86400;
            banyakDetik = sisa;
            sisa = banyakDetik % 3600;
            jam = (banyakDetik - sisa) / 3600;
            banyakDetik = sisa;
            sisa = banyakDetik % 60;
            menit = (banyakDetik - sisa) / 60;
            detik = sisa;

            System.out.println("Hari      : " + hari);
            System.out.println("Jam       : " + jam);
            System.out.println("Menit     : " + menit);
            System.out.println("Detik     : " + detik);
            System.out.println(" ");
            System.out.print("Input data lagi? [Y/T]    : ");
            run = input.next();
            System.out.println(" ");
        }
    }
}
