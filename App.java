import java.util.Scanner;
public class App {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào độ dài cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào độ dài cạnh c: ");
        int c = scanner.nextInt();
        if (isTriangle(a, b, c)) {
            System.out.println("Ba cạnh này tạo thành một tam giác.");
            if (isEquilateral(a, b, c)) {
                System.out.println("Tam giác này là tam giác đều.");
            } else if (isIsosceles(a, b, c)) {
                System.out.println("Tam giác này là tam giác cân.");
            } else if  (isRightTriangle(a, b, c)) {
                System.out.println("Tam giác này là tam giác vuông.");
            } else if (isScalene(a, b, c)) {
                System.out.println("Tam giác này là tam giác thường.");
            }       
        } else {
            System.out.println("Ba cạnh này không tạo thành một tam giác.");
        }
        scanner.close();}
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;}
    public static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;}
    public static boolean isIsosceles(int a, int b, int c) {
        return a == b || a == c || b == c;}
    public static boolean isScalene(int a, int b, int c) {
        return a != b && a != c && b != c;}
    public static boolean isRightTriangle(int a, int b, int c) {
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;}
        if (a > c) {
            temp = a;
            a = c;
            c = temp;}
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
            double epsilon = 1e-15; 
            return Math.abs(a * a + b * b - c * c) < epsilon;
    }
}

