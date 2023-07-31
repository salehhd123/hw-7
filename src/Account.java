public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit (int amount){
        int tem= this.balance;
        if(amount>tem){
            System.out.println("you do not have that much of money sry");
        }else {
        this.balance -= amount;}
        return balance;
    }
    public int debit (int amount){
        this.balance += amount;
        return balance;
    }
    public int transferToAccount(Account another ,int amount){
    if(amount<=this.balance){
        credit(amount);
        another.debit(amount);
    }else {
        System.out.println("you do not have that much of money sry to transfer");
    }

    return another.balance;
    }

   public String toSting(){
        return "the id :"+this.id+" the name :"+this.name+" the balance : "+this.balance;
   }
}
