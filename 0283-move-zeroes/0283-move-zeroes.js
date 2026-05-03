/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let n = nums.length;
    for (let i =0;i<n;i++){
        if(nums[i]==0){
            for(let j=i+1;j<n;j++){
                if(nums[j] != 0){
                    let temp =nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp; 
                 break;
                }
            }
        }
    }
};