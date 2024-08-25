package BangkingSystem.account;

import java.math.BigDecimal;

public class SavingAccount extends Account{
    private BigDecimal goalAmount;

    public SavingAccount() {
        super();
        this.category = "S";
    }

    public SavingAccount(String accNo, String owner, BigDecimal balance, BigDecimal goalAmount) {
        super(accNo, owner, balance);
        this.goalAmount = goalAmount;
        this.category = "S";
        this.isActive = true;
    }

    public BigDecimal getGoalAmount() {
        return goalAmount;
    }

    @Override
    public void getAccountInfo(){
        System.out.printf("계좌종류: %s | 계좌번호: %s | 계좌주명: %s | 잔액: %s원 | 목표금액: %s원\n",
                category, accNo, owner, balance, goalAmount);
        //balance, goalAmount 수정 필요
    }

}
