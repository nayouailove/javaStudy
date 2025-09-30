package ref;

public class Account    {
    int balance;

    int deposit(int amount) {
        return balance = balance + amount;
    }

    int withdraw(int amount) {
        if (balance < amount) { //잔액이 부족한 경우
            System.out.println("Insufficient Balance");
        }
        else //잔액이 더 크다.
            balance = balance - amount;
       return balance;
    }

    // if (balance >= amount) { //잔액이 충분한 경우를 먼저 확인하고 출금하고
    //             balance = balance - amount;
    //        }
    //        else //뺄려는 금액이 더 클때
    //            System.out.println("Insufficient Balance");

}
