package Encapsulation;

public class Bank {
    private int amount=10000;
    private int pin=9989;
    public void setAmount(int pin,int amount){
        if(pin ==this.pin){
            this.amount+=amount;
            System.out.println("Your Total Amount is:" + this.amount);
        }else{
            System.out.println("Entered Wrong Pin");
            System.exit(0);
        }
    }
    public int getAmount(int pin){
        if (this.pin!=pin) {
            System.out.println("Entered Wrong Pin");
            System.exit(0);            
        }
        return amount;
    }
    public void WithdrawAmount(int pin,int amount){
        if(pin==this.pin){
            this.amount-=amount;
            System.out.println("Your Total Amount is:" + this.amount);
        }else{
            System.out.println("Entered Wrong Pin");
            System.exit(0);
        }
    }






    
}
