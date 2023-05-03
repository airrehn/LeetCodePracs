class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int arr1pointer = 0;
        int arr2pointer = 0;
        int[] tempArr = new int[n+m];


        if(m==0) {
            for(int i = 0; i<n;i++) {
                nums1[i] = nums2[i];

            }
            
        } else if(n==0) {
            //do nothing
        }  else {  
            for(int i = 0; i<m+n;i++) {

                if(arr1pointer>m-1) {
                    tempArr[i] = nums2[arr2pointer];
                    arr2pointer++;
                } else if(arr2pointer>n-1) {
                    tempArr[i] = nums1[arr1pointer];
                    arr1pointer++;
                } else {   
                    
                    if(nums1[arr1pointer]<=nums2[arr2pointer]) {
                        tempArr[i] = nums1[arr1pointer];
                        arr1pointer++;
                    } else {
                        tempArr[i] = nums2[arr2pointer];
                        arr2pointer++;
                    }
                    
                }
            }
            
            for(int i = 0; i<n+m;i++) {
                nums1[i] = tempArr[i];

            }
        } 
            
    }
}

//if u fill from the back of nums1, you dont need a temp arr to hold and transfer the values back.