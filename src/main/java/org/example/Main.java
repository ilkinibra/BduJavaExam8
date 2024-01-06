import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bir ədəd daxil edin: ");
    int eded = scanner.nextInt();

    int cem = 0;
    for (int i = 1; i <= eded; i++)
    {
        if (i % 5 == 0)
        {
        System.out.println(i);
        cem += i;
        }
    }
    System.out.println("5-ə bölünən elementlərin cəmi: " + cem);
  }
}