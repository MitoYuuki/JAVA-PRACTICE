function multiple(numbers){
  let result = "";

  for(let i = 0;i < numbers.length; i++){
    if(numbers[i] % 3 === 0){
      result += "A";
    } else{
      result += "B";
    }
  }
  return result;
}

const m = multiple([1,2,3,4,5,6]);
console.log(m);
