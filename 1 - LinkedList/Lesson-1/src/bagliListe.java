class dugum {
  int icerik;
  dugum ileri;

  public dugum(int icerik) {
    this.icerik = icerik;
    ileri = null;
  }
}

public class bagliListe {
  public static void main(String[] args) {
    dugum d1 = new dugum(5);
    dugum d2 = new dugum(6);
    dugum d3 = new dugum(8);

    d1.ileri = d2;
    d2.ileri = d3;
    dugum tmp = d1;
    while (tmp != null) {
      System.out.print(tmp.icerik + " --> ");
      tmp = tmp.ileri;
    }
    System.out.println();
  }
}