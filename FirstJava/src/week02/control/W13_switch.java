package week02.control;

public class W13_switch {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";

        switch (month){
            case 1:
                monthString = "1월";
                break;
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            case 4:
                monthString = "4월";
                break;
            case 5:
                monthString = "5월";
                break;
            case 6:
                monthString = "6월";
                break;
            case 7:
                monthString = "7월";
                break;
            case 8:
                monthString = "8월";
                break;
            case 9:
                monthString = "9월";
                break;
            case 10:
                monthString = "10월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default:
                monthString = "알수없음";
        }
        System.out.println(monthString);
    }
}
