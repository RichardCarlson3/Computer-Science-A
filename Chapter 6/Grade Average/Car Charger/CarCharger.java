public class CarCharger {
    /** the following rateTable has 24 entries representing the
     * charging costs for hours 0 through 23.
     */
    private int [] rateTable;

    public static void main(String[] args) {

        int [] table = {50,60,160,60,80,100,100,120,150,150,150,
                200,40,240,220,220,200,200,180,180,140,100,80,60};
        CarCharger cc = new CarCharger(table);
        System.out.println("Charging costs");
        System.out.println("12 1, " + cc.getChargingCost(12,1));
        System.out.println("0, 2, " +cc.getChargingCost(0, 2));
        System.out.println("22, 7, " + cc.getChargingCost(22, 7));
        System.out.println("22, 30, " + cc.getChargingCost(22,30));
        System.out.println("Best start Time");
        System.out.println("1 " + cc.getChargeStartTime(1));
        System.out.println("2 " + cc.getChargeStartTime(2));
        System.out.println("7 " + cc.getChargeStartTime(7));
        System.out.println("30 " + cc.getChargeStartTime(30));


    }
    public CarCharger(int[] table){
        rateTable = table;
    }

    /** Determines the total cost to charge the car starting at
     * the beginning of startHour.
     * @param startHour  the hour when charging begining
     *                   Precondition: 0 <= startHour <= 23
     * @param numHours  the number of hours of needed charge.
     *                  Precondition: chargeTime > 0
     * @return      the total cost to charge the car.
     */
    public int getChargingCost(int startHour, int numHours){
        int a=0;
        for(int i=0; i<numHours; i++){
            if(startHour==23){
                a+=rateTable[startHour];
                startHour=0;
            }
            else{
                a+= rateTable[startHour];
                startHour++;
            }

        }
        return a;		// replace this
    }

    /** Determines the start time to charge the car at the
     * lowest cost for the given charge time.
     * @param hours  the number of hours needed to charge the car.
     *               Precondition:  hours > 0
     * @return an optimal start time with 0 <= returned value <= 23
     */
    public int getChargeStartTime(int hours){
        int a=getChargingCost(0,hours);
        int b=0;
        for(int c=0;c<23;c++){
            if(a>getChargingCost(c,hours)){
                a=getChargingCost(c,hours);
                b=c;
            }
        }
        return b;
       
    }


}