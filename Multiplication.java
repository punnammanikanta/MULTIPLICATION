 import java.util.Scanner;
    public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num =scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.err.println(num+"*"+i+"="+num*i);
        }
        scanner.close();
    }
}

