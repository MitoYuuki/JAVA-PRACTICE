function max(numbers){
  let max = numbers[0];

  for(let i = 0; i < numbers.length; i++){
    if (numbers[i] > max) max = numbers[i];
  }
  return max
}
const m = max([1,5,3,9,2]);
console.log(m);