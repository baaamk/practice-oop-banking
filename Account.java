public class Account{
    String account; //N:예금 , S:적금
    int account_num;
    String owner;
    int coin;
    boolean active;

    Account(String account, int account_num, String owner, int coin, boolean active){
        this.account = account;
        this.account_num = account_num;
        this.owner = owner;
        this.coin = coin;
        this.active = active;
    }
    public String getAccount(){
        return account;
    }
    public void setAccount(String account){
        this.account = account;
    }
    public int getAccount_Num(){
        return account_num
    }
    public void setAccount_Num(int account_num){
        this.account_num = account_num;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public int getCoin(){
        return coin;
    }
    public void setCoin(int coin){
        this.coin = coin;
    }
    public boolean getActive(){
        return active;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    
    public String getAccountInfo(){
        return "계좌 종류:" + account + "/n" +
                "계좌번호:" + account_num + "/n" +
                "이름:" + owner + "/n" + 
                "잔액:" + coin + "/n" +
                "활성화:" + active;
    }
}
public class S extends Account{//적금계좌
    int target;
}

    


