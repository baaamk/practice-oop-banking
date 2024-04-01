package Bank;

import Accountfile.Account;
import Accountfile.SavingAccount;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    protected static Scanner scanner = new Scanner(System.in);
    protected static int seq = 0;//<- 추가되는 계좌 개수
    public static DecimalFormat df = new DecimalFormat("#,###");//<- 숫자 포멧팅
    private HashMap<String, InterestCalculator> interestCalculators = new HashMap<>();

    public Bank(){
        interestCalculators.put("N", new NormalInterestCalculator());
        interestCalculators.put("S", new SavingInterestCalculator());
    }

    //기능 구현
    //출금부터
    public void withdraw(){
        Account account = null;
        System.out.println("출금계좌를 입력하세요.");

        String accountNumber = scanner.next();
        account = findAccount(accountNumber);
            if (account.getAccountType().equals("s")) {
                new SavingBank().withdraw((SavingAccount) account);
            }
        System.out.println("출금 금액을 입력하세요");
        BigDecimal value = scanner.nextBigDecimal();
        BigDecimal result;
        BigDecimal interest = interestCalculators.get(account.getAccountType()).getInterest(account.getBalance());
        result = account.withdraw(value);
        System.out.println("출금액 %s원과 이자 %s원이 정상적으로 출금되었습니다.");
        }
    public void deposit(){
        System.out.println("입금하시려는 계좌번호를 입력하세요.");
        String accountNumber = scanner.next();
        Account account = findAccount(accountNumber);
}

    private Account findAccount(String accountNumber) {
        return null;
    }


}
