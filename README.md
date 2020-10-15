# **Data Structure**

- [LinkList Dersleri(Örnekleri)](https://github.com/cihatdev/DataStructure/tree/master/LinkedList)
- [Gelecek Dersler](#)
- [Gelecek Dersler](#)
- [Gelecek Dersler](#)
- [Gelecek Dersler](#)
- [Gelecek Dersler](#)

## Veri Yapılarıları ve Algoritmalar

### 1. Veri Yapısı Nedir ?

<p>
Verinin bilgisayar belleğinde saklanma şekli ve organizasyonuna **Veri Yapısı** denir. Veri tipleri, verinin türüne göre farklılık gösterir. İşaretli olmayan bir pozitif sayı doğrudan ikili yapıda tutulurken , işaretli sayı ikinin tümleyeni şeklinde tutulur.
</p>

Verinin bellekte kapladığı alan, erişim şekli ve hızı kavramları organizasyonun yapısı farklılaşmasını, uygun organizasyon tasarımı yapılmasını gerekli kılar. Verilere özel olarak, belirli veriler ayrı ayrı ulaşma ihtiyacı yoksa verilerin sıralı bir biçimde tutulmasına ihtiyaç yoktur.Fakat eğer bir arama yapılacaksa bu durumda verilerin sıralı olması bir avantaj sağayacaktır. Eğer verilerin eklenmesi ve çıkarılması fazlaca yapılıyorsa ve sınır belirli değilse bu durumda ağaç yapısının kullanılması ayrıca bir kolaylık getirecektir.

Verilerin bilgisayar belliğinde tutulması için organizasyon tasarımında belirli temel düşünceler yer alır. Bellekte fazla yer kaplamayacak şeklinde en uygun yapıda tutulması gereklidir. Ayrıca verilerin oluşturulması, eklenmesi, çıkarılması ve ulaşım şekli konusunda kolay ve etkin algoritmalar sunması gereklidir.

Verilerin bilgisayar belleğinde tutulması için yapılacak tasarımda amaca göre farklılık gösterebilir.Bellek boyununun artmaması öncelik ise hızdan, hız ve esneklik söz konusu ise bellekten feragat edilebilir. **Hangi organizasyon yapısı kullanılcağı tamamen yapılacak uygulamaya bağlıdır.** Doğrudan ve kesin olarak cevap verilemez.

**Yazan: Yrd.Doç.Dr. Burhan Ergen**
[Kaynakça](https://github.com/cihatdev/DataStructure/blob/master/Ders%20Notlar%C4%B1/Burhan%20Ergen%20Ders%20Slaytlar%C4%B1/B%C3%B6l%C3%BCm1Analiz.pdf)

<br>
<hr>

## Linked List (Linkli Liste veya Bağlı Liste)

Bağlı liste herhangi bir tipten node’ların (düğümlerin) yine kendi tiplerinden düğümlere işaret etmesi (point) ile oluşan zincire verilen isimdir. Buna göre her düğümde kendi tipinden bir pointer olacak ve bu pointerlar ile düğümler birbirine aşağıdaki şekilde bağlanacaktır.

![alt text](http://bilgisayarkavramlari.com/wp-content/uploads/2007/05/singly_linked_list.png)

Linked List’in avantajı, hafızayı dinamik olarak kullanmasıdır. Buna göre hafızadan silinen bir bilgi için hafıza alanı boşaltılacak veya yeni eklenen bir bilgi için sadece o bilgiyi tutmaya yetecek kadar hafıza alanı ayrılacaktır.

Yukarıdaki figürde görülen bağlı listeye çok benzeyen ve yine çok kullanılan bir bağlı liste uygulaması da çift bağlı liste (doubly linked list) uygulamasıdır.

![](http://bilgisayarkavramlari.com/wp-content/uploads/2007/05/doublylinkedlist.png)

Buna göre her düğüm, hem kendinden öncekine hem de kendinden sonrakine bağlanır, bu sayede liste üzerinde ileri ve geri ilerlemek mümkündür.

![](http://www.bilgisayarkavramlari.com/wp-content/uploads/050911_1332_BalListel1.png)

Yukarıdaki şekilde, sırasıyla, Tek bağlı liste (singular linked list), çift uçlu bağlı liste (double ended linked list), çift bağlı liste (doubly linked list) ve dairesel bağlı liste (circular linked list) görülmektedir.

![](http://www.bilgisayarkavramlari.com/wp-content/uploads/050911_1332_BalListel2.png)

Listelerin üzerinde işlem yapılırken, dolaşıcı (iterator) şeklinde bir gösterici tanımlanır. Bu dolaşıcı veri aranması, ekleme veya silme gibi işlemler sırasında listenin ilgili elemanına kadar gidilmesini sağlar. Listenin ilgili elemanına gidildikten sonra silme veya ekleme gibi işlemler yapılırken göstericilerde (pointers) yapılan değişikliklerin, listeyi etkilememesini sağlar.

Örneğin bir bağlı listeye yeni bir eleman eklenmesi sırasında aşağıdaki adımlar izlenir:

1. Ekleme işlemini yapılacağı aralıktan önceki düğüme dolaşıcı tarafından gidilir.
2. Yeni düğüm oluşturularak, sonrasına, dolaşıcının sonrası atanır.
3. Dolaşıcının sonrasına ise yeni düğüm atanır.

![](http://www.bilgisayarkavramlari.com/wp-content/uploads/050911_1332_BalListel3.png)

Yukarıdaki şekilde bu ekleme işlemi sırasıyla gösterilmiştir. İlk şekilde dolaşıcı ilgili düğüme gelmiş, ikinci şekilde yeni bir düğüm eklenmiş ve sonrasına, dolaşıcının sonrası atanmış ve son şekilde ise dolaşıcı ile gösterilen düğümün sonrasına yeni düğüm eklenmiştir.

Aynı durumu çift bağlı listeler için ele alacak olursak:

![](http://www.bilgisayarkavramlari.com/wp-content/uploads/050911_1332_BalListel4.png)

Yukarıdaki şekilde öncelikle ekleme yapılacak aralığa dolaşıcı tarafından gidilir. İkinci adımda yeni düğüm eklenir. Arından göstericiler, yukarıdaki şekilde anlatıldığı gibi sırayla atanır.

Bağlı listeden bir düğümün silinmesi

![](http://www.bilgisayarkavramlari.com/wp-content/uploads/050911_1332_BalListel5.png)

Bağlı listeden eleman silinmesi sırasında, listede silinecek olan elemandan önceki düğüme kadar dolaşıcı ile gidilir. Dolaşıcının sonrasına, sonrasının sonrası atanır. Bu sayede ilk başta dolaşıcının sonrasında olan düğüm listeden kaldırılmış ve ulaşılamaz hale gelmiş olur. Ardından bu eleman istenirse hafızadan da kaldırılır.

Bağlı listelerin nesne yönelimli programlama dillerinde pointer tipi bulunmamasından dolayı kodlanması biraz farklıdır. Bilindiği gibi C++ gibi melez (hem C hem de nesne yönelimli programlamayı destekler) diller dışında JAVA, C# gibi dillerde gösterici (pointer) bulunmaz. Bunun yerine nesne göstericisi (object referrer) bulunur. Bu değişken tipleri esas olarak bir sınıf(Class)‘dan türetilmiş bir nesneyi(object) gösterebilen değişkenlerdir. Bu değişkenlerin aslında birer göstericiden farkı yoktur.

**Bağlı listenin anlatıldığı Videolar(PlayListler)**

- [Veri Yapıları PlayList Şadi Evren ŞEKER](https://www.youtube.com/playlist?list=PLh9ECzBB8tJN9bckI6FbWB03HkmogKrFT)
- [Veri Yapılarına Giriş ve Bağlı Listeler (Linked List) -VY1](https://www.youtube.com/watch?list=PLh9ECzBB8tJN9bckI6FbWB03HkmogKrFT&v=r3uOBb3BM-0)
- [75 Derste Veri Yapıları Murat Yücedağ](https://www.youtube.com/playlist?list=PLKnjBHu2xXNNwV1Twc3UtaMBqGJx3CCrU)
- [C++ ile Veri Yapıları ( Data Structure)Yazılıma Gönül Ver](https://www.youtube.com/playlist?list=PLfs1gAT4S8yJuI9WLcTwsANzsHloTz1p5)
- [Veri Yapıları ve Algoritmalar Ders Anlatım Bilgisayar Mühendisliği](https://www.youtube.com/playlist?list=PLDUOF2Be-kzlga9FbVXHgRCJ41E9yPq9Z)
- [Veri Yapıları Kayhan Ayar](https://www.youtube.com/playlist?list=PLIM5iw4GHbNXr22B5Oy9l3v43_y1OlR9Z)
- [Data Structures and Algorithms Jenny's lectures CS/IT NET&JRF](https://www.youtube.com/playlist?list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU)
- [Data Structures RobEdwards](https://www.youtube.com/playlist?list=PLpPXw4zFa0uKKhaSz87IowJnOTzh9tiBk)

**Örnek Bağlı liste kodları:(C++)**

- [Basit bir bağlı liste örnek kodu 10 adet sayı ekleyerek ekrana basan kod](https://www.sadievrenseker.com/datastr/linkedlist1.cpp)
- [Basit bir bağlantılı liste örnek kodu NULL kontrolü ile 10 adet sayı ekleyerek ekrana basan kod. Liste boyutu bilinmiyorken liste sonuna kadar gider.](https://www.sadievrenseker.com/datastr/linkedlist2.cpp)
- [Bir bağlı listede arama yapan kod Arama sonucunda bulunna düğümün işaretcisini döndürür.](https://www.sadievrenseker.com/datastr/linkedlist3.cpp)
- [Circular (dairesel) Bağlı liste Dairesel bağlı listeye 10 sayı ekleyerek ekrana basar.](https://www.sadievrenseker.com/datastr/cicularlinkedlist1.cpp)
- [ Çift Bağlı liste Çift yönlü bağlı listeye 10 sayı ekleyerek listenin ters bağlantısı üzerinden listeyi ters basan kod.](https://www.sadievrenseker.com/datastr/doubly1.cpp)

**Yazan:Şadi Evren ŞEKER**

[Kaynakça](http://bilgisayarkavramlari.sadievrenseker.com/2007/05/03/linked-list-linkli-liste-veya-bagli-liste/#:~:text=%C3%87ift%20Ba%C4%9Fl%C4%B1%20Dairesel%20listeye%20ekleme,ekleme%20yapan%20ve%20silen%20kod.)
<br>

<hr>

## Gelecek Dersler

<br>
<hr>

## Gelecek Dersler

<br>
<hr>

## Gelecek Dersler

<br>
<hr>

## Gelecek Dersler

<br>
<hr>

## Gelecek Dersler

<br>
<hr>

## Gelecek Dersler

<br>
<hr>
