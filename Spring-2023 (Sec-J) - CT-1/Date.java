public class Date{
    int year;
    int month;
    int day;

    Date( int year, int month, int day ){
       this.year=year;
       this.month=month;
       this.day=day;
    }

    int nextYear(){
        return year + 1;
    }

    int prevYear(){
        return year - 1;
    }

    int nextMonth(){
        return month + 1;
    }

    int prevMonth(){
        return month - 1;
    }

    int nextDay(){
        return day - 1;
    }

    int prevDay(){
        return day - 1;
    }

    boolean isSmaller(Date date){
        if(date.year==year && date.month==month && date.day==day){
            return true;
        }
        else{
           return false;
        }
    }
}