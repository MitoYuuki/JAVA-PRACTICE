class ScoreManager{
  constructor(score){
    this.score = score;
  }

  sum(){

    let sum = 0;

    for(let i = 0; i < this.score.length; i++){
      sum += this.score[i];
    }
    return sum;
  }

  average(){

    let sum = 0;
    let average = 0;

    for(let i = 0; i < this.score.length; i++){
      sum += this.score[i];
      average = sum / this.score.length;
    }
    return average;
  }

  over60(){
    let over60 = [];

    for(let i = 0; i < this.score.length; i++){
      if(this.score[i] >= 60){
        over60.push(this.score[i]);
      }
    }
    return over60;
  }
}

const s = new ScoreManager([10,50,90]);
console.log(s.sum());
console.log(s.average());
console.log(s.over60());