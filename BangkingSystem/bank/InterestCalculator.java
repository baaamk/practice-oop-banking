package BangkingSystem.bank;

import java.math.BigDecimal;

public interface InterestCalculator {
    BigDecimal getInterest(BigDecimal balance);
}
