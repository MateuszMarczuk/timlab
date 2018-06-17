package pl.edu.wat.timlab.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.edu.wat.timlab.service.AverangeService;

import java.util.List;


@Service
@Slf4j
public class AvgServiceImpl implements AverangeService {


    @Override
    public double getAverange(List<Integer> numbers) {
        if (numbers == null) {
            return -1;
        }

        double averange = 0;

        for(Integer n: numbers){
            averange += n;
        }
        averange /= numbers.size();

        return averange;
    }
}
