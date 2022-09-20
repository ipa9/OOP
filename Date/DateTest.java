public class DateTest {
    public static void main(String[] args){
        Date newDate = new Date(9, 15, 2022);
        newDate.setMonth(10);
        newDate.displayDate();

        try{
            Date myDate = null;
            myDate.setMonth(11);
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
