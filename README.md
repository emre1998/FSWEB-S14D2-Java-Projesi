# Java Composition

### Proje Kurulumu

Projeyi önce forklayın daha sonra klonlayın ve Intellij kullanarak projeyi açın. 
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

Sınıf yazmaya doyduğunuz bir proje olması dileklerimle....

### com.bedroom.Lamp
* com.bedroom.Lamp isimli bir sınıf yazınız.
* com.bedroom.Lamp sınıfı için 3 tane ```instance variable``` tanımlamalıyız. ```style``` tipi LampType isminde bir enum olmalı. ```battery``` tipi boolean olmalı. ```globRating``` tipi int olmalı. 
* com.bedroom.Lamp sınıfının tüm değişkenleri `private` olmalı. com.bedroom.Lamp sınıfı için 3 değişkeninde eklenebileceği tek bir ```constructor``` olmalı.
* com.bedroom.Lamp sınıfı için toplamda 4 metod yazmamız gerekiyor. ```turnOn``` herhangi bir değer dönmeyecek. Sadece 'com.bedroom.Lamp is being turned on.' mesajının ekrana basacak.
* ```getStyle()``` style değişkenin değerini dönmeli. ```isBattery()``` battery değişkeninin değerini dönmeli. ```getGlobalRating()``` globalRating değişkeninin değerini dönmeli.

### com.bedroom.Bed
* com.bedroom.Bed isminde bir sınıf yazınız.
* com.bedroom.Bed sınıfı için 5 tane ```instance variable``` tanımlamalıyız. style tipi String olmalı. ```pillows, height, sheets, quilt``` tipleri int olmalı. Hepsi private olmalı.
* com.bedroom.Bed sınıfı için bir constructor yazmalıyız.
* com.bedroom.Bed sınıfı için 5 metod yazacağız. ```make``` herhangi bir return değeri olmayacak. Sadece 'The bed is being made.' mesajını ekrana basacak.
* ```getPillows()``` pillows sayısını return etmeli. ```getHeight()``` height değerini return etmeli. ```getSheets()``` sheets sayısını return etmeli. ```getQuilts()``` quilts sayısını return etmeli.

### com.bedroom.Wardrobe 
* com.bedroom.Wardrobe isminde bir sınıf yazınız. 
* com.bedroom.Wardrobe sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, double weight``` Hepsi private olmalı.
* com.bedroom.Wardrobe sınıfı için constructor & getter metodlarını yazınız.
* com.bedroom.Wardrobe sınıfı içerisinde ```add``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'com.bedroom.Wardrobe added into com.bedroom.Bedroom.' mesajını ekrana basacak.

### com.bedroom.Carpet
* com.bedroom.Carpet isminde bir sınıf yazınız.
* com.bedroom.Carpet sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, PaintColor color``` Hepsi private olmalı.
* com.bedroom.Carpet sınıfı için constructor & getter metodlarını yazınız.
* com.bedroom.Carpet sınıfı içerisinde ```lying``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'com.bedroom.Carpet is lying on com.bedroom.Bedroom floor.' mesajını ekrana basacak.

### com.room.Ceiling
* com.room.Ceiling isminde bir sınıf yazınız. com.room.Ceiling sınıfının 2 tane ```instance variable``` olmalı. ```height``` ve ```paintedColor```. height int tipinde olmalı paintedColor PaintColor isminde bir enum olmalı ve ikisi de private olmalı.
* com.room.Ceiling sınıfının bir ```constructor``` metodu olmalı. 2 değişkenine de değer atamalı.
* com.room.Ceiling sınıfının ```getHeight()``` adında bir metodu olmalı. height değerini dönmeli. ```getPaintedColor``` adında bir metodu olmalı ve paintedColor değerini dönmeli.
* com.room.Ceiling sınıfının ```create``` isimli bir metodu olmalı. com.room.Ceiling objesinin height ve paintingColor değerlerini ekrana basmalı.

### com.room.Wall
* com.room.Wall isminde bir sınıf yazınız. İçerisinde bir tane değişkeni olmalı ```direction``` String değerinde olmalı ve private olarak tanımlanmalı.
* com.room.Wall sınıfının bir ```constructor``` metodu olmalı ve tek değişkenine değer atamalı.
* com.room.Wall sınıfının iki metodu olmalı. ```getDirection``` direction değişkeninin değerini dönmeli. ```create``` metodu com.room.Wall objesinin hangi directiona göre oluşturulduğunu ekrana basmalı.

### com.bedroom.Bedroom 
* com.bedroom.Bedroom isimli bir sınıf oluşturunuz.
* Bu sınıfın 10 tane ```instance variable``` değeri olmalı. ```name``` String tipinde. ```wall1 wall2 wall3 wall4``` com.room.Wall tipinde. ```ceiling``` com.room.Ceiling tipinde.
  ```bed``` com.bedroom.Bed tipinde. ```lamp``` com.bedroom.Lamp tipinde. ```wardrobe``` com.bedroom.Wardrobe tipinde. ```carpet``` com.bedroom.Carpet tipinde.
* Sınıfımızın ```constructor``` metodu tek olmalı ve 10 değişkeni de almalı. 
* getter metodlarını eklemelisiniz.

### Enums
* LampType ve PaintColor isminde iki tane enum tanımlamalısınız.
* Detaylarını istediğiniz gibi oluşturabilirsiniz.

### Uygulamayı Test Etmek

 Bir adet com.bedroom.Bedroom objesi oluşturun. İçerdiği sınıfların tüm değerlerine rahatlıkla erişebilmeli, tüm metodlarını çağırabilmelisin. 

### For Challengers
 * Room isminde bir sınıf tanımlasaydık. com.bedroom.Bedroom ile ilişkisi nasıl olurdu ?
 * com.bedroom.Bedroom'un hangi ```instance variable``` değerleri Room içerisine alınıp buradan yönetilebilirdi ?
 * Yapılan dizaynı bu bağlamda değiştiriniz.



