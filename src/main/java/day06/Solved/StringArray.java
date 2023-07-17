package day06.Solved;

public class StringArray {

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";
		
		// Display the city names
		for (String cityName : cityArr) {
			if(cityName != null) {
				System.out.println(cityName);
			}
		}
		System.out.println("");
		
		// adding new city
		cityArr[3] = "Delhi";
		
		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		System.out.println("");
		
		
		//update existing city
		cityArr[1] = "Kolkata";
		
		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		System.out.println("");
		
		//delete city2 from array
		cityArr[2] = null;
		

		// Display the city names
		for (String cityName : cityArr) {
			if(cityName != null) {
				System.out.println(cityName);
			}
		}
	}
}