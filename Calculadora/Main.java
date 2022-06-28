import java.util.Scanner;

class Main{

    public static void clearBuffer(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        opSoma s = new opSoma();

        s.soma();

    }
}