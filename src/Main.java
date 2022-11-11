import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static void arrayCrIter(int[] a, int size, int min, int max){
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random() * (max - min) + min);
        }
    }

    static void printIter(int[] a, int size){
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\t", a[i]);
        }
        System.out.println();
    }

    static void taskOneIter(int[] a, int size){
        int highest = a[0];
        for (int i = 1; i < size; i++) {
            if(highest < a[i]){
                highest = a[i];
            }
        }
        System.out.println("Найбільше значення масиву: " + highest);
    }

    static void taskTwoIter(int[] a, int size){
        int n = 0;
        int sumToTheLast = 0;
        for (int i = 0; i < size; i++) {
            if(a[i] > 0){
                n = i;
            }
        }
        for (int i = 0; i < n; i++) {
            sumToTheLast += a[i];
        }
        System.out.println("Сума до останнього додатнього числа: " + sumToTheLast);
    }

    static void taskThreeIter(int[] a, int size){
        System.out.print("Введіть перше число інтервалу: "); int ld = scan.nextInt();
        System.out.print("Введіть останнє число інтервалу: "); int rd = scan.nextInt();
        int n = 0;
        for (int i = 0; i < size - n; i++) {
            if (ld <= a[i] && a[i] <= rd) {
                for (int j = i; j < size - 1; j++) {
                    a[j] = a[j + 1];
                }
                i--;
                n++;
            }
        }
        for (int i = size - n; i < size; i++) {
            a[i] = 0;
        }
    }

    public static void main(String[] args) {

        System.out.print("Введіть кількість елементів: ");int size = scan.nextInt();
        System.out.print("Введіть мінімальний елемент: ");int min = scan.nextInt();
        System.out.print("Введіть максимальний елемент: ");int max = scan.nextInt();

        int[] a = new int[size];
        arrayCrIter(a, size, min, max);
        printIter(a, size);
        taskOneIter(a, size);
        taskTwoIter(a, size);
        taskThreeIter(a, size);
        printIter(a, size);
    }
}