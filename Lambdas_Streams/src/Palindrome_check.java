import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome_check {
	public static boolean isPalindrome(String word) {
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
		    if (word.charAt(i1) != word.charAt(i2)) {
		        return false;
		    }
		    ++i1;
		    --i2;
		}
		return true;
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
		List<String> b =  new ArrayList<>();
		for(int i=0;i<a.size();i++){
			if(isPalindrome(a.get(i)) && a.get(i)!=""){
				b.add(a.get(i));
			}
		}
		System.out.println("Palindromic strings");
		for(String i:b){
			System.out.println(i);
		}
	}
}
