package LevelOne;

public class RansomNote {

    public static void main(String[] args) {

       String ransomNote = "aa";
       String magazine = "ab";

        System.out.println(canConstruct(ransomNote,magazine));

    }

    public static boolean  canConstruct(String ransomNote,String magazine){
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if (index == -1) {
                return false;
            }
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
        return true;
    }
}
