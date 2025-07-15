public class MathEx {
    public static int swap(int z){
        int result = (z%10*10)+(z%100/10)+(z/100*100);
        return result;
    }

    public static void main(String []args){
       int y= swap(465);
        System.out.println(y);
        int x= swap(705);
        System.out.println(x);
        int v= swap(302);
        System.out.println(v);
        timeLeft(3,19,5,20);
        timeLeft(5,27,9,10);
        dayOfWeek(0,21);
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(4,3));
    }
    public static void timeLeft(int curHour,int curMin, int depHour, int depMin){
        int answer = ((depHour*60+depMin)-(curHour*60+curMin))/60;
        int result2 = ((depHour*60+depMin)-(curHour*60+curMin))%60;
        System.out.println(answer + " hours " + result2 + " minutes");

    }
      public static int dayOfWeek(int dayMonthStarts, int day){
        int answer2 = (dayMonthStarts-1+day)%7;
        return answer2;
    }
}
