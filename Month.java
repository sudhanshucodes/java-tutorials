import java.util.Scanner;
class Month{
public static void main(String[] args){
     int n;
   System.out.println("Enter Month Number");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   if(n==1){
  System.out.println(" January =31 Days ");  
}else if(n==2){
      System.out.println(" febuary = 28 Days ");
     }else if(n==3){
      System.out.println(" March = 31 Days ");
     }else if(n==4){
      System.out.println(" April = 30 Days ");
     }else if(n==5){
      System.out.println(" May = 31 Days ");
     }else if(n==6){
      System.out.println(" June = 30");
     }else if(n==7){
      System.out.println(" July = 31 ");      
    }else if(n==8){
      System.out.println(" August = 31 "); 
    }else if(n==9){
      System.out.println(" September = 31 ");     
    }else if(n==10){
      System.out.println(" October = 31 ");
    }else if(n==11){
      System.out.println(" November = 31 ");
    }else if(n==12){
      System.out.println(" December = 31 ");
    }
  }
}