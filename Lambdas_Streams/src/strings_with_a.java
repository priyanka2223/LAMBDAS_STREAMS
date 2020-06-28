import java.util.*;
import java.util.stream.Collectors;

public class strings_with_a {
	public static List<String> findString(List<String> list){
		return list.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value :");
		int n = sc.nextInt();
		List<String> a = new ArrayList<>();
		System.out.println("Enter strings :");
		for(int i=0;i<n+1;i++){
			a.add(sc.nextLine());
		}
		List<String> b = findString(a);
		System.out.println("Strings that start with the letter 'a' (lower case) and have exactly 3 letters :");
		for(String i:b){
			System.out.println(i);
		}
	}

}
