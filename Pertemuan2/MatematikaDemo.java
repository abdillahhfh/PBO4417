public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika tambah = new Matematika(10, 10);
        System.out.println(tambah.pertambahan());
    }
}

class Matematika{
    int a;
    int b;

    Matematika(int a, int b){}

    int pertambahan(){
        return a+b;
    }

    int pengurangan(){
        return a-b;
    }

    int perkalian(){
        return a*b;
    }

    int pembagian(){
        return a/b;
    }

}
