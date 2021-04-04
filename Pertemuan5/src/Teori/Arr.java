package Teori;
import java.util.ArrayList;

public class Arr {
    ArrayList<String> data = new ArrayList<String>(); 

    Arr(){}

    public void add(String data){
        this.data.add(data);
    }

    public void remove(String data){
        this.data.remove(data);
    }

    public void edit(int index, String inputNewData){
        data.set(index, inputNewData);
    }

    public void display() {
        for(String i : data){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Arr l1 = new Arr();
        l1.add("Laptop");
        l1.add("HP");
        l1.add("Komputer");
        l1.display();
        System.out.println();

        l1.edit(1, "Printer");
        l1.display();
    }

}
