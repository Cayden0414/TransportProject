import java.util.*;

public class Station {
    String name;
    String[] lines;
    Station previous;
    Station next;
    
    public static Station(String name, String[] lines){
        this.name = name;
        this.lines = lines;
        
    }

    public String getName(){
        return this.name;
    }

    public String[] getLines(){
        return this.lines;
    }

    public void setPrev(Station previous){
        this.previous = previous;
    }

    public void setNext(Station next){
        this.next = next;
    }

    
}
