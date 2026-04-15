class ArrayProcessor{
  constructor (numbers) {
    this.numbers=numbers;
  }
  
  sum(){
    let sum = 0;
    for(let i = 0; i < this.numbers.length; i++){
      sum += this.numbers[i];
    }
    return sum;
  }

  getOddNumbers(){
  let result = [];

  for(let i = 0; i < this.numbers.length; i++){
    if(this.numbers[i] % 2 !== 0){
      result.push(this.numbers[i]);
    }
  }

    return result;
  }
}
const s = new ArrayProcessor([1,2,3]);
console.log(s.sum());
console.log(s.getOddNumbers());


