class Eleman {
  int sayi;
  Eleman ileri;
  Eleman geri;

  public Eleman(int sayi) {
    this.sayi = sayi;
    this.ileri = null;
    this.geri = null;
  }
}

/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {
  // * Elemanlarımızı çift yönlü bağlı listede tutuyoruz.
  Eleman bas;
  Eleman son;

  public DoublyLinkedList() {
    // * ilk başta boş olarak tanımlıyoruz.
    bas = null;
    son = null;
  }

  public void basaEkle(Eleman yeni) {
    // * Eğer hiç eleman yoksa yeni gelen Eleman hem başı hem sonu gösteriyor.
    if (bas == null) {
      bas = yeni;
      son = yeni;
    } else {
      /*
       * //* Eğer var ise yeni gelen elemanın ilerisi başı, başın gerisi yeni elemanı,
       * //* baş'ta artık yeni elemanı göstererek başa ekleme yapmış oluyoruz.
       */
      yeni.ileri = bas;
      bas.geri = yeni;
      bas = yeni;
    }
  }

  public void sonaEkle(Eleman yeni) {
    // * Eğer hiç eleman yoksa yeni gelen Eleman hem sonu hem de başı gösteriyor.
    if (bas == null) {
      bas = yeni;
      son = yeni;
    } else {
      /**
       * //* Eğer var ise yeni gelen var ise elemanın gerisi sonu olur, sonun ilerisi
       * //* ise yeni elemanı, böylece son'a yeni elemanı gönderirsek sona ekleme -
       * //* yapmış oluruz.
       */
      yeni.geri = son;
      son.ileri = yeni;
      son = yeni;
    }
  }

  public void bastanSil() {
    /**
     * //* Eğer baştaki elemanın ilerisi boş ise tek eleman var ise "bas==son"'dur.
     * //* bu nedenle sonu null yaparak tek elemanı siliyoruz.
     */
    if (bas.ileri == null) {
      son = null;
    } else {
      /**
       * //* Eğer bir çok eleman var ise, baştaki elemanın ilerisinin gerisi artık--
       * //* 'null' gösterecek ve baş bir sonraki elemanı gösterdiğinde o elemanı--
       * //* silmiş olacacığız.
       */
      bas.ileri.geri = null;
      bas = bas.ileri;
    }
  }

  public void sondanSil() {
    /**
     * //* Eğer baştaki elemanın ilerisi boşsa tek eleman var ise bas==son'dur --
     * //* bu nedenle başı null yaparak tek elemanı siliyoruz.
     */
    if (bas.ileri == null) {
      bas = null;
    } else {
      /**
       * //*Tek eleman değil ise son elemanın gerisinin ilerisi artık'null'gösterecek.
       * //*Bu nedenle son bir önceki elemanı gösterdiğinde sondan silme işlemini
       * --//* gerçekleştirmiş olacağız. (Bağı koparma işlemini yapıyoruz.)
       */
      son.geri.ileri = null;
      son = son.geri;
    }
  }

  public void arayaEkle(int nereye, Eleman eklenecekSayi) {
    // * Bu metod ile birlikte liste içinde aradığımız elemana kadar gidip o elemanı
    // * bulduktan sonra hemen arkasına eklemek istediğimiz elemanı ekliyoruz.
    Eleman yedek = bas;
    while (yedek.sayi != nereye) {
      yedek = yedek.ileri;
      if (yedek == null) {
        System.out.println("Hiç Eleman Yok.");
      }
    }
    if (yedek == son) {
      eklenecekSayi.ileri = null;
      son = eklenecekSayi;
    } else {
      eklenecekSayi.ileri = yedek.ileri;
      yedek.ileri.geri = eklenecekSayi;
    }
    eklenecekSayi.geri = yedek;
    yedek.ileri = eklenecekSayi;
  }

  public void girilenSil(int aranan) {
    // * Aranan elemana kadar gezinme işlemi yapıp.sonrasında aranan elemanın
    // * gerisinin ilerisi artık aranan elemanın ilerisini gösterdiğinde
    // * aradığımız elemanı gösteren bağları kopartmış oluyoruz bu sebeble
    // * silinmiş/kaybolmuş oluyor.
    Eleman yedek = bas;
    while (yedek.sayi != aranan) {
      yedek = yedek.ileri;
      if (yedek == null) {
        System.out.println("Boş!");
      }
    }
    if (yedek == bas) {
      bas = yedek.ileri;
    } else {
      yedek.geri.ileri = yedek.ileri;
    }
  }

  String listele() {
    Eleman yedek = bas;
    String liste = "";
    while (yedek != null) {
      liste = liste + yedek.sayi + "-->";
      yedek = yedek.ileri;
    }
    return liste;
  }

  public static void main(String[] args) {
    DoublyLinkedList liste = new DoublyLinkedList();// ? Liste sınıfından liste adında bir nesne oluşturuyoruz.
    Eleman yeni = new Eleman(5);// !Yeni bir eleman oluşturuluyor.
    liste.basaEkle(yeni);// todo başa ekleme yapıyoruz.
    yeni = new Eleman(6); // * yeni bit eleman daha oluşturuyoruz.
    liste.sonaEkle(yeni); // ! sona ekleme yapıyoruz.
    yeni = new Eleman(12);
    liste.arayaEkle(5, yeni); // * Listemizde bulunan 5 elemanından sonraya 12 sayısını eklemek istiyoruz.
    System.out.println(liste.listele());
  }
}