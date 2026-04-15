function addStarToOdd(numbers,text){
  let result = "";

  for(let i = 0; i < numbers.length; i++){
    if(numbers[i] % 2 !== 0){
      result += numbers[i] + text;
    }
  }
  return result
}

const result = addStarToOdd([1, 2, 3], "☆☆☆");
console.log(result);

