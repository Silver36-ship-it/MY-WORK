"""step 1. collect two input(accepts a number and accepts a letter)
	step 2. declare a variable that makes sure that temperature value can be in decimal
	step 3. declare a conditional statement to ensure valid inputs
	step 4. declare a variable to store threshold for both temperatures respectively
	step 5. declare a variable that converts both temperature respectively
	step 6. declare a conditional statement to return the right response for heat advisory.
												""" 

import unittest
import weekend_snacks_function

class TestWeekendSnacksFunction(unittest.TestCase):
	def test_weekend_snacks_function_exist(self):
		weekend_snacks_function.temperature_value(1.89,'c')
		
	def test_that_heat_advisory_is_working(self):
		result = weekend_snacks_function.temperature_value(78.89,'f')
		self.assertEqual(result,'cold advisory')
		
	def test_that_first_input_is_not_string(self):
		self.assertRaises(ValueError,weekend_snacks_function.temperature_value,"yu",'e')
		
	def test_that_second_input_is_only_string(self):
		self.assertRaises(ValueError,weekend_snacks_function.temperature_value,"yu",'78')
	
	def test_that_inputs_are_not_negative_number(self):
		self.assertRaises(ValueError,weekend_snacks_function.temperature_value,-3,-32)	
		
	def test_that_first_input_is_not_a_decimal_number(self):
		self.assertRaises(ValueError,weekend_snacks_function.temperature_value,4.623,-32)
		
	def test_that_second_input_is_not_a_decimal_number(self):
		self.assertRaises(ValueError,weekend_snacks_function.temperature_value,4.623,3.2)
