function arraySort(array1, array2) {
	let numberStore = 0;
	let total = array1;
	let totalLength = array1.length + array2.length;
for(let index = array1.length; index < totalLength; index++){
	total[index]= array2[numberStore];
		numberStore++;}
		
for(let index = 0; index < total.length - 1; index++){
	for(let counter = index; counter < total.length; counter++){
	if(total[index] > total[counter]){
		numberStore = total[counter];
		total[counter] = total[index];
		total[index] = numberStore;
}
}
}
return total;
}


let number = [98,90,90,68,78,7];
let number2 = [7,32,34,2,23];
let array = arraySort(number,number2);
console.log(array);

