import java.util.Scanner;
public class BankApp {
    private int userBalance;
    private Bank userBank;
    private CreditCard userCard;
    private BagelShop userBagelShop;
    private String name;
    private String pin;

    public BankApp(String name, String pin){
        Bank userBank = new Bank();
        CreditCard userCard = new CreditCard(name, pin);
        BagelShop userBagelShop = new BagelShop(name, 10, 2, userBank);
        this.userBank = userBank;
        this.userCard = userCard;
        this.userBagelShop = userBagelShop;
        this.name = name;
        this.pin = pin;
    }
    public void purchase(int num){
        userCard.chargeCard(num);
    }



}
