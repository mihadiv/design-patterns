package src.strategy;

import java.util.List;

public class Sorter {

    private SortStrategy strategy;

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> sort(List<Integer> values) {
        if (strategy != null) {
            return strategy.sort(values);
        } else {
            throw new SortStrategyNotSetException();
        }
    }
}
