public class Transportation {
    int number;
    int oil;
    int speed;
    int passenger;
    String state;
    int pay;

    public Transportation(int number, int oil, int speed, int passenger, String state, int pay) {
        this.number = number;
        this.oil = oil;
        this.speed = speed;
        this.passenger = passenger;
        this.state = state;
        this.pay = pay;
    }

    public Transportation (int number, int oil, int speed, int passenger, String state, int pay) {
        this(number, oil, speed, passenger, state, pay);
    }

    public Transportation(int number, int oil, int speed, int passenger, String state, int pay) {
        this(number, oil, speed, passenger, state, pay);
    }


    public String getState () {
        return "("+state+")";
    }

    protected void printWhoAmI() {
        System.out.println(+number);
    }


}


