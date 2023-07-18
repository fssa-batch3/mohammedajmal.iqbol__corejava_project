package day07.Solved;


/**
 * @author Mohammed Ajmal
 *
 **/
import java.util.TreeSet;

public class TreeSetDemo {
 
    public static void main(String[] args) {
 
        // TreeSet sorts the collections
        TreeSet<String> cityNames = new TreeSet<>();
        cityNames.add("Delhi");
        cityNames.add("Chennai");
        cityNames.add("Bangalore");
        cityNames.add("Ajmer");
 
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }
         
         
    }
 
}
