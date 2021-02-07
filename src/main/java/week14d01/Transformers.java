package week14d01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Transformers {

    public <T, R> List<R> map(List<T> list, Function<T, R> transformer) {
        List<R> newList = new ArrayList<>();
        for (T item : list) {
            newList.add(transformer.apply(item));
        }
        return newList;
    }

    public <T> T reduce(List<T> list, T identity, BiFunction<T, T, T> combiner) {
        T result = identity;
        for (T item : list) {
            combiner.apply(result, item);
        }
        return result;
    }

}
