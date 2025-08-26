package StringDemo;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String s1 = "Shivam";

        char[] arr = s1.toCharArray();

        System.out.println("Char Array:"+ Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" , ");
//        }
        //Char At
        String s2 = "Soham";

        System.out.println("Char At 1:"+s2.charAt(1));

//        important
        String s10 = "hello";
        String s11 = "hello";
        System.out.println(s10==s11);
        System.out.println(s10.equals(s11));//true

        String s13 = new String("hello");
        String s14 = new String("hello");
        System.out.println(s13 == s14);//false
        System.out.println(s13.equals(s14));//true because it checks the content not the address

        //indexof
        //replace
        //substring


    }
    //String to Char





}
