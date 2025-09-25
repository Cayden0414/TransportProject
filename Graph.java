import java.util.*;
public class Graph {
    List<String> lines;
    List<Station> stations;


    public Graph(){
        this.lines = new ArrayList<String>();
        this.stations = new ArrayList<Station>();
        Queue<Station> willSearch = new Queue();
        List<Station> searched = new ArrayList<>();
        List<Station> path = new ArrayList<>();
    }

    public void AddStationName(String name, String[] lines, Station previous, Station next){
        // Creates the name of a new station and sets the previous and next station
        Station newStation = new Station(name, lines);
        newStation.setPrev(previous);
        newStation.setNext(next);
    }

    public void AddLine(List<Station> stations, String line){
        // Creates a new line and what stations it stops at
        for (int i = 0; i < stations.size(); i++){

            Station prev;
            Station next;
            if(i == 0){
                prev = null;
            }
            else if(i == stations.size()-1){
                next = null;
            }else{
                prev = stations.get(i-1);
                next = stations.get(i+1);
            }
            AddStationName(stations.get(i).getName(), line, prev, next);
        }
    }

    public List<Station> search(Station A, Station B){
        Station current = A;
        this.path.add(A);
        this.willSearch.add(A);
        this.willSearch.add(A.next);
        this.willSearch.add(A.previous);
        
        
        while(willSearch.size() != 0 || current != B){
            this.searched.add(current);
            current = this.willSearch.pop();
            this.willSearch.add(current.next);
        }
        
        
    }

    public static void main(String[] args){
        Station LenfantPlaza = new Station("L'Enfant Plaza", new ArrayList<String>());
    }
}
