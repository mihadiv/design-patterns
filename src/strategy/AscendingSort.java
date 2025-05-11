package src.strategy;

import java.util.List;

public class AscendingSort implements SortStrategy {

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        return numbers.stream().sorted().toList();
    }
}
