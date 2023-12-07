### DoublyLinkedList.java

![doublyLinkedList](https://user-images.githubusercontent.com/57585087/99945256-60087780-2d85-11eb-9bc7-fd4254f5fd09.png)

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
