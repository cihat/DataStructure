public class App {

  // Bir dizinin k'nıncı elemanını sile algoritma
  static void dizidenSil(int[] dizi, int k) {
    int i;
    for (i = k; i < dizi.length - 1; i++) {
      dizi[i] = dizi[i + 1];
    }
    for (int item : dizi) {
      System.out.println(item);
    }
  }

  static void diziyeEkle(int dizi[], int k, int yeni) {
    int i;
    for (i = dizi.length - 2; i >= k; i--) {
      dizi[i + 1] = dizi[i];
    }
    dizi[k] = yeni;
    for (int item : dizi) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    // // Bir dizinin k'nıncı elemanını sile algoritma
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    // dizidenSil(arr, 3);

    // Bir dizinin k'ıncı yerine yeni eleman ekleyen algoritma
    diziyeEkle(arr, 5, 90);
  }
}
