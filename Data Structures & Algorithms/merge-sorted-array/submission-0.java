class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i=0,j=0,k=0;
        int[] c=new int[m+n];
        while(i<m && j<n){
             if(num1[i]>num2[j]){
                c[k++]=num2[j++];
             }
             else{
                c[k++]=num1[i++];
             }
        }
        for(;i<m;i++){
            c[k++]=num1[i];
        }
        for(;j<n;j++){
            c[k++]=num2[j];
        }
for (int x = 0; x < m + n; x++) {
    num1[x] = c[x];
}
    }
}