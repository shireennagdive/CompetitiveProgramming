
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strings = new String[]{"sar", "ish", "tan", "ras", "nat", "shi"};
        List<List<String>> groupedAnagrams = groupAnagrams.groupAnagrams(strings);
        for (List<String> list1 : groupedAnagrams) {
            for (String s : list1) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        int[] primeNums = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        int product;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<List<String>> groupedAnagrams = new ArrayList<List<String>>();
        for (String str : strs) {
            product = 1;
            for (char c : str.toCharArray()) {
                product *= primeNums[c - 'a'];
            }
            List<String> temp_list;
            if (map.containsKey(product)) {
                temp_list = groupedAnagrams.get(map.get(product));
            } else {
                temp_list = new ArrayList<String>();
                groupedAnagrams.add(temp_list);
                map.put(product, groupedAnagrams.size() - 1);
            }
            temp_list.add(str);
        }
        return groupedAnagrams;

    }


}
