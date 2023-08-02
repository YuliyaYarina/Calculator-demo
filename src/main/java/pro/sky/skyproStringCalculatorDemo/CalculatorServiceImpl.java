package pro.sky.skyproStringCalculatorDemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public int plusSum(int num1, int  num2) {
        return num1 + num2;
    }

    public int minusSum(int num1, int  num2) {
        return num1 - num2;
    }

    public int multiplySum(int num1, int  num2) {
        return num1 * num2;
    } public int divideSum(int num1, int  num2) {
        return num1 / num2;
    }

}
