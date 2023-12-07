//Herbir elemanumızın veri yapısını oluşturuyoruz.
class Eleman {
  int sayi;
  Eleman ileri;

  public Eleman(int sayi) {
    this.sayi = sayi;
    this.ileri = null;
  }
}

// Elemanlarımızı Tek Yömlü Bağlu Listede tutuyoruz.
public class LinkedList {
  Eleman bas;// Baştaki elemanı tutuyoruz.
  Eleman son;//* Sondaki elemanı tutuyoruz.

  public LinkedList() {
    bas = null;// İlk olarak boş tanımlıyoruz.
    son = null;
  }

  public void basaEkle(Eleman yeni) {
    // Eğer hiç eleman yoksa gelen eleman hem başı hem de sonu gösteriyor.
    if (bas == null) {
      bas = yeni;
      son = yeni;
    } else {
      yeni.ileri = bas;
      bas = yeni;
    }
  }

  public void sonaEkle(Eleman yeni) {
    // Eğer hiç eleman yoksa gelen eleman hem baş hem de sonu gostermeli.basaEkle
    // fonk. da ki gibi.
    if (yeni == null) {
      bas = yeni;
      son = yeni;
    } else {
      // Eğer daha onceden eleman varsa yeni gelen eleman sonu göstermeli ve artık
      // sonsdfsadfsadfsdf
      // o oluyor.
      son.ileri = yeni;
      son = yeni;
    }
  }

  // arayaEkleme() method ile birlikte liste içinde aradığımız elemana kadar gidip
  // o elemanı bulduktan sonra hemen arkasına eklemek
  // istediğimiz elemanı ekliyoıroz.
  public void arayaEkleme(Eleman yeni, int aranan) {
    Eleman gecici = bas;
    while (gecici.ileri != null) {
      if (gecici.sayi != aranan) {
        yeni.ileri = gecici.ileri;
        gecici.ileri = yeni;
        break;
      } else {
        gecici = gecici.ileri;
      }
    }
    // Eğer sondaysa aradığımız eleman sona ekleme yapıyoruz.
    if (gecici == son && gecici.sayi == aranan) {
      son.ileri = yeni;
      son = yeni;
    }
  }

  // baş bir sonraki elemanı gösterdiğinde o elemanı artık kaybetmiş(silmiş)
  // oluyourz.
  public void bastanSil() {
    bas = bas.ileri;
    if (bas == null) {
      son = null;
    }
  }

  // son'dan önceki elemanı son yaparak sondaki elemanı silmiş oluruz.
  // Sondan önceki elemana da dezinme yaparak gidiyoruz.
  public void sondanSil() {
    Eleman gecici = bas;
    Eleman once = null;
    while (gecici != son) {
      once = gecici;
      gecici = gecici.ileri;
    }
    if (once == null) {
      bas = null;
    } else {
      once.ileri = null;
      son = once;
    }
  }

  // Aradığımız elemanı bulmdığumuzda öncesinde bulunan elemanla aradığımız
  // elemanın bir sonraki elemanı arasında
  // bağlantıyı yaparak araduğımız ekemanı silmiş oluyoruz.
  public void arananSil(int aranan) {
    Eleman yedek = bas;
    Eleman once = null;
    while (yedek != null) {
      if (yedek.sayi == aranan) {
        break;
      } else {
        once = yedek;
        yedek = yedek.ileri;
      }
    }
    if (once == null) {
      bas = bas.ileri;
    } else if (once != null) {
      once.ileri = yedek.ileri;
    }
  }

  // Eğer her yeni gelen eleman sıralı bir şekilde istiyorsak (Küçükten büyüğü)
  void siraliEkleme(Eleman yeni) {
    if (bas == null) {
      bas = yeni;
    } else {
      Eleman yedek = bas;
      Eleman once = null;

      // Gezinme işleminde kullandığımız 'yedek' değişkeni boş olmadığı ve yeni gelen
      // sayimiz bir önceki elemandan büyük
      // olduğu sürece bu döngü içerisine girecek.
      while (yedek != null && yedek.sayi < yeni.sayi) {
        if (yedek.sayi < yeni.sayi) {
          once = yedek;
          yedek = yedek.ileri;
        } else
          break;
      }
      if (once == null) {
        yeni.ileri = yedek;
        bas = yeni;
      }
      // Eğer daha önceden bir eleman varsa yeni gelen elemanin ilerisi artık bir
      // önceki elemanın ilerisini gösterecek
      // bir önceki elemaın ilerisinde artık yeni eleman olcağından dolayı bir nevi
      // 'araya ekleme' olacaktır.
      else {
        yeni.ileri = once.ileri;
        once.ileri = yeni;
      }
    }
  }

  // Burada ilk emelandan başlayıp son eleman boş olana kadar gezinip tek tek
  // hepsini bir String'e atıyoruz.
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
    LinkedList liste = new LinkedList(); // Liste sınıfından liste adında nesne oluşturuyoruz.
    Eleman a = new Eleman(5); // Yeni '5' değerinde bir eleman oluşturup
    liste.basaEkle(a);
    a = new Eleman(34);
    liste.sonaEkle(a);
    a = new Eleman(23);
    liste.basaEkle(a);
    a = new Eleman(12);
    liste.sonaEkle(a);
    a = new Eleman(4);
    liste.basaEkle(a); // 'başa ekleme' yapıyoruz.
    a = new Eleman(9); // Yeni bir eleman daha oluşturup
    liste.sonaEkle(a);// 'sona ekleme' yapıyoruz.
    a = new Eleman(35); // yeni bir eleman oluşturup
    liste.arayaEkleme(a, 5);// hangi elemandan sonra ekleneceğini belirtip 'araya ekleme' yapıyoruz.
    liste.sondanSil();// sondaki elemanı siler.
    System.out.println(liste.listele());// listelem() metodu tüm elemanları consola yazar.
  }
}
