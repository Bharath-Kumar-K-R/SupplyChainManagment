class binary{
 p s int  binarySearch(int  arr[] ,int key){
int l=0,h=arr.length-1;
while(l<=h){
int mid=(l+h)/2;
if(arr[l]==key)
return l;
else if(key > arr[mid]
l=mid+1;
else 
 h=mid-1;
}
return -1;
}
p s v m (String [] args){
int arr[]={1,2,3,4,5};
int key =10;
binarySearch(arr ,key);
}
}
