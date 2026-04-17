function sum_over_two(numbers){
  let result = 0;
  for(i = 0; i < numbers.length;i++){
    if(numbers[i] >= 2){
      result += numbers[i];
    }
  }
  return result;
}

const s = sum_over_two([1,2,3,4,5]);
console.log(s);