import java.util.*;
public class Graph {
   List<String> lines;
   List<Station> stations;




   public Graph(){
       this.lines = new ArrayList<String>();
       this.stations = new ArrayList<Station>();
       this.willSearch = new LinkedList<>();
       this.searched = new ArrayList<>();
       this.path = new ArrayList<>();
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
       // keep track of the paths
       Map<Station, Station> parentMap = new HashMap<>();
       // keep track of the to_search queue
       Queue<Station> queue = new LinkedList<>();
       // keep track of the visited set
       Set<Station> visited = new HashSet<>();
       // add the first staring node: to both visited and queue
       queue.add(start);
       visited.add(start);
       while(!eueue.isEmpty()){
           // grab the current station we want to be at


           // are we at the goal? then make the path and add it


           // neighbors, add the neighbors


           // parse thru neighbors
           // add the neighbors
       }
       return null; // means no path was found
      
      
   }


   private List<Station> buildPath(Map<Station, Station> parentMap, Station start, Station goal) {
       List<Station> path = new ArrayList<>();
       for (Station at = goal; at != null; at = parentMap.get(at)) {
           path.add(at);
       }
       Collections.reverse(path);
       return path;
   }


   public static void main(String[] args){
       Station LenfantPlaza = new Station("L'Enfant Plaza", new ArrayList<String>());
   }
}
