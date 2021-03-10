public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika hitung = new Matematika();
        hitung.pertambahan(1, 2);
        hitung.pengurangan(8, 4);
        hitung.perkalian(10, 6);
        hitung.pembagian(50, 25);
    }
}

class Matematika{
    Matematika(){}

    void pertambahan(int a, int b){
        int c = a+b;
        System.out.println("Hasil penjumlahan dari "+a+" + "+b+" = " + c);
    }

    void pengurangan(int a, int b){
        int c = a-b;
        System.out.println("Hasil pegurangan dari "+a+" - "+b+" = " + c);
    }

    void perkalian(int a, int b){
        int c = a*b;
        System.out.println("Hasil perkalian dari "+a+" x "+b+" = " + c);
    }

    void pembagian(int a, int b){
        int c = a/b;
        System.out.println("Hasil pembagian dari "+a+" / "+b+" = " + c);
    }

}
