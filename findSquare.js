var data = [  
      [1, 1, 1, 1, 1, 1, 1],
      [1, 1, 1, 1, 1, 1, 1],
      [1, 1, 1, 0, 0, 0, 1],
      [1, 0, 1, 0, 0, 0, 1],
      [1, 0, 1, 1, 1, 1, 1],
      [1, 0, 1, 0, 0, 1, 1],
      [1, 1, 1, 0, 0, 1, 1],
      [1, 1, 1, 1, 1, 1, 1]
    ];
console.log(get_size(data));

function get_size(data){
  var x = data[1].length;
  var y = data.length;
  
  var temp = data;
  
  var cord = [];
  
  var result = [];
  for(var i = 0; i< x; i++){
    for(var j = 0; j < y-1; j++){
       if(temp[i][j]== 0){
          if(temp[i-1][j]!=0 && temp[i][j-1]!=0){
            
            var coordinate = i +":"+j;
            cord.push(coordinate);
          
          }
       }
    }
  }
  
  //console.log(cord);
  
  for(var i = 0; i < cord.length; i ++){
    var someString = cord[i];
    var index = someString.indexOf(":");
    var tempx = someString.substr(0,index);
    var tempy = someString.substr(index+1);
    var width = 0;
    var length = 0;
    while(tempx < x && temp[tempx][tempy]==0){
         tempx++;
         width++;
    }
    tempx = someString.substr(0,index);
    while(tempy < y &&temp[tempx][tempy]==0){
         tempy++;
         length++;  
    }
    var tempc = width + " by " + length;
    result.push(tempc);
   
 
  }

  return result;
}
