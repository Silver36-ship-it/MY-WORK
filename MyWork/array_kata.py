def maximum_in_list(numbers):
	maximum = numbers[0]
	for number in numbers[1:]:
		if maximum < number:
			maximum = number
	return [maximum]
	
def minimum_in_list(numbers):
	minimum = numbers[0]
	for number in numbers[1:]:
		if minimum > number:
			minimum = number
	return [minimum]
	
def sum_of_list(numbers):
	sum = 0
	for number in numbers:
		sum += number
	return [sum]
	
def sum_of_even_list(numbers):
	sum_even = 0
	for number in numbers:
		if number % 2 == 0:
			sum_even += number
	return [sum_even]
	
def sum_of_odd_list(numbers):
	sum_odd = 0
	for number in numbers:
		if number % 2 != 0:
			sum_odd += number
	return [sum_odd]
	
def maximum_and_minimum_list(numbers):
	maximum = numbers[0]
	minimum = numbers[0]
	for number in numbers[1:]:
		if maximum < number:
			maximum = number
		if minimum > number:
			minimum = number
	return [maximum,minimum]
	
	
def no_of_odd_numbers_in_list(numbers):
	count_odd = 0
	for number in numbers:
		if number % 2 != 0:
			count_odd += 1
	return [count_odd]
	
def no_of_even_numbers_in_list(numbers):
	count_even = 0
	for number in numbers:
		if number % 2 == 0:
			count_even += 1
	return [count_even]
	
def even_numbers_in_list(numbers):
	new_list = []
	for number in range(0,len(numbers)):
		if numbers[number] % 2 == 0:
			new_list.append(numbers[number])
	return new_list
	
def odd_numbers_in_list(numbers):
	new_list = []
	for number in range(0,len(numbers)):
		if numbers[number] % 2 != 0:
			new_list.append(numbers[number])
	return new_list
	
def square_numbers_in_list(numbers):
	new_list = []
	for number in range(0,len(numbers)):
		square = numbers[number] * numbers[number]
		new_list.append(square)
	return new_list	
		
def main():
	number1 = [6,4,3,5,1,2,9,4]
	
	print("Max number ", maximum_in_list(number1))
	
	print("Sum of number ", sum_of_list(number1))

	print("Squared numbers ", square_numbers_in_list(number1))

	print("Even numbers ", even_numbers_in_list(number1))
	print("Odd numbers ", odd_numbers_in_list(number1))

	print('Sum of odd number is', sum_of_odd_list(number1))
	
	print('Maximum and minimum are', maximum_and_minimum_list(number1))
	print('Number of even', no_of_even_numbers_in_list(number1))


main()