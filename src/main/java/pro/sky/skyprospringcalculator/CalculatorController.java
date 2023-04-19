package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService CalculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.CalculatorService = calculatorService;
    }


    @GetMapping (path = "/calculator")
    public String calculator(@RequestParam("calculator") String calculator) {
        return CalculatorService.calculator(calculator);
    }
}
