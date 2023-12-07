import java.util.*;

//https://www.geeksforgeeks.org/graph-coloring-set-2-greedy-algorithm/

class Graph {
  private int V;
  private LinkedList<Integer> adj[]; // Komşuluklar tutuluyor
  private String[] color = { // 9 renkten fazlasini renklendiremeyecek.
      // Eger daha fazla renklendirme yapilacaksa buraya renk eklenmeli
      "Beyaz", "Mavi", "Kirmizi", "Mor", "Yesil", "Turuncu", "Sari", "Pembe", "Siyah"

  };

  Graph(int v) { // constructor metot, nesne tanimlanirken dugum sayisini alacak
    V = v; // düğüm sayısı
    adj = new LinkedList[v]; // Graf bir bağlı listede tutulacak
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  // Grafa düğüm ekle
  void addEdge(int v, int w) {
    adj[v].add(w);
    adj[w].add(v);
  }

  void coloring() {
    int result[] = new int[V];

    // Atanmamış düğümler -1 olarak alınıyor
    for (int i = 0; i < result.length; i++) {
      result[i] = -1;
    }

    result[0] = 0; // ilk köşenin rengi 0. indisteki deger olacak
    boolean available[] = new boolean[V];
    for (int i = 0; i < available.length; i++) {
      available[i] = true;
    }

    for (int u = 1; u < V; u++) {

      Iterator<Integer> it = adj[u].iterator();
      while (it.hasNext()) {
        int i = it.next();
        if (result[i] != -1)
          available[result[i]] = false;
      }

      int cr;
      for (cr = 0; cr < V; cr++) {
        if (available[cr])
          break;
      }

      result[u] = cr;

      for (int i = 0; i < available.length; i++) {
        available[i] = true;
      } // degerleri sifirla
    }

    for (int u = 0; u < V; u++) {
      System.out.println("Köşe " + u + " ---> " + color[result[u]]);
    }
  }

  public static void main(String args[]) { // O(V^2 + E)

    System.out.println("Renklendirme: ");

    Graph g = new Graph(7);
    g.addEdge(0, 1);
    g.addEdge(0, 4);
    g.addEdge(0, 6);
    g.addEdge(1, 2);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.addEdge(3, 6);
    g.addEdge(4, 5);

    g.coloring();
  }
}