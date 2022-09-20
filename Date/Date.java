public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }
    public Date(String m, int d, int y){
        month = Integer.valueOf(m);
        day = d;
        year = y;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + " / " + day + " / " + year);
    }
}
