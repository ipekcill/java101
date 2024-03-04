package com.mix;
// polindromik kelimeler
public class Example13 {
    public static void main(String[] args) {
        String str = "kapak", temp = "";
        for(int i=str.length()-1; i>=0; i--){
            temp=temp+str.charAt(i);
        }
        if(str.equals(temp)){
            System.out.println("polindromik");
        }else{
            System.out.println("not polindromik");
        }
    }

}
