# Insertion Sort / Eklemeli Sıralama

Dizimizin 2.elamından başlayarak bir önceki elemanlarla karşılaştırma yapılarak sona doğru ilerler. Eğer karşılaştırma yaptığı eleman daha büyükse **sağa** doğru kaydırılır. Kendinide bir nevi araya eklemiş olur.

```
Dizimiz => {33,44,21,45,25,14}

- 1.adım  => {33 | 44 - 21 - 45 - 25 - 14}

 - 2.adım  => {33 - 44 | 21 - 45 - 25 - 14}

  - 3.adım  => {21 - 33 - 44 | 45 - 25 - 14}

   - 4.adım  => {21 - 33 - 44 - 45 | 25 - 14}

    - 5.adım  => {21 - 25 - 33 - 44 - 45 | 14}

     - 6.adım  => {14 - 21 - 25 - 33 - 44 - 45 |}
```

-> Bu algoritmada **_5.adımdan -> 6.adıma_** geçilen kısıma dikkatle göz atılırsa en sondaki eleman diğer verilerden küçük olduğu için en başa getirelecek. Bu da tüm dizinin 1 birim sağa kaydırmamıza sebeb verecek. Insertion Sort'un olumsuz durumlarından birisi.

Daha iyi anlamak adına şu animasyonu izleyebilirsiniz.

[![](http://www.farukgenc.com/Sorting-Animation/Insertion-Sort-Animation.gif)](http://www.farukgenc.com/Sorting-Animation/Insertion-Sort-Animation.gif)
