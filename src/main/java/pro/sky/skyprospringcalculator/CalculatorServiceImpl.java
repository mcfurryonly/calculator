package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String calculator(String calculator) {
        return "Добро пожаловать";
    }


}
