import java.io.*;
import java.util.Scanner;
class power{
public static void main(String args[]){
Scanner data = new Scanner(System.in);
int num1, num2;
double num;
num1=data.nextInt();
num2=data.nextInt();
// Finding power of a number
num=Math.pow(num1,num2);
System.out.println("Answer:"+num);
}
}
