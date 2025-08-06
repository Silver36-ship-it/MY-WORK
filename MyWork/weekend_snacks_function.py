def temperature_value(value,unit_of_measurement = 'c'):
	value = float(value)
	if type(value) != int and value != float and value <= 0:
		raise ValueError
	if type(unit_of_measurement) != str:
		raise ValueError
	if unit_of_measurement != 'c' and unit_of_measurement != 'f':
		raise ValueError

	threshold_for_celsius = 38
	threshold_for_fahrenheit = 100
	convert_to_celsius = (value - 32) * 5/9
	convert_to_fahrenheit = (value * 1.8) + 32
	if unit_of_measurement == 'f':
		if convert_to_celsius < threshold_for_celsius:
			return 'cold advisory'
		else:
			return 'Heat alert'
	elif unit_of_measurement == 'c':
		if convert_to_fahrenheit < threshold_for_fahrenheit:
			return 'cold advisory'
		else:
			return 'Heat alert'
	
		