import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consl = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String text = consl.nextLine();
        String name = text.toLowerCase();
        System.out.println((name.equals("вячеслав")) ? "Привет Вячеслав" : "Нет такого имени");
        consl.close();
    }
}