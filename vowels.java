package number;
import java.util.Scanner;
public class vowels {
	public static void main(String args[]){
		Scanner se=new Scanner(System.in);
		char c=se.next().charAt(0);
		if(c==('a')||c==('e')||c==('i')||c==('o')||c==('u'))
		{
     		System.out.println("vowels");
		}
		else
		{
			System.out.println("consants");
		}
	}

}
