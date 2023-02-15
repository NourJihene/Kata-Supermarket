package kata;

import java.math.BigDecimal;
import java.util.Objects;

public class Amount {

   final private BigDecimal value;

   private Amount(BigDecimal value) {
        this.value = value;
    }

    public static Amount of(String s) {
        return new Amount(new BigDecimal(s));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount = (Amount) o;
        return value.equals(amount.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Amount{" +
                "value=" + value +
                '}';
    }

    public BigDecimal getValue() {
       return value;
    }
}
