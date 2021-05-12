import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int balance=100000,withdrawn,deposit;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("ATM");
            System.out.println("choose 1 to withdraw");    
            System.out.println("choose 2 to Deposit  ");
            System.out.println("choose 3 to Check balance");
            System.out.println("choose 4 to exit");
            System.out.println("choose the operation you want");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter the money to be withdrawn: ");
                withdrawn=sc.nextInt();
                if(balance>=withdrawn){
                    balance=balance-withdrawn;
                    System.out.println("please collect your Money!!!");
                }
                else{
                    System.out.println("Insufficient Balance :( ");
                }
                System.out.println(" ");
                break;
                case 2:
                System.out.println("Enter the money to be deposited");
                deposit=sc.nextInt();
                balance=deposit+balance;
                System.out.println("Your Money has been successfully depsited");     
                System.out.println("");
                break;
                case 3:
                System.out.println("your current balance is: "+balance);
                System.out.println("");
                break;
                case 4:
                System.exit(0);
                }
            }
            
        }
    }
