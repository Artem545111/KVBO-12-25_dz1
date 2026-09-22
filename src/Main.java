import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         boolean run = true;

        System.out.println("Цыганков Артём Ярославович, КВБО-12-25");
        System.out.println("Введите номер задания: ");

        while (run) {
            String input = scanner.next().toLowerCase();
            switch (input) {
                case "1":
                    first();
                    run = false;
                    break;
                case "2":
                    second();
                    run = false;
                    break;
                case "3":
                    third(new String[]{"Hello", "World", "and", "Artem"});
                    run = false;
                    break;
                case "4":
                    fourth();
                    run = false;
                    break;
                case "5":
                    fifth();
                    run = false;
                    break;
                default:
                    System.out.println("Неверный номер!");
                    break;
            }
        }
    }

    public static void  first() {
        double sum = 0;
        double sred = 0;
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println((int)sum);
        sred = sum / a.length;
        System.out.println(sred);
    }

    public static void  second() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        if (sc.hasNextInt()) {
            int l = sc.nextInt();
            int[] a = new int[l];
            for (int i = 0; i<l; ++i) {
                System.out.println("Введите элемент №" +i);
                if (sc.hasNextInt()) {
                    a[i]=sc.nextInt();
                } else {
                    System.out.println("Не то число");
                }
            }
            int sum = 0;
            int i = 0;
            while (i<l) {
                sum+=a[i];
                i++;
            }
            int max = a[0];
            int min = a[0];
            int n = 0;
            do {
                if (a[n] < min) {
                    min = a[n];
                }
                if (a[n] > max) {
                    max = a[n];
                } n++;
            } while (n<l);
            System.out.println("Сумма: " +sum);
            System.out.println("Максимальное: " +max);
            System.out.println("Минимальное: " +min);
        } else {
            System.out.println("Неправильное число");
            System.exit(0);
        }
    }

    public static void  third(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void fourth() {
        for (double i = 1; i <= 10; i++) {
            double g = 1 / i;
            System.out.printf("%.5f%n", g);
        }
    }
    public static void  fifth() {
        int a = 5;
        System.out.println(a + "! = " + fact(a));
    }

    public static int fact(int a) {
        int f = 1;
        if (a == 0) {
            return 1;
        } else {
            for (int n = 1; n<a+1; n++) {
                f=f*n;
            }
            return f;
        }
    }
}