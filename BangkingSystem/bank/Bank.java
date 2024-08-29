package BangkingSystem.bank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    protected static Scanner scanner = new Scanner(System.in);
    protected int seq = 0;
    public static BigDecimal df = new BigDecimal("#,###");

    private HashMap<String, InterestCalculator> interestCalculators = new HashMap<>();

    public Bank() {
        interestCalculators.put("N", new BasicInterestCalculator());
        interestCalculators.put("S", new SavingInterestCalculator());
    }


}
