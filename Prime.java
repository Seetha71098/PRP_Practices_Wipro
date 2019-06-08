import java.util.*;
public class Prime {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				count=1;
				break;
			}
			
		}
		if(count==0){
			System.out.println("prime number");
		}
		else{
			System.out.println("not a prime number");
		}
	}

}
