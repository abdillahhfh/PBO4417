package Teori;

import java.util.ArrayList;

public class Stck {
    ArrayList<String> isi = new ArrayList<String>();

    Stck(){}

    public void push(String data) {
        isi.add(data);
    }

    public void pop(){
        isi.remove(isi.size()-1);
    }

    public void edit(int index, String inputData) {
        
    }

    public void display(){
        for (int i = 0; i < isi.size(); i++) {
            System.out.print(isi.get(i) + " <-- ");
        }
    }

    public static void main(String[] args) {
        Stck l1 = new Stck();
        l1.push("Volvo");
        l1.push("Scania");
        l1.push("Daff");
        l1.pop();
        l1.display();
        
    }

}
