import java.util.*;

class RotationalCipher {

    private String plainText = "abcdefghijklmnopqrstuvwxyz";
    private String cipherText = "";
    Map <Character, Character> map = new HashMap<>();
    
    RotationalCipher(int shiftKey) {
        cipherText = plainText.substring(shiftKey) + plainText.substring(0, shiftKey);
        System.out.println(cipherText);
        for (int i = 0; i < 26; i++) {
            map.put(plainText.charAt(i), cipherText.charAt(i));
            map.put(Character.toUpperCase(plainText.charAt(i)), Character.toUpperCase(cipherText.charAt(i)));
        }
    }

    String rotate(String data) {
        String output = "";
        char [] dataArray = data.toCharArray();
        for (int i = 0; i < dataArray.length; i++) {
            if (map.containsKey(dataArray[i])) {
                output += map.get(dataArray[i]);
            } else {
                output += dataArray[i];
            }
        }
        return output;
    }

}
