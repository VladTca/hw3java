import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your age:");
        byte age = sc.nextByte();
        System.out.println("Enter your location:");
        String location = sc.next();
        sc.close();
        System.out.println(name + " (city:" + location + "), age:" + age);
    }
}