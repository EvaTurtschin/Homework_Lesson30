package homework;

public enum DaysOfAWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
    private boolean dayOff;
    DaysOfAWeek (boolean dayOff){
        this.dayOff = dayOff;
    }
    boolean getDayOff (){
        return dayOff;    }
}
