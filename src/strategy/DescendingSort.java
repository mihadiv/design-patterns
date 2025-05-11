package src.strategy;

import java.util.List;

public class DescendingSort implements SortStrategy {

    @Override
    public List<Integer> sort(List<Integer> numbers) {
        return numbers.stream().sorted((a, b) -> b - a).toList();
    }
}
