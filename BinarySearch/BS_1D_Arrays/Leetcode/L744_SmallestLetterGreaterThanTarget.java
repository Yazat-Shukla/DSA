package Leetcode;

public class L744_SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'x';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;
            if (target>= letters[letters.length-1]){
                return letters[0];
            }
            while (start <=end){
                int mid = start +(end-start)/2;
                if (target<letters[mid]){
                    end = mid -1;
                } else {
                    start = mid+1;
                    // return letters[mid];
                }
            }
            //figure out the logic behind this why
            return letters[start % letters.length];
        }

    }

