public class MobilDemo2{
   public static void main(String[] args) {
       Mobil2 avanza = new Mobil2();
       avanza.warna = "Silver";
       avanza.tahunProduksi = 2021;
       avanza.hidupkan_mobil();
       avanza.ubah_gigi(1);
       System.out.println("Warna: "+avanza.warna);
       System.out.println("Status: "+avanza.kondisi);
       System.out.println("Gigi Sekarang: "+avanza.gigi);
       avanza.matikan_mobil();
       System.out.println("Status: "+avanza.kondisi);

   }
}

class Mobil2{
    String warna;
    int tahunProduksi;
    int gigi;
    boolean kondisi;
    
    public void hidupkan_mobil() {
        kondisi = true;
    }

    public void matikan_mobil() {
        kondisi = false;
    }

    public void ubah_gigi(int setGigi){
        gigi = setGigi;
    }    
}