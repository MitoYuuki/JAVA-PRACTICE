function add(numbers){
  let sum = 0;

  for(let i = 0; i < numbers.length; i++){
    if(numbers[i] >= 5 ){
      sum += numbers[i];
    }
  }
  return sum;
}

const sum = add([1,2,3,4,5,6,7,8,9]);
console.log(sum);