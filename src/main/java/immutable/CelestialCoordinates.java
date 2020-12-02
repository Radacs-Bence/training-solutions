package immutable;

public class CelestialCoordinates {

    private int x;
    private int y;
    private int z;

    public CelestialCoordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("CelestialCoordinates: x=%d, y=%d, z=%d", x, y, z);
    }
}
