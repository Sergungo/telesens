package ua.sgolenko.telesens.tasks7;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;


enum Months {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(31),
    JULY(30), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    int days;

    Months(int days) {
        this.days = days;
    }


    @Override
    public String toString() {
        return "Months{ " + this.name() + " days=" + days + " season=" + this.getSeason() + " " +

                '}';
    }

    static void transalate(Months a) {
        Month temp = Month.valueOf(a.name());
        System.out.println(temp.getDisplayName(TextStyle.FULL.asStandalone(), new Locale("uk", "UA")));
        System.out.println(temp.getDisplayName(TextStyle.FULL.asStandalone(), new Locale("ru", "RU")));

    }

    public Months getPreviousMonth(Months a) {
        System.out.println("Previous month was: ");
        Month temp = Month.valueOf(a.name());
        temp = temp.minus(1);
        return a.values()[temp.ordinal()];

    }

    public Months getNextMonth(Months a) {
        System.out.println("Next month will be: ");
        Month temp = Month.valueOf(a.name());
        temp = temp.plus(1);
//        System.out.println(temp.ordinal());
        return a.values()[temp.ordinal()];

    }

    public String getSeason() {


        switch (this) {

            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                return "Winter";
            case MARCH:
            case APRIL:
            case MAY:
                return "Spring";
            case JUNE:
            case JULY:
            case AUGUST:
                return "Summer";
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return "Autumn";
            default:
                return "not month";
        }

    }
}

public class Enum_month {


    public static void main(String[] args) {

        Months temp = Months.MARCH;

        System.out.println("Current month is: ");

        temp.transalate(temp);

        temp.toString();

        temp.transalate(temp.getPreviousMonth(temp));

        temp.transalate(temp.getNextMonth(temp));

        System.out.println();
        System.out.println(temp.getSeason());
        System.out.println();

        for (int i = 0; i < Months.values().length; i++) {
            System.out.println(Months.values()[i].toString());
        }


    }

}