//This technique also called as modified binary search
public class sortedndrotateddividenconquer {
    public static int search(int arr[],int target,int si,int ei){
        //base case
        if(si>ei){
            return -1; //target does not exist in it then returns -1
        }
        //WORK TO BE DONE
        int mid = (si+ei)/2;

        //case FOUND TARGET directly on mid
        if(arr[mid]== target){
            return mid;
        }
        //case not FOUND TARGET and MID lies on LINE 1
        if(arr[si]<=arr[mid]){
            //case a : target on left
            if(arr[si]<=target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                //case b : target on right
                return search(arr, target, mid+1, ei);
            }

        }
        //case not FOUND TARGET and MID lies on LINE 2
        else{
            //case c : target on right of line 2
            if(arr[mid]<=target && target <=arr[ei]){
                return search(arr,target,mid+1,ei);

            }
            else{
                //case d: target on left
                return search(arr,target,si,mid-1);
            }

        }


    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int tar=0; //output should be --> 4
        int targetIdx=search(arr,tar,0,arr.length-1);
        System.out.println(targetIdx);
    }
    
}
