public class bus extends Transportation implements StartDrive, changeSpeed, addPassenger, checkOil,checkOut{
    public bus(int number, int oil, int speed, int passenger, String state) {
        super(number, oil, speed, passenger, state);
    }

    @Override
    public void Drive(String state) {
        printWhoAmI();
        System.out.print("운행중");
        this.state = state;
        if(oil<10) {
            System.out.print("차고지행");
        }
    }

    @Override
    public void add(int passenger) {
        passenger += passenger;
        int p = 30 - passenger;
        System.out.print("탑승객수"+passenger);
        System.out.print("잔여 승객 수"+p);
        if (passenger > 30) {
            System.out.print("최대 승객 수 초과");
        }

    }

    @Override
    public void change(int speed) {

    }

    @Override
    public void check(int addOil) {
        oil=100;
        oil+=addOil;
        System.out.print(oil);
    }

    @Override
    public void pay(int pay) {
        pay = 1000*passenger;
    }
}
