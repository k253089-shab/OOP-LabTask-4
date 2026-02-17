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

    public Holiday(Holiday other) {
        this.name = other.name;
        this.day = other.day;
        this.month = other.month;
    }

    public boolean inSameMonth(Holiday otherHoliday){
        return this.month.equalsIgnoreCase(otherHoliday.month);
    }

    public void display() {
        System.out.println(name + " | " + day + " " + month);
    }
}

public class Main
{
	public static void main(String[] args) {
		Holiday original = new Holiday("Independence Day", 14, "August");
        
        Holiday copy = new Holiday(original);

        System.out.println("Original Object:");
        original.display();

        System.out.println("\nCopied Object:");
        copy.display();

        System.out.println("\nAre they the same month? " + original.inSameMonth(copy));
	}
}
