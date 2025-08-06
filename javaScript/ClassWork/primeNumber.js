let number = 88;

for(let count = 2; count < number; count++){
	let isPrimeNumber = true;
	for(let counter = 2; counter < count; counter++){
		if(count % counter == 0){
			isPrimeNumber = false;
			break;
			}
		}
			if(isPrimeNumber){
				console.log(count)
				}
		}	