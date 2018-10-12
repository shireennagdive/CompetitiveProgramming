import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> fixedPrefixValues = new HashMap<>();
        Map<String,Integer> symbolValues = new HashMap<>();
        int value=0;
        fixedPrefixValues.put("IV",4);
        fixedPrefixValues.put("IX",9);
        fixedPrefixValues.put("XL",40);
        fixedPrefixValues.put("XC",90);
        fixedPrefixValues.put("CD",400); //"MCDLXXVI" 1000+500+50+10+10+6
        fixedPrefixValues.put("CM",900);
        symbolValues.put("I",1);
        symbolValues.put("V",5);
        symbolValues.put("X",10);
        symbolValues.put("L",50);
        symbolValues.put("C",100);
        symbolValues.put("D",500);
        symbolValues.put("M",1000);
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1 && fixedPrefixValues.containsKey(s.substring(i,i+2))){
                value+=fixedPrefixValues.get(s.substring(i,i+2));
                i+=1;
            }else{
                value+=symbolValues.get(Character.toString(s.charAt(i)));
            }
        }
        return value;
    }
}
