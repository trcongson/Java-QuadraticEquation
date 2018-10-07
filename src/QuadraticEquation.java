import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        System.out.println("Vui lòng nhập vào a, b, c: ");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0){
            System.out.println("Phương trình có nghiệm là: " + (-c/b));
        }else {
            double delta = b*b - 4*a*c;

            if (delta<0){
                System.out.println("Phương trình vô nghiệm");
            }else if (delta == 0){
                double x = -b/2*a;
                System.out.println("Phương trình có một nghiệm kép là: " + x);
            }else {
                double x1 = (-b - Math.sqrt(delta))/2*a;
                double x2 = (-b + Math.sqrt(delta))/2*a;

                System.out.println("Phương trình có 2 nghiệm là: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            }
        }
    }
}
