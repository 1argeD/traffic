public class taxi extends Transportation implements StartDrive, checkOut, addPassenger, checkOil, changeSpeed{

    public taxi(int number, int oil, int speed, int passenger, String state) {
        super(number, oil, speed, passenger, state);

    int distance;
    int
    }

    @Override
    public void Drive(String state) {
        System.out.print("운행중");
        this.state = state;
        if(oil==5) {
            System.out.print("주유 필요");
        }
        }

    @Override
    public void add(int addPassenger) {
        passenger += addPassenger;
        int p = 4-passenger;
        System.out.print(p);
        if(p==0) {
            System.out.print('최대 승객 수 초과');
        }

    }

    @Override
    public void change(int speed) {

    }

    @Override
    public void check(int addOil) {
        oil = 100;
        oil+=addOil;
        System.out.print(oil);
        if (oil == 0) {
            System.out.print("주유 필요");
        }

    }

    @Override
    public void pay(int pay) {

    }
}
}
