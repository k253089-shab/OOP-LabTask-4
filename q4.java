import java.util.Scanner;

class Holiday{
    private String name;
    private int day;
    private String month;

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
    
    public Holiday(String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public boolean inSameMonth(Holiday otherHoliday){
        return this.month.equalsIgnoreCase(otherHoliday.month);
    }
}

public class Main
{
	public static void main(String[] args) {
		Holiday independenceDay = new Holiday("Independence Day", 14, "August");

        Holiday defenseDay = new Holiday("Defense Day", 6, "September");
        Holiday summerBankHoliday = new Holiday("Bank Holiday", 25, "August");

        System.out.println("Holiday: " + independenceDay.getName() + " on " + independenceDay.getDay() + " " + independenceDay.getMonth());
        
        System.out.println("Is Independence Day in the same month as Defense Day? " 
                            + independenceDay.inSameMonth(defenseDay));
                            
        System.out.println("Is Independence Day in the same month as Bank Holiday? " 
                            + independenceDay.inSameMonth(summerBankHoliday));
	}
}
