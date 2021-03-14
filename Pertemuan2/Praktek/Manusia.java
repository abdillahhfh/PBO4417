public class Manusia {
    private String nama = "noname";
    private boolean punyaTV = false;

    Manusia(){}

    Manusia(String nama){
        this.nama = nama;
    }

    public String namaSaya(){
        return nama;
    }

    public void beliTV(TV tiviku){
        punyaTV = true;
    }

    public void jualSemuaTV(){
        punyaTV = false;
    }

    public boolean cekTV(){
        return punyaTV;
    }
}

