function sumNumbers(numbers){
  let sum = 0;

  for(let i = 0; i < numbers.length; i++){
    sum += numbers[i];
  }

  return sum;
}

function addTextIfContainsOne(numbers, text){
  let result = "";

  for(let i = 0; i < numbers.length; i++){
    if(numbers[i] === 1){
      result += numbers[i] + text;
    } else {
      result += numbers[i];
    }
  }

  return result;
}

const result = addTextIfContainsOne([1, 2, 3], "X");
console.log(result);

class Sample{
  constructor(numbers){
    this.numbers = numbers;
  }

  sum(){
    let sum = 0;

    for(let i = 0; i < this.numbers.length; i++){
      sum += this.numbers[i];
    }

    return sum;
  }

  addText(text){
    let result ="";

    for(let i = 0; i < this.numbers.length; i++){
      if(this.numbers[i] === 1){
        result += this.numbers[i] + text;
      } else{
        result += this.numbers[i];
      }
    }

    return result;
  }
}

// クラスの実行も追加するとさらに良い
const s = new Sample([1, 2, 3]);
console.log(s.sum());        // 6
console.log(s.addText("X")); // 1X23