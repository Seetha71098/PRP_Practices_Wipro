import java.util.Scanner;
public class WatermelonProblem {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=scan.nextInt();
		if(num%2==0){
			if((num/2)%2==0){
			System.out.println(num/2+" "+num/2);
			System.out.println("yes");
			}
			else{
				System.out.println((num/2+1)+" "+(num/2-1));
			}
		}
		else{
			System.out.println("no");
		}
		}
}
