package Question.java;
public class EnumExample {

    enum Day {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        Day yesterday = Day.Thursday;
        Day today = Day.Friday;
        Day tomorrow = Day.Saturday;

        System.out.println("Today is " + today);
        System.out.println("Tomorrow will be " + tomorrow);
        System.out.println("Yesterday was " + yesterday);
    }
}