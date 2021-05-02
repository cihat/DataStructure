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

[Medium Yazısı](https://medium.com/@tolgahan.cepel/do%C4%9Frusal-veri-yap%C4%B1lar%C4%B1-3-y%C4%B1%C4%9F%C4%B1t-stack-6c5db18ee934)

Bilginin geliş sırasına göre, en son gelen elemana ilk erişilen liste yapısına yığın (stack) denir. Verilere yalnız bir uçtan erişim sağlanır.
Bu erişimde Last-In-First-Out (LIFO) prensibi vardır. Yani son giren eleman, ilk çıkar. Örneğin üst üste dizilen kitapları, yalnızca en üsttekine erişecek şekilde düşünebiliriz.
Stack tasarımı dizi üzerinde veya bağlı liste ile yapılabilir. Bağlı liste kullanarak boyutu sabit olmayan bir stack oluşturabiliriz. Dizi kullanmak için ise sabit bir boyut belirlemeliyiz.
......

### [Stack (Yığın) mertmekatronik.com/ Yazısı ](https://mertmekatronik.com/veri-yapilari-yigin-stack)
<br/>

![](https://www.tutorialspoint.com/data_structures_algorithms/images/stack_representation.jpg)

Yığın veri yapısı en kolay veri yapısı türüdür. Çünkü yığın veri yapısı tabanca şarjörüne benzer. Biraz daha derine gidersek, kuyruk yapısına benzeyen bir yapı var ve bu yapı ile, bir algoritma da işlemin sonunda üretilen veriler yığın yapısının en üstüne eklenir.

### Stack yapısı işleyişi

LIFO - LAST IN FIRST OUT - SON GİREN İLK ÇIKAR
FILO - FIRST IN LAST OUT - İLK GİREN SON ÇIKAR


Tabanca şarjörü örneği çok akılda kalıcıdır. Girdiğimiz veriler üst üste yerleştiği için ilk giren son çıkan oluyor.

![](https://i.stack.imgur.com/bOga5.png)

Push = Stack' e veri ekleme

Pop =  Stack' den veri silme

Peki, bu durumun dezavantajı nedir?

Bir algoritma işlemi sırasında orta sıralarda bulunan verilerden birinin kullanılması gerekiyorsa, o zaman bu veriye kadar olan veriler yığın yapısından çıkar ve gerekli veri algoritmaya aktarılır, ardından çıkan veriler tekrar yığına aktarılır. Algoritma, veri çıkarken bekler ve bu işlem zaman alır.

Gelelim Kodlamasına 


```cpp
#include 
#include 
#define SIZE 10
int top = -1;
int array[SIZE];
void push(element){
 if(top == SIZE - 1){
  printf("ERR! STACK OVERFLOW\n");
  return;
 }
 top = top + 1;
 array[top] = element;
 printf("%d ADDED TO STACK\n",element);
}
void pop(){
 top = top - 1;
}
int Top(){
 return array[top];
}
int isEmpty(){
 if(top == -1)
  return 1;
 else
  return 0;
}
void print(){
 int i;
 printf("Stack: ");
 for(i=0;i<=top;i++){
  printf("%d  ",array[i]);
 }
 printf("\n");
}
int main(int argc, char *argv[]) {
 push(2);
 print();
 push(4);
 print();
 push(8);
 print();
 push(34);
 push(5);
 push(76);
 push(23);
 print();
 printf("Top element : %d\n",Top());
 pop();
 pop();
 pop();
 pop();
 print();
 printf("Top element : %d\n",Top());
 return 0;
}
```

#### Output

![](https://miro.medium.com/max/782/1*VcbUraITGWoa7nE2BFFGyA.png)

## Stack Hakkında Yazılmış Yazıların Linkleri

[kodlamamerkezi.com/](https://www.kodlamamerkezi.com/algoritma/stack-yigit-veri-yapisi/)
[cdn-acikogretim.istanbul.edu.tr](https://cdn-acikogretim.istanbul.edu.tr/auzefcontent/20_21_Guz/veri_yapilari/6/index.html)
[technogezgin.com/](https://technogezgin.com/stack-yigin-veri-yapisi-rehber/)
[Ders Notu](https://algoritmaveprogramlama.files.wordpress.com/2016/03/4-stack-yc4b1c49fc4b1n-yc4b1c49fc4b1t.pdf)
[http://cagataykiziltan.net/](http://cagataykiziltan.net/tr/veri-yapilari-data-structures/2-stack-yigin/)
[baskent.edu.tr/](http://www.baskent.edu.tr/~tkaracay/etudio/ders/prg/dataStructures/Collections/ClassStack.pdf)