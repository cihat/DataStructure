# Bubble Sort / Kabarcık Sıralaması

Kabarcık sıralamasında arka arkaya gelen 2 veri karşılaştırılıp, büyük olan değer küçük olan değerle yer değiştirir(swap).

```
Dizimiz => {5,7,2,9,6,1,3}

- 1.adım  => {5,2,7,6,1,3,9}

 - 2.adım  => {2,5,6,1,3,7,9}

  - 3.adım  => {2,5,1,3,6,7,9}

   - 4.adım  => {2,1,3,5,6,7,9}

    - 5.adım  => {1,2,3,5,6,7,9}
```

For döngümüz 1 kere çalıştığında(1.adım) dizinin en büyük elemanı sona geçmiş oluyor. For döngümüz 2.kez çalıştığında ise artık dizimizin son elemanını karşılaştırmasına gerek yoktur çünkü en büyük eleman sona geçmiş olacaktır.

Daha iyi anlamak adına şu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Bubble-Sort-Animation.gif)](http://www.farukgenc.com/Sorting-Animation/Bubble-Sort-Animation.gif)
