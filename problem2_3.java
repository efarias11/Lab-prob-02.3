import java.util.Scanner;
public class problem2_3 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String[] dayOfWeekArr = {"Monday", "Tuesday", "Wednesday", 
                                 "Thursday", "Friday", "Saturday", "Sunday"}; // storing the days of the week in an array to later call
        Day d = new Day();

        System.out.print("Enter what today is (Day, Date): "); // ask user day of week and date of said day
        String today = kb.nextLine();

        String[] dateArry = today.split(" "); // splits/splices both strings 
        today = dateArry[0];
        today = today.substring(0,1).toUpperCase()+today.substring(1).toLowerCase(); // lowers user error by calling the case sensitive strings
        //System.out.println("Today is "+today);

        int index = -1; 
        for(int i = 0; i<dayOfWeekArr.length; i++){ // goes through the string array to assign an "index value" to the day user set
            if(dayOfWeekArr[i].equals(today)){
                index = i;
                //System.out.println("Index value of the current day is: "+index);
            }
        }

        int currentDate = Integer.parseInt(dateArry[1]);
        
        d.setDay(today);
        d.setDate(currentDate);
        System.out.println("Today's date is "+d.getDay()+" the "+d.getDate());

        d.nextDay(index, dayOfWeekArr, currentDate);
        d.previousDay(index, dayOfWeekArr, currentDate);
        d.daysAdded(index, dayOfWeekArr, currentDate);
    }
}
class Day{
    private String currDay;
    private int currDate;
    
    public void setDay(String currentDay){
        this.currDay = currentDay;
     }
     public String getDay(){
        return this.currDay;
     }
     public void setDate(int currentDate){
        this.currDate = currentDate;
     }
     public int getDate(){
        return this.currDate;
     }
     public void nextDay(int index, String[] dayOfWeekArr, int currentDate){
        if(index+1>6){  // prevents out of bounds error 
            System.out.println("Tomorrow is "+dayOfWeekArr[0]+" the "+(currentDate+1)); // if sunday is set day, call monday from the array and add 1 to current date
        }else{
            System.out.println("Tomorrow is "+ dayOfWeekArr[index+1]+" the "+(currentDate+1));
        }
     }
     public void previousDay(int index, String[] dayOfWeekArr, int currentDate){
        if(index-1<0){ // prevents out of bounds error 
            System.out.println("Yesterday was "+ dayOfWeekArr[6]+" the "+(currentDate-1)); // if monday is set day, call sunday from the array and subtract 1 to current date
        }else{
            System.out.println("Yesterday was "+ dayOfWeekArr[index-1]+" the "+(currentDate-1));
        }
     }
     public void daysAdded(int index, String[] dayOfWeekArr, int currentDate){
        Scanner kb = new Scanner(System.in);
        System.out.print("\nHow many days forward do you want to go from today?: ");
        int f_date = kb.nextInt(); // ask how many days user wants to go forward
        
        int modDate = 0; 
        if(f_date<=7){
            modDate = f_date%7; // simple module math to call a string by its index position 
            System.out.println("In "+f_date+" days it will be "+dayOfWeekArr[modDate]+" the "+(currentDate+f_date));
        }else{
            modDate = ((f_date+index)+7)%7; // adding the desired future date and index of the current day and balance it out by adding 7 to then take the module of it
            System.out.println("In "+f_date+" days it will be "+dayOfWeekArr[modDate]+" the "+(currentDate+f_date));
        }
     }
}
