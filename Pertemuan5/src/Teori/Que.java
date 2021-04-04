package Teori;
import java.util.ArrayList;

public class Que {
    ArrayList<String> datas = new ArrayList<String>();

    public void enqueue(String data) {
        datas.add(data);
    }

    public void dequeue() {
        datas.remove(0);
    }

    public void display() {
        for(String i : datas){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Que q1 = new Que();
        q1.enqueue("Kursi");
        q1.enqueue("Meja");
        q1.enqueue("Lemari");
        q1.enqueue("Kasur");
        q1.dequeue();
        q1.display();

    }

}
