package NewStart;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
class ASSIGNMENT4 {
 private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}
	

	
	
	@Test
	void test_add_two_numbers() {
		assertEquals(4, calculator.add(2, 2));	}
		
   @Test
   void test_mul_two_number()
   {
	   assertEquals(8,calculator.mul(4,2));
   }
   @Test
   void test_paramaterised(int num1, int num2, int res)
   {
	   assertEquals(res,calculator.test(num1,num2));
   }
   @Test
	void test_divide_number_with_zero_expect_ArithmaticEx() {
		RuntimeException exception = Assertions
				.assertThrows(ArithmeticException.class,
						()-> calculator.divide(4, 0),
						()-> "divide by zero is not allowed");
   }
   
   
	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	

}
