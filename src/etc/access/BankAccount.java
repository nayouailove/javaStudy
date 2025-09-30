package etc.access;

public class BankAccount {
    private int balance;
    //데이터 필드는 외부에 직접 노출하지 않는다.
    //BankAccount가 제공하는 메서드를 통해서만 접근할 수 있다.

    public BankAccount() {
        balance = 0;
    }
    //public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) &&balance - amount >=0){
            balance -= amount;
        }else{
            System.out.println("Invalid amount or 잔액부족");
        }
    }

    public int getBalance() {
        return balance;

    }
    //backaccount를 사용하는 입장에서 단 3가지메서드 입금, 출금, 잔고만 알면 된다. 복잡한 내용은 모두 bankaccount 내부에 숨어있다.
    //isamountvaild노출하면 입출금전에 금액을 자신이 먼저 검증을 해야하나? 사용자가 굳이?

    private boolean isAmountValid(int amount) {
        return amount >= 0; //금액이 0보다 커야함
    } //입력 금액을 검증하는 기능은 내부에서만 필요하다.
}
