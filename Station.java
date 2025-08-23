import java.util.*;

public class Station {
    String name;
    String[] lines;
    
    public static Station(String name, String[] lines){
        this.name = name;
        this.lines = lines;
    }

    public static String[] getLines(){
        return this.lines;
    }
}
