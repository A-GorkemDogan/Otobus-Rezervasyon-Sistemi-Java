import java.util.Arrays;
import java.util.Scanner;
// KoltukSistemi sınıfı: Seferdeki koltukların durumunu yönetir
class KoltukSistemi {
    boolean[] koltuklar; // true = dolu, false = boş

    // Constructor: Seferin koltuk sayısına göre diziyi başlatır
    public KoltukSistemi(int koltukSayisi) {
        koltuklar = new boolean[koltukSayisi];
        Arrays.fill(koltuklar, false); // Başlangıçta tüm koltuklar boş
    }

    // Koltuk rezervasyonu yapar
    public boolean rezervasyonYap(int koltukNo) {


        if (koltukNo < 1 || koltukNo > koltuklar.length) {
            System.out.println("Geçersiz koltuk numarası!");
            return false;
        }
        if (koltuklar[koltukNo - 1]) { // Koltuk dolu mu kontrol et
            System.out.println("Bu koltuk zaten dolu!");
            return false;
        }
        String isim;
        System.err.println("İsminizi giriniz:");
        Scanner scanner = new Scanner(System.in);
        isim = scanner.nextLine();

        koltuklar[koltukNo - 1] = true; // Koltuğu rezerve et
        System.out.println(koltukNo + " numaralı koltuk " + isim + " adına başarıyla rezerve edildi.");
        return true;
    }

    // Koltuk iptali yapar
    public boolean rezervasyonIptal(int koltukNo) {
        if (koltukNo < 1 || koltukNo > koltuklar.length) {
            System.out.println("Geçersiz koltuk numarası!");
            return false;
        }
        if (!koltuklar[koltukNo - 1]) { // Koltuk boş mu kontrol et
            System.out.println("Bu koltuk zaten boş!");
            return false;
        }
        koltuklar[koltukNo - 1] = false; // Koltuk iptal edildi
        System.out.println(koltukNo + " numaralı koltuk iptal edildi.");
        return true;
    }

     // Doluluk oranını, dolu ve boş koltuk sayılarını gösterir
    public void dolulukOrani() {
        int dolu = 0;
        for (boolean b : koltuklar) {
            if (b) dolu++;
        }
        int bos = koltuklar.length - dolu; // Boş koltuk sayısı
        double oran = ((double) dolu / koltuklar.length) * 100;

        System.out.println("\n--- Sefer Doluluk Bilgisi ---");
        System.out.println("Toplam Koltuk Sayısı : " + koltuklar.length);
        System.out.println("Dolu Koltuk Sayısı   : " + dolu);
        System.out.println("Boş Koltuk Sayısı    : " + bos);
        System.out.printf("Doluluk Oranı         : %.2f%%\n", oran);
    }
   
}
