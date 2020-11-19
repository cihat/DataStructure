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

  // Bir dizinin k'ıncı yerine yeni eleman ekleyen algoritma
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

  // Sıralı bir dizide ikili arama yöntemiyle k sayısını arayan algoritma
  static int dizideAra(int[] dizi, int k) {
    int sol = 0, sag = dizi.length - 1, orta;
    orta = (sol + sag) / 2;
    while (sol <= sag) {
      if (k < dizi[orta]) {
        sag = orta - 1;
      } else {
        if (k > dizi[orta]) {
          sol = orta + 1;
        } else {
          return orta;
        }
      }
      orta = (sol + sag) / 2;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    // Bir dizinin k'nıncı elemanını sile algoritma
    // dizidenSil(arr, 3);

    // Bir dizinin k'ıncı yerine yeni eleman ekleyen algoritma
    // diziyeEkle(arr, 5, 90);

    // Sıralı bir dizide ikili arama yöntemiyle k sayısını arayan algoritma
    System.out.println(dizideAra(arr, 5));
  }
}
