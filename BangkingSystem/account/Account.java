package BangkingSystem.account;

import lombok.Setter;

import java.math.BigDecimal;

public class Account {
    // 일반 계좌 클래스의 속성은 계좌종류(N: 예금계좌, S:적금계좌), 계좌번호, 소유자, 잔액, 활성화 여부 5가지 입니다.
    protected String category;
    protected String accNo;
    protected String owner;
    protected BigDecimal balance;
    protected boolean isActive;

    public Account(){
        isActive = true;
        category = "N";
    }

    public Account(String accNo, String owner, BigDecimal balance){
        this();
        this.accNo = accNo;
        this.owner = owner;
        this.balance = balance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }


    public void getAccountInfo(){
        System.out.printf("계좌종류: %s | 계좌번호: %s | 계좌주명: %s | 잔액: %s원\n",
                category, accNo, owner, balance);
        //balance 수정 필요
    }

    public BigDecimal withdraw(BigDecimal amount){

        return amount;
    }

    public BigDecimal deposit(BigDecimal amount){

        return amount;
    }
}
