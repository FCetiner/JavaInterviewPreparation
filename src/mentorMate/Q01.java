package mentorMate;

public class Q01 {
    public static void main(String[] args) {

    }

    public int findMissing(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]+2!=nums[i+1]){
                result=nums[i]+2;
            }
        }
        return result;
    }

    public int findDifference(String str) {
        String[] arr=str.split("");
        int count1=0;
        int count2=0;
        for(int i=1;i<arr.length;i++){
            if(arr[0]==arr[i]){
                count1++;
            }else{
                count2++;
            }

        }
        return Math.abs(count1-count2);
    }
}
