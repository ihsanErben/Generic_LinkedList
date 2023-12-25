
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------------------");
        LinkedList x = new LinkedList();
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("1-add");
            System.out.println("2-remove");
            System.out.println("3-print");
            System.out.print("select: ");
            int sayi = scn.nextInt();
            switch (sayi) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    String data = scn.next();
                    x.add(data);
                    break;
                case 2:
                    x.remove();
                    break;
                case 3:
                    x.print();
                    break;
                default:
                    System.out.println("invalid value.");
                    break;
            }
            System.out.println("---------------------------");
        }
    }

    public <T> void arrayBastir(T[] array) {
        for (T boncuk : array) {
            System.out.print(boncuk + ", ");
        }
        System.out.println();
    }
}
