public class Player {

    private int cnt;
    private int position_x;
    private int position_y;
    private int lap_num;

    public Player( int cnt, int position_y, int position_x, int lap_num) {
        this.cnt = cnt;
        this.position_y = position_y;
        this.position_x = position_x;
        this.lap_num = lap_num;
    }

    public void roll(){

    }

    public int getCnt() {
        return this.cnt;
    }

    public void setCnt(int cnt ) {
        this.cnt = cnt;
    }

    public int getPosition_x() {return this.position_x;}

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return this.position_y;
    }

    public void setPosition_y(int position_y ) {
        this.position_y = position_y;
    }

    public int getLap_num() {
        return this.lap_num;
    }

    public void setLap_num(int lap_num) {
        this.lap_num = lap_num;
    }

}
