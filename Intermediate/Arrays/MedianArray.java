import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int[] a={1,2};
        int[] b={3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<res.length;i++){
            if(i<nums1.length)
                res[i]=nums1[i];
            else
                res[i]=nums2[j++];
        }
        System.out.println(Arrays.toString(res));
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
//        System.out.println(res);
        int mid=(0+res.length-1)/2;
        if(res.length%2==0){
            double res1=(double)( res[mid]+res[mid+1])/2;
            return res1;
        }else{
            return res[mid]/2;
        }
    }
}
