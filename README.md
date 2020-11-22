<div align="center">
<h1>Veri Yapıları</h1>

![Data-Structures](https://user-images.githubusercontent.com/57585087/99726347-71bcf700-2ac7-11eb-8bdc-913f8a590f59.jpg)

## Ders Notları

[Yrd.Doç.Dr.Burhan ERGEN Ders Notları](https://github.com/cihatdev/DataStructure/tree/master/Ders%20Notlar%C4%B1/Burhan%20Ergen%20Ders%20Slaytlar%C4%B1) ||
[Olcay Taner Yıldız Derst Slaytları](https://github.com/cihatdev/DataStructure/tree/master/Ders%20Notlar%C4%B1/Olcay%20Taner%20Y%C4%B1ld%C4%B1z%20Derst%20Slaytlar%C4%B1)

<hr>

## Konular

<ul>
  <li>

[Linked List](https://github.com/cihatdev/DataStructure/tree/master/1%20-%20LinkedList)

  </li>
  <li>

[Doubly Linked List(Çift Bağlantılı Listeler)](https://github.com/cihatdev/DataStructure/tree/master/2%20-%20DoublyLinkedL%C4%B0st)

  </li>
  <li>

[Stack(Yığıt)](https://github.com/cihatdev/DataStructure/tree/master/3%20-%20Stack)

  </li>
  <li>

[Queue(Kuyruk)](https://github.com/cihatdev/DataStructure/tree/master/4%20-%20Queue)

  </li>
  <li>

[Binary Search Tree(Ikili Arama Ağaçları)](https://github.com/cihatdev/DataStructure/tree/master/5%20-%20BinarySearchTree)

  </li>
  <li>

[Tree](https://github.com/cihatdev/DataStructure/tree/master/6%20-%20Tree)

  </li>
  <li>

[Hash Table(Hash Tablosu)](https://github.com/cihatdev/DataStructure/tree/master/7%20-%20HashTable)

  </li>
    <li>

[Graph(Graf)](https://github.com/cihatdev/DataStructure/tree/master/8%20-%20Graph)

  </li>

</ul>

<hr>

## Algoritmalar

[Algorithms by Topic](https://github.com/BomBoch/javascript-algorithms?organization=BomBoch&organization=BomBoch#algorithms)

<hr>

### [Awesome DataScience](https://github.com/academic/awesome-datascience#twitter-accounts)

<hr>

#### [Veri Yapıları Dersleri YouTube PlayList Linkleri ](https://github.com/cihatdev/DataStructure#veri-yap%C4%B1lar%C4%B1-ders-videolar%C4%B1playlistler)

#### [Podcasts](https://github.com/academic/awesome-datascience#podcasts-1)

#### [Bloggers](https://github.com/academic/awesome-datascience#bloggers)

#### [Books](https://github.com/academic/awesome-datascience#books-1)

#### [Ekran Görüntüleri(codes)](https://github.com/cihatdev/DataStructure#kodlar%C4%B1n-ekran-kayd%C4%B1)

#### [Github Groups](https://github.com/BIDS)

#### [Youtube Videos & Channels](https://github.com/academic/awesome-datascience#youtube-videos--channels)

#### [Telegram Channels](https://github.com/academic/awesome-datascience#telegram-channels)

#### [Data Sets](https://github.com/academic/awesome-datascience#data-sets)

#### [Infographic](https://github.com/academic/awesome-datascience#infographic)

#### [Competitions](https://github.com/academic/awesome-datascience#competitions)

#### [Twitter Accounts](https://github.com/academic/awesome-datascience#twitter-accounts)

#### [Other Lists](https://github.com/academic/awesome-datascience#other-lists)

</div>
<hr>

## Veri Yapılarıları ve Algoritmalar

### 1. Veri Yapısı Nedir ?

<p>
Verinin bilgisayar belleğinde saklanma şekli ve organizasyonuna <b>Veri Yapısı</b> denir. Veri tipleri, verinin türüne göre farklılık gösterir. İşaretli olmayan bir pozitif sayı doğrudan ikili yapıda tutulurken , işaretli sayı ikinin tümleyeni şeklinde tutulur.
</p>
<p>Verinin bellekte kapladığı alan, erişim şekli ve hızı kavramları organizasyonun yapısı farklılaşmasını, uygun organizasyon tasarımı yapılmasını gerekli kılar. Verilere özel olarak, belirli veriler ayrı ayrı ulaşma ihtiyacı yoksa verilerin sıralı bir biçimde tutulmasına ihtiyaç yoktur.Fakat eğer bir arama yapılacaksa bu durumda verilerin sıralı olması bir avantaj sağayacaktır. Eğer verilerin eklenmesi ve çıkarılması fazlaca yapılıyorsa ve sınır belirli değilse bu durumda ağaç yapısının kullanılması ayrıca bir kolaylık getirecektir.</p>

<p>Verilerin bilgisayar belliğinde tutulması için organizasyon tasarımında belirli temel düşünceler yer alır. Bellekte fazla yer kaplamayacak şeklinde en uygun yapıda tutulması gereklidir. Ayrıca verilerin oluşturulması, eklenmesi, çıkarılması ve ulaşım şekli konusunda kolay ve etkin algoritmalar sunması gereklidir.
</p>

<p>
Verilerin bilgisayar belleğinde tutulması için yapılacak tasarımda amaca göre farklılık gösterebilir.Bellek boyununun artmaması öncelik ise hızdan, hız ve esneklik söz konusu ise bellekten feragat edilebilir. **Hangi organizasyon yapısı kullanılcağı tamamen yapılacak uygulamaya bağlıdır.** Doğrudan ve kesin olarak cevap verilemez.
</p>
<br>

### 2. Statik Yığıt ve Kuyruklar Nedir ?

#### 2.1 Statik Yığılar

<p>
Burada statik yapıdan kasıt boyut değişi olmayan dizi mantığının kullanılmasıdır. Yığıtlar kullanımı en kolay liste yapılarındandır. Yığıtta ekleme ve çıkarma sadece bir uçtan yapılır ve bu yığıtın tepe kısmıdır.
</p>
<p>
Yığıt mantığı için genelde ekeleme için itme (push) ve çıkarma için çekme (pop) deyimleri kullanılır. Programlama yapılırken kullanılan alt program çağırmalarında en çok kullanılan yöntemdir. Her alt program çağırıldığında CPU içerikleri yığıta itilir ve alt program bitiminde yıpıttan çekilerek CPU'nun program koşumuna nerede kaldığı , değkenlerin ne durumda olduğu hatırlatır.En son giren ilk çıkar (LIFO:Last In Fırst OUt) mantığını gerçekleşir.
</p>

<p>
  Yığıt matığının gerçekleştirilebilmesi için yığıtta saklanacak verileri tutacak bir diziye ve yığıtın en üst kısmını(son eklenene elemanı) işaret edecek bir değişkene ihtiyaç duyulur. Gerek yığıt vbe gerekse başka zaman programlama yapılırken program, anlamlı olacak şekilde metodlar halinde verilmesi hem anlaşılırlığı  artırır hem de programın esnek ve yazılan metodların başka programlarda da kullanılması kolaylığını getirir. Bu mantık içerisinde yığıt mantığı kod olarak şöyle verilebilir.
</p>

![screenShot](https://user-images.githubusercontent.com/57585087/96131782-495b3f00-0f02-11eb-86a8-b835edc0354f.png)

![screenShot2](https://user-images.githubusercontent.com/57585087/96132657-53ca0880-0f03-11eb-8c19-02b3790bb15d.png)

#### 2.1 Statik Kuyruklar

<p>
Kuyruk mantığına gerek günlük hayatta gerekse bilgisayarda sıraya sokulması olay veya işlerde oldukça sık karşılaşırız. Kuyruk yığıttan farklı olarak iki uçludur; bir başı ve bir sonu vardır. Bu nedenle bilgiyi saklamak için bir diziye ve en az iki indekse ihtiyaç vardır.Şekil 1'de bir kuyruk mantığı şematik olarak verilmitir.

**Kuyruk mantığını gerçekleşmede en uygun yaklaşım diziyi daireselmiş gibi düşünüp eleman ekleme ve çıkarmada sürekli indis artırımına gitmektir.**

</p>

![screenShot3](https://user-images.githubusercontent.com/57585087/96136620-86283580-0f04-11eb-9009-127b4b8b0c97.png)
<br>

#### 3.1 Bağlı Listeler

Bağlı listeler, bir elemanın kendinden sonra gelen verinin yerini göstermesi olarak tanımlanabilir. Dizi mantığı kullanılarak da her ne kadar bağlı liste oluşturmak mümkünse de geneld verini hücre (düğüm) yapıları şeklinde tutulduğu liste oluşumu kullanılır. **Çünkü düğüm yapısının kullanan bu mantıkta kaç eleman olduğunu bilmeniz ve sunuru önceden belirlemenizin gereği yoktur.** Şekil 3.1'de bağlı liste mantığı şematik olrak verilmiştir. Liste başı 'Ahmet' verisi içeren düğüm ve liste sonu 'Hasan' verisi içeren düğümdür.
![screenShot4](https://user-images.githubusercontent.com/57585087/96139258-5890bb80-0f07-11eb-92ee-793f099d5588.png)
![screenShot7](https://user-images.githubusercontent.com/57585087/96140297-71e63780-0f08-11eb-9fcd-2ae32f580c58.png)
![screenshot5](https://user-images.githubusercontent.com/57585087/96140300-73176480-0f08-11eb-8fab-6172671c3002.png)
![screenShot6](https://user-images.githubusercontent.com/57585087/96140302-73affb00-0f08-11eb-921e-08f8f13a8188.png)

<br>

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

**Örnek Bağlı liste kodları:(C++)**

- [Basit bir bağlı liste örnek kodu 10 adet sayı ekleyerek ekrana basan kod](https://www.sadievrenseker.com/datastr/linkedlist1.cpp)
- [Basit bir bağlantılı liste örnek kodu NULL kontrolü ile 10 adet sayı ekleyerek ekrana basan kod. Liste boyutu bilinmiyorken liste sonuna kadar gider.](https://www.sadievrenseker.com/datastr/linkedlist2.cpp)
- [Bir bağlı listede arama yapan kod Arama sonucunda bulunna düğümün işaretcisini döndürür.](https://www.sadievrenseker.com/datastr/linkedlist3.cpp)
- [Circular (dairesel) Bağlı liste Dairesel bağlı listeye 10 sayı ekleyerek ekrana basar.](https://www.sadievrenseker.com/datastr/cicularlinkedlist1.cpp)
- [ Çift Bağlı liste Çift yönlü bağlı listeye 10 sayı ekleyerek listenin ters bağlantısı üzerinden listeyi ters basan kod.](https://www.sadievrenseker.com/datastr/doubly1.cpp)

**Yazan:Şadi Evren ŞEKER**

[Kaynakça](http://bilgisayarkavramlari.sadievrenseker.com/2007/05/03/linked-list-linkli-liste-veya-bagli-liste/#:~:text=%C3%87ift%20Ba%C4%9Fl%C4%B1%20Dairesel%20listeye%20ekleme,ekleme%20yapan%20ve%20silen%20kod.)

<hr>

## **Veri Yapıları Ders Videoları(PlayListler)**

- [Veri Yapıları PlayList Şadi Evren ŞEKER](https://www.youtube.com/playlist?list=PLh9ECzBB8tJN9bckI6FbWB03HkmogKrFT)
- [Veri Yapılarına Giriş ve Bağlı Listeler (Linked List) -VY1](https://www.youtube.com/watch?list=PLh9ECzBB8tJN9bckI6FbWB03HkmogKrFT&v=r3uOBb3BM-0)
- [75 Derste Veri Yapıları Murat Yücedağ](https://www.youtube.com/playlist?list=PLKnjBHu2xXNNwV1Twc3UtaMBqGJx3CCrU)
- [C++ ile Veri Yapıları ( Data Structure)Yazılıma Gönül Ver](https://www.youtube.com/playlist?list=PLfs1gAT4S8yJuI9WLcTwsANzsHloTz1p5)
- [Veri Yapıları ve Algoritmalar Ders Anlatım Bilgisayar Mühendisliği](https://www.youtube.com/playlist?list=PLDUOF2Be-kzlga9FbVXHgRCJ41E9yPq9Z)
- [Veri Yapıları Kayhan Ayar](https://www.youtube.com/playlist?list=PLIM5iw4GHbNXr22B5Oy9l3v43_y1OlR9Z)
- [Data Structures and Algorithms Jenny's lectures CS/IT NET&JRF](https://www.youtube.com/playlist?list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU)
- [Data Structures RobEdwards](https://www.youtube.com/playlist?list=PLpPXw4zFa0uKKhaSz87IowJnOTzh9tiBk)
  <hr>

## Gelecek Dersler

<br>

## Gelecek Dersler

<br>

## Gelecek Dersler

<br>

## Gelecek Dersler

<br>

## Gelecek Dersler

<br>

## Gelecek Dersler

<br>

## BigO CheatSheet

![BigO() CheatSheet](https://user-images.githubusercontent.com/57585087/99726750-f7d93d80-2ac7-11eb-8c07-fa50758c2300.jpeg)

<br>

## Kodların Ekran Kaydı

## LinkedList

- **Temel Düğüm Mantığı**![codeData1](https://user-images.githubusercontent.com/57585087/96137601-807f1f80-0f05-11eb-83f9-85ceed85994a.png)
- **Düğüm**![codeData1](https://user-images.githubusercontent.com/57585087/96137601-807f1f80-0f05-11eb-83f9-85ceed85994a.png)
- **Eleman Oluşturma**![codeData2](https://user-images.githubusercontent.com/57585087/96161577-217ad400-0f20-11eb-945a-e2e3581667f4.png)
- **Baş, son belirtme ve LinkedList** Oluşturma ![codeData3](https://user-images.githubusercontent.com/57585087/96161581-22136a80-0f20-11eb-98be-fa2df01918c4.png)
- **BaşaEkleme Fonksiyonu**![codeData4](https://user-images.githubusercontent.com/57585087/96161582-23449780-0f20-11eb-814c-2b0be2e9714b.png)
- **Sona Ekleme Fonksiyonu**![codeData5](https://user-images.githubusercontent.com/57585087/96161584-23dd2e00-0f20-11eb-8da4-e7686bade9ee.png)
- **ArayaEkleme Fonksiyonu**![codeData6](https://user-images.githubusercontent.com/57585087/96161587-250e5b00-0f20-11eb-9aa3-30d0053adae9.png)
- **bastanSil Fonksiyonu**![codeData7](https://user-images.githubusercontent.com/57585087/96161593-263f8800-0f20-11eb-8695-7b125480c934.png)
- **sondanSil Fonksiyonu**![codeData8](https://user-images.githubusercontent.com/57585087/96161596-26d81e80-0f20-11eb-896e-57eb70109048.png)
- **arananSil Fonksiyonu**![codeData9](https://user-images.githubusercontent.com/57585087/96161599-28094b80-0f20-11eb-96b8-c218dadb81e8.png)
- **siraliEkleme Fonksiyonu**![codeData10](https://user-images.githubusercontent.com/57585087/96161607-293a7880-0f20-11eb-9c97-99ca80a20ded.png)
- **listele Fonksiyonu**![codeData11](https://user-images.githubusercontent.com/57585087/96161624-2f305980-0f20-11eb-99d6-7483380f561c.png)
- **Main Fonksiyonu**![codeData12](https://user-images.githubusercontent.com/57585087/96161568-1f187a00-0f20-11eb-8144-b1c9a7b55b23.png)

<hr/>
<br/>
MIT License

Copyright (c) 2020 Cihat Salik

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
