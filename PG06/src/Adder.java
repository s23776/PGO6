import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int a, int b){
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> listOfNumbers){
        if(listOfNumbers.size() == 0)
            return BigDecimal.valueOf(0);
        BigDecimal result = listOfNumbers.get(0);
        for (BigDecimal number: listOfNumbers)
            result = result.add(number);
        return result;
    }
}