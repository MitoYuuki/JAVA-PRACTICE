class Calculator{
  sum_over_two(numbers){
    let result = 0;
    for(let i = 0; i < numbers.length;i++){
      if(numbers[i] >= 2){
        result += numbers[i];
      }
    }
    return result;
  }
  display(value){
    console.log(`The value is ${value}.`);
  }
}
const calc = new Calculator();
const a = calc.sum_over_two([1,2,-1,2,3]);
calc.display(a);