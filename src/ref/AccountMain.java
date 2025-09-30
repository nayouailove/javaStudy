package ref;

public class AccountMain    {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
//        int newBalance = account.balance;
            //메서드가 실행 된 후 변경된 잔액 값 즉시 확인 가능
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println(account.balance);
    }
}
