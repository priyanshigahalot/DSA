class SelectionSort{
    public static void main(String args[]){
        int array[]={
            23,4,78,1,6
        };
        //bubble sort o(n2)
        for(int i=0;i<array.length-1;i++){
            int small=i;
            for(int j=i+1;j<array.length;j++){
          if(array[small]>array[j]){
            small=j;
          }
            }
            int temp=array[small];
            array[small]=array[i];
            array[i]=temp;

            for(int k=0;k<array.length;k++){
                System.out.print(array[k]+" ");
            }
            System.out.println();
        }
       
    }
}