package exceptions.polinom;

public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        ArrayIsNullException(coefficients);
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientsString) {
        ArrayIsNullException(coefficientsString);
        try{
            this.coefficients = stringToDouble(coefficientsString);
        } catch (NumberFormatException ex){
            throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
        }
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double evaluate(double x){
        double sum = 0;
        for (int i = 0; i < coefficients.length; i++){
            sum += coefficients[i] * Math.pow(x,(double)coefficients.length - (i + 1));
        }
        return sum;
    }

    private double[] stringToDouble(String[] coefficientsString){
        double[] coefficients = new double[coefficientsString.length];
        for (int i = 0; i < coefficientsString.length; i++) {
            coefficients[i] = Double.parseDouble(coefficientsString[i]);
        }
        return coefficients;
    }



    private void ArrayIsNullException(double[] checkThis) {
        if (checkThis == null) {
            throw new NullPointerException("coefficients is null");
        }
    }

    private void ArrayIsNullException(String[] checkThis) {
        if (checkThis == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
    }
}
