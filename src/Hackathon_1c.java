import java.util.Scanner;
public class Hackathon_1c{
static int calculateTotal(int morningUsage,int eveningUsage){
return morningUsage+eveningUsage;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter morning usage: ");
int morning=sc.nextInt();
System.out.print("Enter evening usage: ");
int evening=sc.nextInt();
int total=calculateTotal(morning,evening);
System.out.println("Total water consumption: "+total+" litres");
}
}