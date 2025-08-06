""" A console that checks for password strength.
	
	1. prompt user to put password
	2. check for the length of the input
	3. check for letters,characters and digits in the input
	4. assign strength rating based on number 3
	5. declare a while loop to keep prompting user to enter pswrd if he wants"""
	
def get_password():
	user_input = input('Enter a passcode: ')
	return user_input
	
def check_complexity(password):
	char_count = list(password)
	alpha_count = 0
	num_count = 0
	for count in char_count:
		if count.isalpha():
			alpha_count += 1
		elif count.isdigit():
			num_count += 1
	return alpha_count, num_count
	
def evaluate_strength(alpha_count,num_count):
	if alpha_count < 5 or num_count == 0:
		return 'Weak passcode'
	elif 5 <= alpha_count <= 8 and num_count >= 1:
		return 'Moderate passcode'
	elif alpha_count > 8 and num_count >= 2:
		return 'Strong passcode'
	else:
		return 'Weak'
		
def main():
	while True:
		password = get_password()
		alpha_count, num_count = check_complexity(password)
		password_strength = evaluate_strength(alpha_count,num_count)
		print('Contains', alpha_count ,'alphabets' )
		print('Contains', num_count, 'number')
		print(password_strength)
		try_again = input('wish to check for another passcode? press yes or any other character to quit: ')
		if try_again != 'yes':
			print('Alright bye')
			break
main()
	
	 
	