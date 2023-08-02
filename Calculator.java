import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String user=sc.nextLine();
        System.out.println("Hello "+user);
        System.out.println("Enter First Number");
        int a =sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int x;
     do{
        System.out.println("Choose which operation do you want");
        System.out.println("1. Addition");
        System.out.println("2. Subtarction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
         x = sc.nextInt();
   
        switch(x) {
  case 1:
      int add=a+b;
    System.out.println("Addition of "+a+" and "+b+" is "+add);
    break;
  case 2:
      int sub=a-b;
      System.out.println("Subtraction of "+a+" and "+b+" is "+sub);
    break;
  case 3:
      int mult=a*b;
      System.out.println("Multiplication of "+a+" and "+b+" is "+ mult);
    break;
  case 4:
      int div=a/b;
      System.out.println("Dividation of "+a+" and "+b+" is "+ div);
    break;    
    
        }
     }
while(x!=5);

    }
}
