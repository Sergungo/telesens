package ua.sgolenko.telesens.tasks7;


import java.text.DateFormatSymbols;

enum Month {
    January, February, March, April, May, June, July, August, September, October, November, Decemder;


    String getMonthForInt(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num > 0 && num <= 11 ) {
            month = months[num-1];
        }
        return month;
    }

    public void getPreviousMonth(Month a) {
        if (a.ordinal() > 0)
            System.out.println(a.values()[a.ordinal() - 1]);
        else
            System.out.println(a.values()[Month.values().length - 1]);

    }

    public void getNextMonth(Month a) {
        if (a.ordinal() < Month.values().length - 1)
            System.out.println(a.values()[a.ordinal() + 1]);
        else
            System.out.println(a.values()[0]);

    }

    public void getSeason(Month a) {
        switch (a) {
            case January:
                System.out.println("Winter");
                break;
            case February:
                System.out.println("Winter");
                break;
            case March:
                System.out.println("Spring");
                break;
            case April:
                System.out.println("Spring");
                break;
            case May:
                System.out.println("Spring");
                break;
            case June:
                System.out.println("Summer");
                break;
            case July:
                System.out.println("Summer");
                break;
            case August:
                System.out.println("Summer");
                break;
            case September:
                System.out.println("Autumn");
                break;
            case October:
                System.out.println("Autumn");
                break;
            case November:
                System.out.println("Autumn");
                break;
            case Decemder:
                System.out.println("Winter");
                break;

        }
    }
}

public class Enum_month {

    public static void main(String[] args) {



        Month temp;
        temp = Month.March;

        temp.getPreviousMonth(temp);

        temp.getNextMonth(temp);

        temp.getSeason(temp);

        System.out.println(temp.getMonthForInt(4));
    }

}


