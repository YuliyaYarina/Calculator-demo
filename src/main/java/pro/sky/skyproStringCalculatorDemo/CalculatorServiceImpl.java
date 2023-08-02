package pro.sky.skyproStringCalculatorDemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String answerCalculator(String userCalculator) {
        return "hello " + userCalculator;
    }

}
