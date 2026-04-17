class OrderManager{
  constructor(name,price){
    this.name = name;
    this.price = price;
  }
  sum(){
    let sum = 0;
    for(let i = 0; i < this.price.length; i++){
      sum += this.price[i];
    }
    return sum;
  }

  over1000(){
    let result = [];
      for(let i = 0; i < this.price.length; i++){
        if(this.price[i] >= 1000){
          result.push(this.price[i]);
        }
      }
      return result;
  }

  item_name(){
    let item = "";
    for(let i = 0;i < this.name.length; i++){
      item += this.name[i] + "D";
    }
    return item;
  }
}

const a = new OrderManager(["A","B","C"],[100,2000,10000]);
console.log(a.sum());
console.log(a.over1000());
console.log(a.item_name());