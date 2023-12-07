package kuyrukuygulama;

class Eleman {
  int icerik;
  Eleman ileri;

  public Eleman(int icerik) {
    this.icerik = icerik;
    this.ileri = null;
  }
}

public class Kuyruk2 {
  Eleman bas;
  Eleman son;

  public Kuyruk() {
    bas = null;
    son = null;
  }

  boolean bosmu() {
    return bas == null;
  }

  void Ekle(Eleman yeni) {
    if (!bosmu())
      son.ileri = yeni;
    else
      bas = yeni;
    son = yeni;
  }

  Eleman sil() {
    Eleman sonuc;
    sonuc = bas;
    if (!bosmu()) {
      bas = bas.ileri;
      if (bas == null)
        son = null;
    }
    return sonuc;
  }
}