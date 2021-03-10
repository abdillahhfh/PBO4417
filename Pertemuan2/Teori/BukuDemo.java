public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Objek dengan Java", "Indriani", "Elexmedia", 2004);
        buku1.cetakBuku();

        Buku buku2 = new Buku("Dasar Pemrograman Java","Abdul Kadir", "Andi Offset", 2004);
        buku2.cetakBuku();
    }
}

class Buku{
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    public Buku(String judul, String pengarang, String penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    void cetakBuku(){
        System.out.println("Judul       : "+this.judul);
        System.out.println("Pengarang   : "+this.pengarang);
        System.out.println("Penerbit    : "+this.penerbit);
        System.out.println("Tahun       : "+this.tahun);
        
    }
}
