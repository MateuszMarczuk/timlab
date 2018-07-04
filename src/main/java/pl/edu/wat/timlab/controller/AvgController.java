package pl.edu.wat.timlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wat.timlab.Numbers;
import pl.edu.wat.timlab.service.AverangeService;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/averange")
public class AvgController {

    @Autowired
    AverangeService averangeService;

    @PreAuthorize("hasRole('AVG')")
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Map<String,Object> getAverange(@RequestBody Numbers numbers){
        Map<String,Object> model = new HashMap<>();
        double averange = averangeService.getAverange(numbers.getNumbers());
        model.put("averange",averange);
        return model;
    }
}
