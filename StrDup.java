import java.util.*;
public class StrDup {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String st=scan.next();
		String str="";
		for(int i=0;i<st.length();i++){
			if(!str.contains(st.substring(i,i+1)))
			str+=st.substring(i,i+1);
		}
		System.out.println(str);
	}

}
