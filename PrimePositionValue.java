import java.util.Scanner;
public class PrimePositionValue {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int count=0;
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}   
		for(int i=2;i<arr.length;i++){
			for(int j=2;j<i;j++){
			   if(i%j==0){
						count++;
						break;
					}
					
				}
			if(count==0)
				sum=sum+arr[i];
			
			}
			
		System.out.println(sum);
	}
