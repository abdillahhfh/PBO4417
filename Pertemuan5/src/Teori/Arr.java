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
 

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

}
