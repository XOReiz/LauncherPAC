package io.github.confuser2188.launcherpac.misc;

public class StringUtils {

    private static char[] allowedCharacters = new char[] {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '_'
    };
    public static boolean isValidUsername(String username){
        for(char ch : username.toCharArray()){
            boolean found = false;

            for(char c : allowedCharacters)
                if(ch == c){
                    found = true;
                    break;
                }

            if(!found)
                return false;
        }
        return true;
    }

}
