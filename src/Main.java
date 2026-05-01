import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List list = new List();

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Додати елемент");
            System.out.println("2 - Додати елемент за індексом");
            System.out.println("3 - Видалити елемент");
            System.out.println("4 - Отримати елемент");
            System.out.println("5 - Кількість елементів");
            System.out.println("6 - Розмір буфера");
            System.out.println("7 - Вивести список");
            System.out.println("0 - Вихід");

            System.out.print("Ваш вибір: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Введіть число: ");
                    int value = scanner.nextInt();

                    list.add(value);

                    break;

                case 2:

                    System.out.print("Введіть індекс: ");
                    int indexAdd = scanner.nextInt();

                    System.out.print("Введіть число: ");
                    int valueAdd = scanner.nextInt();

                    list.addByIndex(indexAdd, valueAdd);

                    break;

                case 3:

                    System.out.print("Введіть індекс: ");
                    int indexRemove = scanner.nextInt();

                    list.removeByIndex(indexRemove);

                    break;

                case 4:

                    System.out.print("Введіть індекс: ");
                    int indexGet = scanner.nextInt();

                    int result = list.get(indexGet);

                    if (result != -1) {
                        System.out.println("Елемент: " + result);
                    }

                    break;

                case 5:

                    System.out.println("Кількість елементів: " + list.getSize());

                    break;

                case 6:

                    System.out.println("Розмір буфера: " + list.getCapacity());

                    break;

                case 7:

                    list.printList();

                    break;

                case 0:

                    System.out.println("Програма завершена");

                    break;

                default:

                    System.out.println("Неправильний вибір");
            }

        } while (choice != 0);

        scanner.close();
    }
}