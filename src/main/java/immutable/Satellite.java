package immutable;

public class Satellite {

    private CelestialCoordinates celestialCoordinates;
    private String regId;

    public Satellite(CelestialCoordinates celestialCoordinates, String regId) {
        if (regId.isEmpty()){
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.celestialCoordinates = celestialCoordinates;
        this.regId = regId;
    }

    public CelestialCoordinates getCelestialCoordinates() {
        return celestialCoordinates;
    }

    public String getRegId() {
        return regId;
    }

    public void modifyDestination(CelestialCoordinates diff){
        int x = celestialCoordinates.getX() + diff.getX();
        int y = celestialCoordinates.getY() + diff.getY();
        int z = celestialCoordinates.getZ() + diff.getZ();
        this.celestialCoordinates = new CelestialCoordinates(x, y, z);
    }

    @Override
    public String toString() {
        return regId + ": " + celestialCoordinates.toString();
    }

    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }
}
