package com.pixel.strisssues;

import org.springframework.util.ObjectUtils;

import java.util.Optional;
import java.util.function.Predicate;

public class StringReverseUsingTwoPointers {
    public static void main(String[] args) {
        System.out.println(reverseStringOptional(null));
        //System.out.println(revStr("hehe"));
    }
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length-1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
    public static String revStr(String str) {
        String rev = " ";
        int len = str.length()-1;
        for (int i= len; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static String reverseStringOptional(String str) {
        return Optional.ofNullable(str)
                .map(s -> {
                    char[] charArray = s.toCharArray();
                    int left = 0;
                    int right = charArray.length - 1;

                    while (left < right) {
                        // Swap the characters at the left and right pointers
                        char temp = charArray[left];
                        charArray[left] = charArray[right];
                        charArray[right] = temp;

                        // Move the pointers towards each other
                        left++;
                        right--;
                    }
                    return new String(charArray);
                }).orElse(null);
    }
}
