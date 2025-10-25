import java.util.ArrayList;
import java.util.Scanner;
// KoltukSistemi sınıfı: Seferdeki koltukları yönetir
public class OtobusRezervasyondemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sefer> seferler = new ArrayList<>();

        System.out.println("Otobüs Rezervasyon Sistemine Hoşgeldiniz!");

        // Basit menü döngüsü
        boolean devam = true;
        while (devam) {
            System.out.println("\n1- Sefer Oluştur");
            System.out.println("2- Koltuk Rezervasyonu");
            System.out.println("3- Rezervasyon İptali");
            System.out.println("4- Doluluk Oranı");
            System.out.println("5-sefer bilgilerini görüntüle");
            System.out.println("\n6- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Enter temizleme

            switch (secim) {
                case 1:
                    System.out.print("Kalkış şehri: ");
                    String kalkis = scanner.nextLine();
                    System.out.print("Varış şehri: ");
                    String varis = scanner.nextLine();
                    System.out.print("Tarih (gg/aa/yyyy): ");
                    String tarih = scanner.nextLine();
                    System.out.print("Saat (ss:dd): ");
                    String saat = scanner.nextLine();
                    System.out.print("Koltuk sayısı: ");
                    int koltukSayisi = scanner.nextInt();
                    scanner.nextLine();

                    Sefer yeniSefer = new Sefer(kalkis, varis, tarih, saat, koltukSayisi);
                    seferler.add(yeniSefer);
                    System.out.println("Sefer başarıyla oluşturuldu!");
                    break;

                case 2:
                    if (seferler.isEmpty()) {
                        System.out.println("Önce bir sefer oluşturun!");
                        break;
                    }
                    System.out.print("Hangi seferi seçiyorsunuz? (1-" + seferler.size() + "): ");
                    int secilenSefer = scanner.nextInt();
                    System.out.print("Rezervasyon yapılacak koltuk numarası: ");
                    int koltukNo = scanner.nextInt();
                    seferler.get(secilenSefer - 1).koltukSistemi.rezervasyonYap(koltukNo);
                    break;

                case 3:
                    if (seferler.isEmpty()) {
                        System.out.println("Önce bir sefer oluşturun!");
                        break;
                    }
                    System.out.print("Hangi seferi seçiyorsunuz? (1-" + seferler.size() + "): ");
                    secilenSefer = scanner.nextInt();
                    System.out.print("İptal edilecek koltuk numarası: ");
                    koltukNo = scanner.nextInt();
                    seferler.get(secilenSefer - 1).koltukSistemi.rezervasyonIptal(koltukNo);
                    break;

                case 4:
                    if (seferler.isEmpty()) {
                        System.out.println("Önce bir sefer oluşturun!");
                        break;
                    }
                    System.out.print("Hangi seferi seçiyorsunuz? (1-" + seferler.size() + "): ");
                    secilenSefer = scanner.nextInt();
                    seferler.get(secilenSefer - 1).koltukSistemi.dolulukOrani();
                    break;

                case 5:
                    
                    if (seferler.isEmpty()) {
                        System.out.println("Önce bir sefer oluşturun!");
                        break;
                    }
                    System.out.print("Hangi seferi seçiyorsunuz? (1-" + seferler.size() + "): ");
                    secilenSefer = scanner.nextInt();
                    seferler.get(secilenSefer - 1).seferBilgileriniGoster();
                    break;

                case 6:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                    break;
            }
        }

        scanner.close();
    }
}
