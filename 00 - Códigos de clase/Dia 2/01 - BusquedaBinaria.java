import java.util.Arrays;

public class BusquedaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteArr[] = {10,20,35,15,22,35,35,35,35,35,35,35,35,35};
        char charArr[] = {'g','p','q','c','i'};
        int intArr[] = {10,20,15,22,35};
        double doubleArr[] = {10.2,15.1,2.2,3.5};
        
        float floatArr[] = {10.2f,15.1f,2.2f,3.5f};
        
        short shortArr[] = {10,20,15,22,35};
  
        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);
  
        byte byteKey = 35;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;
  
        System.out.println(byteKey + " encontrado en el índice = "
                           +Arrays.binarySearch(byteArr,byteKey));
        System.out.println(charKey + " encontrado en el índice = "
                           +Arrays.binarySearch(charArr,charKey));
        System.out.println(intKey + " encontrado en el índice = "
                           +Arrays.binarySearch(intArr,intKey));
        System.out.println(doubleKey + " encontrado en el índice = "
                           +Arrays.binarySearch(doubleArr,doubleKey));
        System.out.println(floatKey + " encontrado en el índice = "
                           +Arrays.binarySearch(floatArr,floatKey));
        System.out.println(shortKey + " encontrado en el índice = "
                           +Arrays.binarySearch(shortArr,shortKey));

	}

}
