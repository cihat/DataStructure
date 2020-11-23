# Selection Sort / Seçmeli Sıralama

Dizimizdeki en küçük eleman bulunur ve başa alınır bu tüm listenin gezilmesi ile sağlanır. İlk indisten başlayıp dizinin sonuna kadar gidip, karşılaştırmalar yapılıp daha küçük bir sayı bulunduysa yer değiştirilip bu sefer döngümüz bir sonraki indisten başlayıp devam etmelidir. (optimize)

```
Dizimiz => {5,7,2,9,6,1,3}

- 1.adım  => {1,7,2,9,6,5,3}

 - 2.adım  => {1,2,7,9,6,5,3}

  - 3.adım  => {1,2,3,9,6,5,7}

   - 4.adım  => {1,2,3,5,6,9,7}

    - 5.adım  => {1,2,3,5,6,7,9}
```

Dizimiz ilk indisten başlayıp tüm elemanlarla ilk indisteki elemanımızı karşılaştırıyoruz.Sonrasında yer değiştirme(swap) işlemi uygulanır. Eğer listedeki hiç bir eleman küçük değilse yer değiştirme işlemi yapılmaz.

Daha iyi anlamak adına şu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Selection-Sort-Animation.gif)](http://www.farukgenc.com/Sorting-Animation/Selection-Sort-Animation.gif)
