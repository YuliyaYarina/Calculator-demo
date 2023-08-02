package pro.sky.skyproStringCalculatorDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

//    calculator/plus?num1=5&num2=5
//    plus?NAME=yuliya

    @GetMapping(path = "/plus")
    public String answerCalculator(@RequestParam("NAME") String userCalculator) {
        return calculatorService.answerCalculator(userCalculator);
    }
}
