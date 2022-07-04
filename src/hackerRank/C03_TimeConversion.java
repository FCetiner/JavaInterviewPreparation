package hackerRank;

public class C03_TimeConversion {
    public static void main(String[] args) {
    //Given a time in -hour AM/PM format, convert it to military (24-hour) time.
        //Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
        //- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
        String s="12:45:54PM";

        System.out.println(timeConversion(s));
    }
    public static String timeConversion(String s) {
        String result="";

        if(s.substring(s.length()-2).contains("AM")){
            String onlyTime1=s.substring(0,s.length()-2);
            String[] arr=onlyTime1.split(":");
            int hour1=Integer.valueOf(arr[0]);
            if(hour1==12){
                result="00"+":"+arr[1]+":"+arr[2];
            }else {
                result =s.substring(0,s.length()-2);
            }
        }else{
            String onlyTime2=s.substring(0,s.length()-2);
            String[] arr=onlyTime2.split(":");
            int hour2=Integer.valueOf(arr[0])+12;
            if(hour2>23){
                result="12"+":"+arr[1]+":"+arr[2];
            }else {
                result = hour2 + ":" + arr[1] + ":" + arr[2];
            }
        }
        return result;
    }
}
