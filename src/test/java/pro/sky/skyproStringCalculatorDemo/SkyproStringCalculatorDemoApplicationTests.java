package pro.sky.skyproStringCalculatorDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class SkyproStringCalculatorDemoApplicationTests {

	static class CalculatorServiceTest {
		private CalculatorService calculator= new Calculator("Test: ");



		public static Stream<Arguments> testParameters() {
			return Stream.of(
					Arguments.of(0,1),
					Arguments.of(1,1),
					Arguments.of(5000,5000),
					Arguments.of(-5000,5000),
					Arguments.of(-5000,-5000),
					Arguments.of(100,-5000)
			);
		}

		public static Stream<Arguments> testNagativeParameters(){
			return Stream.of(
					Arguments.of(0,0),
					Arguments.of(1,0)
			);
		}
		@ParameterizedTest
		@MethodSource("testParameters")
		void plus(Integer num1, Integer num2) {
			assertEquals("Test: " + (num1 + num2), calculator.plus(num1, num2));
		}
		@ParameterizedTest
		@MethodSource("testParameters")
		void minus(Integer num1, Integer num2) {
			assertEquals("Test: " + (num1 - num2), calculator.minus(num1, num2));
		}
		@ParameterizedTest
		@MethodSource("testParameters")
		void multiply(Integer num1, Integer num2) {
			assertEquals("Test: " + (num1 * num2), calculator.multiply(num1, num2));
		}

		@ParameterizedTest
		@MethodSource("testParameters")
		void divide(Integer num1, Integer num2) {
			assertEquals("Test: " + (num1 / num2), calculator.divide(num1, num2));
		}
		@ParameterizedTest
		@MethodSource("testNagativeParameters")
		void divideByZero(Integer num1, Integer num2) {
			assertThrows(ArithmeticException.class, () -> {
				calculator.divide(num1,num2);
			});
		}

	}
}
