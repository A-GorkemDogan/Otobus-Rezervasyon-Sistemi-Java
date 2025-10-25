# 🚌 Otobüs Rezervasyon Sistemi – Koltuk Yönetimi Modülü

Bu proje, bir *Otobüs Rezervasyon Simülasyonu* uygulamasının bir parçasıdır.  
Bu modül, *koltuk rezervasyonu, **iptali* ve *doluluk oranı kontrolü* gibi temel işlevleri Java dilinde konsol uygulaması olarak sunar.

---

## 📘 Proje Hakkında

Bu sınıf (KoltukSistemi), bir seferdeki koltukların durumunu yönetir.  
Kullanıcı; koltuk numarası girerek rezervasyon yapabilir, mevcut rezervasyonu iptal edebilir ve anlık doluluk oranını görüntüleyebilir.

---

## ⚙️ Özellikler

- ✅ *Rezervasyon Yapma:* Belirtilen koltuk dolu değilse rezerve edilir.  
- ❌ *Rezervasyon İptali:* Daha önce yapılan rezervasyon iptal edilir.  
- 📊 *Doluluk Oranı Hesaplama:*  
  - Toplam koltuk sayısı  
  - Dolu koltuk sayısı  
  - Boş koltuk sayısı  
  - Yüzdesel doluluk oranı  

---

## 🧩 Sınıf: KoltukSistemi

### 🏗️ Kurucu Metot

```java
public KoltukSistemi(int koltukSayisi)
Verilen koltuk sayısına göre bir otobüs oluşturur.
Tüm koltuklar başlangıçta boş (false) olarak ayarlanır.

💺 Rezervasyon Yapma
java
Kodu kopyala
public boolean rezervasyonYap(int koltukNo)
Belirtilen koltuğu rezerve eder.
Eğer koltuk doluysa veya numara geçersizse kullanıcı bilgilendirilir.

🔁 Rezervasyon İptali
java
Kodu kopyala
public boolean rezervasyonIptal(int koltukNo)
Belirtilen koltukta rezervasyon varsa iptal eder.
Koltuk zaten boşsa kullanıcı uyarılır.

📈 Doluluk Oranı Gösterme
java
Kodu kopyala
public void dolulukOrani()
Seferin toplam, dolu ve boş koltuk sayılarını ve doluluk yüzdesini ekrana yazdırır.

🧠 Kullanım Örneği
java
Kodu kopyala
public class Main {
    public static void main(String[] args) {
        KoltukSistemi sistem = new KoltukSistemi(10);

        sistem.rezervasyonYap(3);
        sistem.rezervasyonYap(5);
        sistem.rezervasyonIptal(3);
        sistem.dolulukOrani();
    }
}
💻 Örnek Çıktı
lua
Kodu kopyala
3 numaralı koltuk başarıyla rezerve edildi.
5 numaralı koltuk başarıyla rezerve edildi.
3 numaralı koltuk iptal edildi.

--- Sefer Doluluk Bilgisi ---
Toplam Koltuk Sayısı : 10
Dolu Koltuk Sayısı   : 1
Boş Koltuk Sayısı    : 9
Doluluk Oranı         : 10.00%
