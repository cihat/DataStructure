## Kodların Ekran Kaydı

- Düğüm![codeData1](https://user-images.githubusercontent.com/57585087/96137601-807f1f80-0f05-11eb-83f9-85ceed85994a.png)
- Eleman Oluşturma![codeData2](https://user-images.githubusercontent.com/57585087/96161577-217ad400-0f20-11eb-945a-e2e3581667f4.png)
- Baş, son belirtme ve LinkedList Oluşturma ![codeData3](https://user-images.githubusercontent.com/57585087/96161581-22136a80-0f20-11eb-98be-fa2df01918c4.png)
- BaşaEkleme Fonksiyonu![codeData4](https://user-images.githubusercontent.com/57585087/96161582-23449780-0f20-11eb-814c-2b0be2e9714b.png)
- Sona Ekleme Fonksiyonu![codeData5](https://user-images.githubusercontent.com/57585087/96161584-23dd2e00-0f20-11eb-8da4-e7686bade9ee.png)
- ArayaEkleme Fonksiyonu![codeData6](https://user-images.githubusercontent.com/57585087/96161587-250e5b00-0f20-11eb-9aa3-30d0053adae9.png)
- bastanSil Fonksiyonu![codeData7](https://user-images.githubusercontent.com/57585087/96161593-263f8800-0f20-11eb-8695-7b125480c934.png)
- sondanSil Fonksiyonu![codeData8](https://user-images.githubusercontent.com/57585087/96161596-26d81e80-0f20-11eb-896e-57eb70109048.png)
- arananSil Fonksiyonu![codeData9](https://user-images.githubusercontent.com/57585087/96161599-28094b80-0f20-11eb-96b8-c218dadb81e8.png)
- siraliEkleme Fonksiyonu![codeData10](https://user-images.githubusercontent.com/57585087/96161607-293a7880-0f20-11eb-9c97-99ca80a20ded.png)
- listele Fonksiyonu![codeData11](https://user-images.githubusercontent.com/57585087/96161624-2f305980-0f20-11eb-99d6-7483380f561c.png)
- Main Fonksiyonu![codeData12](https://user-images.githubusercontent.com/57585087/96161568-1f187a00-0f20-11eb-8144-b1c9a7b55b23.png)

<b>[Kod Kaynağı](https://github.com/Genc/Data-Structures/blob/master/1%20-%20LinkedList/LinkedList.java)</b>
<br>

<hr>

# Linked List (Linkli Liste veya Bağlı Liste)

Yazan:Şadi Evren ŞEKER

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
