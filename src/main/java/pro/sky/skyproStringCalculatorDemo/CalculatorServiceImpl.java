package pro.sky.skyproStringCalculatorDemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String answerHello(String userName) {
        return "hello " + userName;
    }

}
