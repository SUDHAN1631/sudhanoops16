import java.util.Scanner;
public class sudhaneb{
public static void main(String args[]){
int consno;
double prevread;
double curread;
int choice;
double n;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter consumer number: ");
consno = scanner.nextInt();
System.out.println("Enter consumer name: ");
scanner.nextLine();
String consname = scanner.nextLine();
System.out.println("Enter previous month reading: ");
prevread = scanner.nextDouble();
System.out.println("Enter current month reading: ");
curread = scanner.nextDouble();
n = prevread - curread;
System.out.println("the total unit"+n);
System.out.println("Enter your choice[Domestic/Commercial](1/2): ");
choice = scanner.nextInt();
if(choice == 1){
if(n<=100){
n=n*1;
System.out.println("The rate is " +n);
}
else if(n>=101 && n<=200){
n=n*2.50;
System.out.printf("The rate is %.2f");
}
else if(n>=201 && n<=500){
n=n*4;
System.out.println("The rate is " +n);
}
else{
n= n*6;
System.out.println("The rate is " +n);
}
}
else{
if(n<=100){
n=n*2;
System.out.println("The rate is " +n);
}
else if(n>=101 && n<=200){
n=n*4.50;
System.out.printf("The rate is %.2f");
}
else if(n>=201 && n<=500){
n=n*6;
System.out.println("The rate is " +n);
}
else{
n= n*7;
System.out.println("The rate is " +n);
}
}
scanner.close();
}
}
