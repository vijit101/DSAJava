package OopsConcept;

public class ComplexNumbers {
    public int realNum;
    public int imaginaryNum;

    ComplexNumbers(int real, int img) {
        this.realNum = real;
        this.imaginaryNum = img;
    }

    ComplexNumbers() {

    }

    ComplexNumbers(int real) {
        this.realNum = real;
        this.imaginaryNum = 0;
    }

    public void print() {
        System.out.print(realNum + " + " + "i"+imaginaryNum);
    }

    public void plus(ComplexNumbers CN2) {
        // ComplexNum newNum = new ComplexNum();
        this.realNum = this.realNum + CN2.realNum;
        this.imaginaryNum = this.imaginaryNum + CN2.imaginaryNum;
        // return this;
    }

    public void multiply(ComplexNumbers CN2) { 
        int real = (this.realNum*CN2.realNum) + (-1)*this.imaginaryNum*CN2.imaginaryNum; 
        this.imaginaryNum = (this.realNum * CN2.imaginaryNum) + (this.imaginaryNum*CN2.realNum);
        this.realNum = real;
        // return this;
    }
}
