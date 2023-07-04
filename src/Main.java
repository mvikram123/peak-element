//print index of peak element
public class Main {
    public static int peakElement(int arr[],int n){
        //First or last element is peak element
        if(n==1)return 0;
        if(arr[0]>=arr[1])
            return 0;
        if(arr[n-1]>=arr[n-2])
            return n-1;
        //check for other element

        for(int i=1; i<n-1; i++){
            if(arr[i-1]<=arr[i] && arr[i]>=arr[i+1])
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int arr[]={1,5,6,7,4};
        System.out.println(peakElement(arr,arr.length));
    }
}