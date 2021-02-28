package labor2_3;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day){
        if (year < 1 || year > 2021 || month < 1 || month > 12 || day < 1 || day > 31) return false;
        else if (leapYear(year)){
            if (month == 2 && day < 30) return true;
        } else if (month < 8 && month % 2 == 1) return true;
        else if (month == 2 && day > 28) return false;
        else if (month < 8 && month % 2 == 0 && day < 31) return true;
        else if (month == 2 && day < 29) return true;
        else if (month == 8) return true;
        else if (month > 8 && month % 2 == 0) return true;
        else if (month > 8 && month % 2 == 1 && day < 31) return true;
        return false;
    }
}
