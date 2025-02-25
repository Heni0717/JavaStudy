// 2주차 과제 : 자료구조 요리 레시피 메모장 만들기
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input
        //  : 저장할 자료구조명 입력(list, set, map) -> 제목 입력 -> 문장 입력 -> "끝" 문자 입력
        Scanner sc = new Scanner(System.in);
        ArrayList<String> li = new ArrayList<String>();
        String gu = sc.next();  // 자료구조
        String title = sc.next();   // 제목

        while (true){
            String content = sc.next();
            if(content.equals("끝")){
                break;
            }
            li.add(content);
        }

        // output
        //  : ["자료구조"로 저장된 "제목"], 문장 앞 번호 순서로 출력, 끝을 입력하면 입력 종료
        System.out.println("[ "+gu+"(으)로 저장된 " + title +" ]");
        for (int i = 0; i < li.size(); i++) {
            System.out.println((i+1) + ". " + li.get(i));
        }
    }
}