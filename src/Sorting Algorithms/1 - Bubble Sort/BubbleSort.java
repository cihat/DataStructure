public class BubbleSort {

  void kabarcik(int[] dizi) {
    int i, tmp;
    boolean degistirdi = true;
    while (degistirdi) {
      degistirdi = false;
      for (i = 0; i < dizi.length - 1; i++) {
        // * Eğer bir sonraki eleman şuanda bulunan indisteki elemandan büyük ise yer
        // değiştirme işlemi yapıyoruz.
        if (dizi[i] > dizi[i + 1]) {
          degistirdi = true;
          tmp = dizi[i];
          dizi[i] = dizi[i + 1];
          dizi[i + 1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    BubbleSort bubble = new BubbleSort();
    int dizi[] = { 5, 7, 2, 9, 6, 1, 3 };
    bubble.kabarcik(dizi);
    for (int i = 0; i < dizi.length; i++) {
      System.out.println(dizi[i] + " ");
    }
  }
}