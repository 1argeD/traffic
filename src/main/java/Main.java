
public class Main {
    public static void main(String[] args) {
        Transportation bus = new Transportation();
        Transportation taxi = new Transportation();


        Transportation[] Transportations = {taxi, bus};
        for(Transportation transportation : Transportations){
            for (Transportation transportation : Transportations){
                if (Transportation instanceof StartDrive) {
                    ((StartDrive) Transportation).Drive();
                }
                if (Transportations instanceof checkOil) {
                    ((checkOil) Transportation).check();
                }
                if (Transportations instanceof addPassenger) {
                    ((addPassenger) Transportation).add(2);
                }
                if (Transportations instanceof checkOut) {
                    ((checkOut) Transportation).pay();
                }
            }

        }
    }
}