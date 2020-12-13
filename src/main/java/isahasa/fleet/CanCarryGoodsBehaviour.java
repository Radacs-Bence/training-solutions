package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{

    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int left = 0;
        if (this.cargoWeight + cargoWeight <= maxCargoWeight){
            this.cargoWeight += cargoWeight;
        } else {
            left = (this.cargoWeight + cargoWeight) - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
        }
        return left;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }
}
