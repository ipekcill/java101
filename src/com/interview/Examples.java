package com.interview;

public class Examples {

    public static void main(String[] args) {
        //  1.Tekrar edenleri veren algoritma
        /*Set<Character> charSet = new HashSet<>();
        List<Character> charList = new ArrayList<>();
        String str = "abcbcddff";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!charSet.add(ch)) {
                charList.add(ch);
            }

        }
        System.out.println(charList);
    }*/
        /*// 2. 2 stringin en uzun ortak alt stringi
        List<String> subStringsS1 = new ArrayList<>();
        List<String> subStringsS2 = new ArrayList<>();
        List<String> commonSubStrings = new ArrayList<>();
        String s1="abcdfg";
        String s2="abcdgf";

        for(int i=0; i<s1.length(); i++){
            for (int j=i+1; j<s1.length()+1; j++){
                subStringsS1.add(s1.substring(i,j));
            }
        }
        for(int i=0; i<s2.length(); i++){
            for (int j=i+1; j<s2.length()+1; j++){
                subStringsS2.add(s2.substring(i,j));
            }
        }
        for (String item: subStringsS1){
            if(subStringsS2.contains(item)){
                commonSubStrings.add(item);
            }
        }
        String longestCommonSubstring=commonSubStrings.get(0);
        for(String item:commonSubStrings){
            if(item.length()>longestCommonSubstring.length()){
                longestCommonSubstring=item;
            }
        }
        System.out.println(longestCommonSubstring);
*/
        /*//3. Bir stringin 3 elemanlı alt stringleri
        String s1 = "abcdfg";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s1.length()-2; i++) {
            list.add(s1.substring(i,i+3));
        }
        System.out.println(list);*/




    }
}
