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

    @GetMapping(path = "/plus")
    public int plus(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.plusSum(num1,num2);
    }

//    /calculator/minus?num1=5&num2=5
    @GetMapping(path = "/minus")
    public int minus(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.minusSum(num1,num2);
    }

//    /calculator/multiply?num1=5&num2=5
    @GetMapping(path = "/multiply")
    public int multiply(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.multiplySum(num1,num2);
    }
///calculator/divide?num1=5&num2=5

    @GetMapping(path = "/divide")
    public int divide(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return calculatorService.divideSum(num1,num2);
    }

}
