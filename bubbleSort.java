import java.util.*;
class bubbleSort{
    public static void main(String args[]){
        int array[]={
            23,4,78,1,6
        };
        //bubble sort
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
            if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        
            }
           // reverse(array);
            for(int k=0;k<array.length;k++){

                System.out.print(array[k]+" ");
            }
            System.out.println();
        }
       
    }
}