# Quick Sort / Hızlı Sıralama

-> Dizinin ilk indisi pivot olarak seçilir.(Rastgele de seçilebilir.) Sonrasında 2.eleman **sol**, dizimizin en sonundaki eleman ise **sağ** değişkeniyle tutulur. Sonra pivot değerimiz sol-sağ değişkenleri ile karşılaştırılır. Eğer soldaki tutulan eleman pivot değerimizden **küçük** ise ve sağ değişkeninde tutulan sayı pivottan **büyük** ise değiştirme işlemi uygulanır. Ve Ardından **sol** 1 adım sağa, **sağ** bir adım sol'a kaydırılarak tekrar karşılaştırmaya devam edilir. Eğer ki şart sağlanmaz ise(sağ tutulan eleman işi bozdu mesela) sağ'ı bir adım sola kaydırarak devam ediyoruz.

-> Olayın sonunda elimizde ilk başta seçtiğimiz(pivot) değerimizden küçükler solda büyükler sağda sıralanmış bir yapı oluşuyor. Bizde pivot değerimizi bu 2 listenin arasına(ortasına) koyuyoruz. Aynı işlemler oluşan sol dizi ve sağ dizi için tekrarlanıyor.

-> Aşağıdaki diyagramda pivot **ortadaki** eleman seçilmiş ve i **sağ** değişkeni j ise **sol** değişkenini temsil ediyor :)

[![](http://www.farukgenc.com/Sorting-Animation/quick-sort.png)](http://www.farukgenc.com/Sorting-Animation/quick-sort.png)

##### Daha iyi anlamak adına şu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Quicksort-Animasyon.gif)](http://www.farukgenc.com/Sorting-Animation/Quicksort-Animasyon.gif)
