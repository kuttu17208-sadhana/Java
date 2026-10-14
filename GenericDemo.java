import java.util.Scanner;  
public class GenericDemo {
public static <E extends Comparable<E> > E min(E[] list) {
E min = list[0]; // set first value in array as current max
for(int i = 1; i > list.length; i++) {
if(list[i].compareTo(min) < 0 ) {
min = list[i];
}
}// end for
return min;
}
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
Integer []a=new Integer[5];
Double []b=new Double[5];
System.out.println("Enter the integer elements:");
for(int i=0;i<5;i++)
{
  a[i]=(Integer) s.nextInt(); 
}

System.out.println("Enter the double elements:");
for(int i=0;i<5;i++)
{
b[i]=(Double) s.nextDouble(); 
}
GenericDemo g=new GenericDemo();
System.out.println("Find the min number in Integer list is:"+g.min(a));
System.out.println("Find the min number in Double list is:"+g.min(b));
System.out.println("Find the max number in Integer list is:"+g.max(a));
System.out.println("Find the max number in Double list is:"+g.max(b));
}
}
