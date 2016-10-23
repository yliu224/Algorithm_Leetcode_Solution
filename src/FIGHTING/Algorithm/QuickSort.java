package FIGHTING.Algorithm;

/**
 * Created by dean on 9/27/2016.
 */
public class QuickSort {
    static int cnt=0;
    public void quickSort(int A[],int low,int high){
        if(low<high){
            int pivotIndex;
            pivotIndex=partition(A,low,high-1,high);
            quickSort(A,low,pivotIndex-1);
            quickSort(A,pivotIndex+1,high);
        }
    }
    public int partition(int A[],int low,int high,int pivot){
        cnt++;
        int temp;
        while(low<high){
            if(A[low]>=A[pivot]&&A[high]>=A[pivot]) high--;
            else if(A[low]<A[pivot]&&A[high]>=A[pivot]){low++;high--;}
            else if(A[low]>=A[pivot]&&A[high]<A[pivot]){
                temp=A[low];
                A[low]=A[high];
                A[high]=temp;
                low++;high--;
            }
            else if(A[low]<A[pivot]&&A[high]<A[pivot]){
                low++;
            }
        }
        if(A[low]<A[pivot]){
            temp=A[low+1];
            A[low+1]=A[pivot];
            A[pivot]=temp;
            return low+1;
        }
        else{
            temp=A[low];
            A[low]=A[pivot];
            A[pivot]=temp;
            return low;
        }
    }
}
