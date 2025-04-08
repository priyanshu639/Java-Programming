int si=0;
int ei=nums.length()-1;
int mid=(ei-si)/2;
while(si<=ei){
    if(nums[mid]==target){
        return mid;
    }else if(nums[mid]>target){
        ei=mid-1;
    }else{
        si=mid+1;
    }
}
