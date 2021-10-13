package Trade;

import java.util.List;

public interface MallonExchange {

    public double getPrice(Symbol symbol, Integer quantity);

    public List<String> getTodos(String user);
}
