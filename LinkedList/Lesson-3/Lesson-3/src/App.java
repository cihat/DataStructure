import java.util.Scanner;

public class App {
  private static final String LÜFTEN_BIR_SAYI_GIRINIZ = "Lüften Bir Sayı Giriniz:";

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println(LÜFTEN_BIR_SAYI_GIRINIZ);
    int number = scanner.nextInt();
    scanner.close();
    System.out.println(number * 2);
  }
}
