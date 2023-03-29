import java.util.Scanner;

public class Determinan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a,b,c,d;
        double x1 = 0;
        double x2 = 0;
        double persamaan;
        String run;

        run = "Y";
        while(run.equals("Y")){
            System.out.println("============== PROGRAM PERSAMAAN KUADRAT ==============");
            System.out.print("Input a           : ");
            a = input.nextFloat();
            System.out.print("Input b           : ");
            b = input.nextFloat();
            System.out.print("Input c           : ");
            c = input.nextFloat();

            d = (b * b) - (4 * a * c);
            if (d > 0) {
                System.out.println("Determinan D>0");
                x1 = ((0 - b) + Math.sqrt(d)) / (2 * a);
                x2 = ((0 - b) - Math.sqrt(d)) / (2 * a);
            } else if (d == 0) {
                System.out.println("Determinan D=0");
                x1 = (0 - b) / (2 * a);
                x2 = x1;
            } else if (d < 0) {
                System.out.println("Determinan D<0");
                x1 = ((0 - b) / (2 * a)) + ((0 - Math.sqrt(d)) / (2 * a));
                x2 = ((0 - b) / (2 * a)) + ((0 - Math.sqrt(d)) / (2 * a));
            }
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
            persamaan = (a * (x1 * x1)) + (b * x2) + c;
            System.out.println("Hasil dari persamaan kuadrat ax^2 + bx + c adalah " + persamaan);
            System.out.println(" ");
            System.out.print("Input data lagi? [Y/T]    : ");
            run = input.next();
            System.out.println(" ");

        }
    }
}
