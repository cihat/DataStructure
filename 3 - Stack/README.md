### Stack.java

![code1](https://user-images.githubusercontent.com/57585087/99918076-8d253d80-2d25-11eb-88a0-93413a878638.png)

### Statik Yığıt ve Kuyruklar Nedir ?

#### Statik Yığılar

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

#### Statik Kuyruklar

<p>
Kuyruk mantığına gerek günlük hayatta gerekse bilgisayarda sıraya sokulması olay veya işlerde oldukça sık karşılaşırız. Kuyruk yığıttan farklı olarak iki uçludur; bir başı ve bir sonu vardır. Bu nedenle bilgiyi saklamak için bir diziye ve en az iki indekse ihtiyaç vardır.Şekil 1'de bir kuyruk mantığı şematik olarak verilmitir.

**Kuyruk mantığını gerçekleşmede en uygun yaklaşım diziyi daireselmiş gibi düşünüp eleman ekleme ve çıkarmada sürekli indis artırımına gitmektir.**

</p>

![screenShot3](https://user-images.githubusercontent.com/57585087/96136620-86283580-0f04-11eb-9009-127b4b8b0c97.png)
<br>
