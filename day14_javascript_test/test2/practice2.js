function add(numbers,text){
  let result = "";

  for(let i = 0; i < numbers.length; i++){
    if(numbers[i] % 2 === 0 ){
      result += numbers[i] + text;
    } else{
      result += numbers[i];
    }
  }
  return result;
}

const result = add([1,2,3,4],"E");
console.log(result);