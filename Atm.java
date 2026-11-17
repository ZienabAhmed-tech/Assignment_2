import java.util.Scanner;
public class Atm {
     public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       int correctPin =1234;
       int choose;
       double balance =2500.75;
       boolean loggedIn = false;
       double deposit_amount;
       double  withdraw_amount;

       for(int i=1; i<4;i++)
        {
         int password; 
         System.out.print("Enter the password : " );
         password = input.nextInt();
         if(password==correctPin){
          System.out.println("Your login is Successful , Welcom ");
          loggedIn=true;
          break;
          }
         else if(i<3)
         {
           System.out.println("Try Again");
         }

         }
        if (!loggedIn) {
            System.out.println("Your account has been locked.");
        }
       while(loggedIn){
           System.out.println("========= ATM =========");
           System.out.println("1. Check Balance");
           System.out.println("2. Deposit"); 
           System.out.println("3. Withdraw");
           System.out.println("4. Show Account Status ");
           System.out.println("5. Exit");
           System.out.println("=======================");
           System.out.print("Your choose :");
           choose=input.nextInt();
           if(choose>=1 && choose<=5){
              if (choose==1){
                  Balance(balance);
                }
              else if(choose==2){
                 System.out.println("Enter The Deposit Amount : ");
                 deposit_amount=input.nextDouble();
                //  System.out.println(deposit_amount);
                balance = Deposit_amount(deposit_amount, balance);
                System.out.println( "Your Balance  is : " +balance );
              }
              else if(choose==3){
                 System.out.println("Enter The Withdraw Amount : ");
                 withdraw_amount=input.nextDouble();
    
                balance = Withdraw_amount(withdraw_amount, balance);
                System.out.println( "Your Balance is : " +balance );
              }
              else if(choose==4){
               Show_Account_Status(balance);
              }

                
              else if(choose==5){
                Exit();
                break;}
            }
           else{
            System.out.println("Invalid choice, Please try again.");
           } 
       
       
          }

        
       
          
        }
       
        

        public static  double  Deposit_amount(double deposit_amount,double balance ){
           
            if (deposit_amount>0) {
                
              
               return balance+deposit_amount; 
             }
             else{
               System.out.println("Invalid amount.");
               return balance;
             }
              
            }   
             
       
        
            
        public static void Balance(double balance){
           System.out.println("your blance is: " + balance);
        }
        // method for Withdraw
        public static  double  Withdraw_amount (double withdraw_amount ,double balance ){
            if (withdraw_amount<=0) {
              System.out.println("Invalid amount");
                return balance;
            }
            else if (withdraw_amount>balance ) {
              System.out.println("Insufficient balance");
               return balance;
               
             }
             else{
              return balance-withdraw_amount; 
               
             }
            }
        // method for Show Account Status 
        public static void Show_Account_Status(double balance){
          if(balance>= 5000) {
              System.out.println("VIP Customer");
              }
          else if (balance >= 1000) {
             System.out.println("Regular Customer");
                 }
          else {
             System.out.println("Low Balance");
                }
          
        }
         public static void Exit(){
          System.out.println("Thank you for using our ATM");
    
         }
      }
    

     








    