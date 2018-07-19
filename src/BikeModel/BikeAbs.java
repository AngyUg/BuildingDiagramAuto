package BikeModel;

public abstract class BikeAbs implements BikeInt {
    public int nomberOfWheels;
    public  int nomberOfTransfer;
    String typeOfBike;
    int NomberOfTransfer = 1;

    @Override
    public int toPedal() {
        return 0;
    }


    @Override
    public int switchTransfer(int nomberTransfer) {
        return nomberOfTransfer;
    }
}
