public class Manusia {
    private String nama = "noname";
    private boolean punyaTV = false;

    Manusia(){}

    Manusia(String nama){
        this.nama = nama;
    }

    String namaSaya(){
        return nama;
    }

    void beliTV(TV tiviku){
        punyaTV = true;
    }

    void jualSemuaTV(){
        punyaTV = false;
    }

    boolean cekTV(){
        return punyaTV;
    }
}

