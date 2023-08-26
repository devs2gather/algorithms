class Solution{
    missingNumber(array,n){
        
        let requiredSum = (n*(n+1))/2;
       let sum = 0;
       for(let i=0;i<array.length;i++){
           sum+=array[i]
       }
       
       let MissingNum = requiredSum-sum;
       return(MissingNum)
    }
}

//given array 1 to N and there is a missing num