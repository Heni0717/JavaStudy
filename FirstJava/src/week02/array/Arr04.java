package week02.array;

public class Arr04 {
    public static void main(String[] args) {
        // String 기능 활용 예시 - 배열
        String str = "ABCD";

        // (1) length   : 길이 반환
        int strLength = str.length();
        // (2) charAt(int index)    : 한글자 추출?
        char strChar = str.charAt(1);
        // (3) substring(int fromIdx, int toIdx)    : 범위를 지정해 추출
        String strSub = str.substring(0,3);
        // (4) equals   : 값이 같은지?
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        // (5) toCharArray() : String -> char[]
        char[] strCharArr = str.toCharArray();
        System.out.println(strCharArr);
        // (6)  : char[] -> String
        char[] charArr = {'a', 'b', 'c'};
        String charArrString = new String(charArr);
        System.out.println(charArrString);
    }
}
