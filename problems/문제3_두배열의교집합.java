import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 문제3_두배열의교집합 {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 2, 1};
        int[] n2 = {2, 2};

        System.out.println( solution(n1, n2));
        
    }

    public static List<Integer> solution(int[] nums1, int[] nums2){

        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])) {
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        return ans;
    }
}
