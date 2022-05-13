import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    public int multiply(int a, int b){
        return a * b;
    }

    public int multiply(int a, int b, int c, int d){
        int firstResult = multiply(a, b);
        int secondResult = multiply(firstResult, c);
        return multiply(secondResult, d);
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    public Integer multiply(List<Integer> listOfNumbers) {
        if(listOfNumbers.size() == 0)
            return 0;
        Integer result = listOfNumbers.get(0);
        for (Integer number: listOfNumbers)
            result *= number;
        return result;
    }
}