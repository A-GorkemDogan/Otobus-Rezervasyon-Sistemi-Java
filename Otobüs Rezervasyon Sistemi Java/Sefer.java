// Sefer sınıfı: Her otobüs seferini temsil eder
class Sefer {
    String kalkisSehri;
    String varisSehri;
    String tarih;
    String saat;
    int koltukSayisi;
    KoltukSistemi koltukSistemi;

    public Sefer(String kalkis, String varis, String tarih, String saat, int koltukSayisi) {
        this.kalkisSehri = kalkis;
        this.varisSehri = varis;
        this.tarih = tarih;
        this.saat = saat;
        this.koltukSayisi = koltukSayisi;
        this.koltukSistemi = new KoltukSistemi(koltukSayisi);
    }

    public void seferBilgileriniGoster() {
        System.out.println("Kalkış Şehri: " + kalkisSehri);
        System.out.println("Varış Şehri: " + varisSehri);
        System.out.println("Tarih: " + tarih);
        System.out.println("Saat: " + saat);
        System.out.println("Toplam Koltuk Sayısı: " + koltukSayisi);
    }
}

