# Merge Sort / Birleştirmeli Sıralama

Parçala ve Fethet(Divide & Conquer) algoritmasıdır. Sıralanacak olan veriler dizinin ortasından itibaren ikiye bölünerek, tek bir eleman kalana kadar ayrıştırılır.

```
Dizimiz => {38,27,43,3,9,82,10}

- 1.adım  => {38,27,43,3} - {9,82,10}

 - 2.adım  => {38,27} - {43,3} - {9,82} - {10}

  - 3.adım  => {38} - {27} - {43} - {3} - {9} - {82} - {10}

   - 4.adım  =>  {27,38} - {3,43} - {9,82} - {10}

    - 5.adım  => {3,27,38,43} - {9,10,82}

     - 6.adım  => {3,9,10,27,38,43,82}
```

-> Yukarıda verilen örneği şimdi inceleyelim. İlk olarak yapılan şey dizi boyutunu 2'ye bölerek(7/2=3.5 ~= 4) bölünecek yeri buluyoruz.Sonrasında ortaya çıkan 2 diziyide tekrar 2 ye bölerek bu örnek için 4 adet dizi oluşmuş oldu. Bu adımlar her bir eleman ayrı bir dizi oluşana kadar(bknz:**3.adım**) devam eder.

-> Sonrasında **_birleştirme_** aşamasına geçilir.4.adımda görüleceği üzere ilk 2 elemanı karşılaştırır ve sıralar. Sonrasında diğer iki elemanı karşılaştırır ve kendi içinde sıralar. Bu şekilde sıralayıp parçaladıklarını tek tek birleştirecek. Her biri tek elemanken **2.adım** daki halini geri alacak ancak farkı **sıralanmış** olması olacak. Sonrasında **5.adım** 'da ise 1.adımdaki halini alacak ancak yine farkı **sıralanmış** olması olacak. **6.adım**'da ise tüm listeyi sıralamış bir şekilde oluşturmuş olacak.

**--> Dipnot** : 4.adım'da başlayan sıralama işlemlerinde ilk iki dizinin ilk önce ilk elemanlarına bakıyor sonrasında ona göre birleştirme yapıyor büyüklük küçüklük ile yerleştirme yapıyoruz bir nevi.

    Yukarıda verilen örneğimizin diyagramınıda inceleyebilirsiniz

[![](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Algoritmasi-Diagram.png)](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Algoritmasi-Diagram.png)

##### Daha iyi anlamak adına şu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Animasyon.gif)](http://www.farukgenc.com/Sorting-Animation/Merge-Sort-Animasyon.gif)
