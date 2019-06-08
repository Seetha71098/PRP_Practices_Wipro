import java.util.*;
public class Reverse {
	public static void main(String args[]){
		String s="$ab,cd";
		//StringBuffer sb=new StringBuffer(s);
		//System.out.println(sb.reverse());
		char c[]=s.toCharArray();
		String str="",str1="";
		for(int i=0;i<str.length();i++){
			if(c[i]<='a'&&c[i]>='z')str+=c[i];
			//System.out.println(str+"");
			else
				str1+=c[i];
			}
		StringBuffer sb=new StringBuffer(s);
		String rev=sb.reverse().toString();
		int l=0,k=0;
		for(int i=0;i<str.length();i++){
			if(c[i]<='a'&&c[i]>='z'){
				System.out.print(rev.substring(l,l+1));
				l++;
			}
			else{
				System.out.print(str1.substring(k,k+1));
				k++;
				
			}
					
	}

}
}
