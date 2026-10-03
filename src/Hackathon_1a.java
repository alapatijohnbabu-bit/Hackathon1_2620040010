import java.util.Scanner;
public class Hackathon_1a{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of family members: ");
int members=sc.nextInt();
System.out.print("Enter water consumed in litres: ");
double water=sc.nextDouble();
System.out.print("Enter house number: ");
int house=sc.nextInt();
System.out.print("Enter water usage status: ");
char status=sc.next().charAt(0);
System.out.println("Number of family members: "+members);
System.out.println("Water consumed: "+water+" litres");
System.out.println("House number: "+house);
System.out.println("Water usage status: "+status);
}
}