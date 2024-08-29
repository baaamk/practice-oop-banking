package BangkingSystem.bank;

import java.math.BigDecimal;

public class BasicInterestCalculator implements InterestCalculator {
    @Override
    public BigDecimal getInterest(BigDecimal balance) {
        BigDecimal interest;
        if (balance.compareTo(BigDecimal.valueOf(10000000)) >= 0) {
            interest = BigDecimal.valueOf(0.5);
        } else if (balance.compareTo(BigDecimal.valueOf(5000000)) >= 0) {
            interest = BigDecimal.valueOf(0.07);
        } else if (balance.compareTo(BigDecimal.valueOf(1000000)) >= 0) {
            interest = BigDecimal.valueOf(0.04);
        } else if (balance.compareTo(BigDecimal.valueOf(10000)) >= 0) {
            interest = BigDecimal.valueOf(0.02);
        } else {
            interest = BigDecimal.valueOf(0.01);
        }
        return balance.multiply(interest);
    }
}
