package pl.edu.wat.timlab;

import lombok.Data;

import java.util.List;


@Data
public class Numbers {
    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }
}
