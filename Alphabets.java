import java.util.Scanner;
public class Alphabets {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character:");
		char s=scan.next().charAt(0);
		int count=0;
		for(char i='a';i<='z';i++){
		count++;
		if(i==s){
		break;
		}
}
		int c=0;
		for(char i='z';i>='a';i--){
		c++;
		if(c==count)System.out.println(i);
		}
}
}
