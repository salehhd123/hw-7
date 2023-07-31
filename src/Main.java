// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Account a1 = new Account("1","saleh",2000);
Account a2 = new Account("1","saleh",100);


        System.out.println(a1.getBalance());
        System.out.println(a1.transferToAccount(a2,3000));
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        a1.credit(1000);
       System.out.println(a1.getBalance());


       System.out.println("----------------------------");

       Employee e1 = new Employee("111","saleh", 100);
       System.out.println(e1.getSalary());
       System.out.println(e1.getAnnualSalary());
       e1.raisedSalary(5);
       System.out.println(e1.getAnnualSalary());
       System.out.println(e1.toSting());
    }
}
