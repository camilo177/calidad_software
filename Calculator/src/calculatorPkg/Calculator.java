package calculatorPkg;

public class Calculator {
    private float numA;
    private float numB;
    private float multiplication;
    private float division;
    private float addition;
    private float subtraction;
    //Constructor
    public Calculator(float numA, float numB) {
        this.numA = numA;
        this.numB = numB;
    }
    //Methods

    public float getNumA() {
        return numA;
    }

    public float getNumB() {
        return numB;
    }

    public float getMultiplication() {
        multiplication=this.numA*this.numB;
        return multiplication;
    }

    public float getDivision() {
        division=this.numA/this.numB;
        return division;
    }

    public float getAddition() {
        addition = this.numA+this.numB;
        return addition;
    }

    public float getSubtraction() {
        subtraction = this.numA - this.numB;
        return subtraction;
    }

}
