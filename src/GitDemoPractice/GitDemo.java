package GitDemoPractice;

import java.util.Scanner;

public class GitDemo 
{
public static void main(String[] args) 
{
System.out.println("switch case program");	
Scanner sc=new Scanner(System.in);

System.out.println("Enter your choice number from 1 to 7");

int days=sc.nextInt();

switch (days) {
case 1: {
	
	System.out.println("Monday");
	break;
}
case 2:{
	
	System.out.println("Tuesday");
	break;
}

case 3:{
	
	System.out.println("Wednesday");
	break;
}
case 4:{
	
	System.out.println("Thursday");
	break;
}
case 5:{
	
	System.out.println("Friday");
	break;
}

case 6:{
	
	System.out.println("Saturday");
	break;
}
case 7:{
	
	System.out.println("Sunday");
break;
}

default:
{
System.out.println("Please select correct option between 1 to 7");	
}	
}


}
	
	
	
}
