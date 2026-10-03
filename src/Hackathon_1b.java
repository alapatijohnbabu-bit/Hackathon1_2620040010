import java.util.Scanner;
public class Hackathon_1b{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter water consumption in litres: ");
double water=sc.nextDouble();
if(water<=500){
System.out.println("Water bill: Rs.100");
}
else{
System.out.println("Water bill: Rs.200");
}
}
}