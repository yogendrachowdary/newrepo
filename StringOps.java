import java.util.*;
public class Main
{
  public static void main(String[] args) {

//convert Integer to String
int n=143;

String str=Integer.toString(n);
System.out.println(str);


//convert Character to String
char ch='b';

String str2=Character.toString(ch);
System.out.println(str2);

//convert float to String
float f=14.3f;

String str3=Float.toString(f);
System.out.println(str3);


//Convert Double to String
double d=24.34;

String str4=Double.toString(d);
System.out.println(str4);


//convert String to Integer
String str5="12345";

int x=Integer.parseInt(str5);
System.out.println(x);

//convert Character to Integer
char ch1='4';

int y=Character.getNumericValue(ch1);
System.out.println(y);

//convert integer to binray String
int i=12;

String str6=Integer.toBinaryString(i);
System.out.println(str6);


  }
}
