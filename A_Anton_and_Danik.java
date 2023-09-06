import java.util.*;
public class A_Anton_and_Danik{
	public static void main(String args[]){
	int ag=0,dg=0;
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	String str=s.next();
	for(int i=0;i<a;i++){
		if(str.charAt(i)=='A')
			ag++;
		else 
			dg++;
	}
	if(ag>dg)
		System.out.println("Anton");
	else if(ag<dg)
		System.out.println("Danik");
	else
		System.out.println("Friendship");
}
}