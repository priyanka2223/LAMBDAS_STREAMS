import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average_of_Integers {
	public static double average(List<Integer> list) {
		return list.stream()
				  .mapToInt(i -> i)
				  .average()
				  .getAsDouble();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value :");
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		System.out.println("Enter Integer values :");
		for(int i=0;i<n;i++){
			a.add(sc.nextInt());
		}
		System.out.println("Average of a list of integers:");
        System.out.println(average(a));
	}

}
