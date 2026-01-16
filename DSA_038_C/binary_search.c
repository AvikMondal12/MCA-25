#include<stdio.h>

int main (){
	int arr[100] = {2,3,4,5,6};
		int size =5;
		
		//Input the finding value 
		
		int key;
		printf("Enter the key value :");
		scanf("%d",& key);
		
	int min_val = 0,max_val = size-1,mid_val;
	int found = 0;



while(min_val<=max_val){

	mid_val = (min_val+max_val)/2;
	if(arr[mid_val]==key){
		printf("Key (%d) found at position %d",key,mid_val+1);
		found =1 ;
		break;
	}
	else if (arr[mid_val]<key){
		min_val = mid_val+1;
	}
	else{
		max_val = mid_val-1;
	}
}
if(found == 0){
	printf("Key is not found .");
}
	return 0;
	
}
//write a c program to revese an array by swaping the element without creating any duplicates array.
