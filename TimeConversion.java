public class TimeConversion {
    public static void main(String[] args) {
        String time="05:30PM";
        String newTime="";
        if(time.charAt(time.length()-2)=='P')
        {
            int x=Integer.parseInt(time.substring(0, 2));
            newTime=String.valueOf(x+12)+time.substring(2, 5);
        }
        else
        {
            newTime=time.substring(0, 5);
        }
        System.out.println(newTime);
    }
}
