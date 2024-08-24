package collections.enums;

public enum Days {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int nummer;

    Days(int nummer){
        this.nummer = nummer;
    }

    public int getNummer(){
        return nummer;
    }


}
