package OopsConcept;

public class Polynomial {

    public static void main(String[] args) {
        Polynomial poly = new Polynomial(5);
       
        poly.setCoeff(1, 20);
        poly.setCoeff(4, 30);

        Polynomial poly2 = new Polynomial(8);
        poly2.setCoeff(0, 30);
        poly2.setCoeff(1, 100);
        //poly2.setCoeff(1, 40);
        //System.out.print("incode");
        System.out.print("\n poly1 : ");
        poly.print();
        System.out.print("\n poly2 : ");
        poly2.print();
        System.out.print("\n addition : ");
        poly2.add(poly).print();
        System.out.print("\n Subtraction : p2-p1 : ");
        poly2.subtract(poly).print();
        //poly.print();
        System.out.print("\n Multiply \n");
        poly.multiply(poly2).print();
    }

    private int degreeOfPoly = 0;
    int arr[];
    // other format 
   

    Polynomial(int degreePoly) {
        this.degreeOfPoly = degreePoly;
        arr = new int[degreeOfPoly];
    }

    public Polynomial() {
        this.degreeOfPoly = 100;
        arr = new int[degreeOfPoly];
    }

    public void setCoeff(int[] degrees,int[] coeff){
        this.degreeOfPoly = degrees.length;
        arr = new int[degreeOfPoly];
        for(int i=0;i<degrees.length;i++){
            setCoeff(i, coeff[i]);
        }
    }
    
    public void setCoeff(int degree,int coeff){
        if(degree > degreeOfPoly-1){
            System.err.print("Wrong Polynomial Degree Added");
        }
        this.arr[degree] = coeff;
    }

    
    public int getCoeff(int degree){
        if(degree > degreeOfPoly-1){
            System.err.print("Wrong Polynomial Degree Queried");
        }
        return this.arr[degree];
    }

    public int GetPolyDegree(){
        return this.degreeOfPoly;
    }

    public Polynomial add(Polynomial p2){

        Polynomial newPoly = new Polynomial(this.arr.length>p2.arr.length?this.arr.length:p2.arr.length);
        int i=0;
        int j=0;
        
        while(i<this.arr.length && j<p2.arr.length){
            newPoly.arr[i] = this.arr[i] + p2.arr[j];
            i++;
            j++;
        }

        while (i<this.arr.length) { 
            newPoly.arr[i] = this.arr[i];
            i++;
        }

        while(j<p2.arr.length){
            newPoly.arr[j] = p2.arr[j];
            j++;
        }
        return newPoly;
    }

    public Polynomial subtract(Polynomial p2){

        Polynomial newPoly = new Polynomial(this.arr.length>p2.arr.length?this.arr.length:p2.arr.length);
        int i=0;
        int j=0;
        
        while(i<this.arr.length && j<p2.arr.length){
            newPoly.arr[i] = this.arr[i] - p2.arr[j];
            i++;
            j++;
        }

        while (i<this.arr.length) { 
            newPoly.arr[i] = this.arr[i];
            i++;
        }

        while(j<p2.arr.length){
            newPoly.arr[j] = -p2.arr[j];
            j++;
        }
        return newPoly;
    }

   
    public Polynomial multiply(Polynomial p2){

        Polynomial newPoly = new Polynomial(p2.GetPolyDegree()+this.GetPolyDegree());
        Polynomial prevPolynomial = new Polynomial(newPoly.GetPolyDegree());

        for(int i = 0;i<this.arr.length;i++){
            if(this.arr[i]==0){
                continue;
            }
            for(int j = 0;j<p2.arr.length;j++){
                if(p2.arr[j] == 0){
                    continue;// if coeff is 0 then no need to multiply
                }
                prevPolynomial.arr[i+j] = this.arr[i]*p2.arr[j];
                
            }
            newPoly = newPoly.add(prevPolynomial);
            for(int k=0;k<prevPolynomial.arr.length;k++){
                prevPolynomial.arr[k] = 0; // need to reset it as it first calculates (a+b)(d+c) [(ad) + (ac)] -> save in new poly then added to bd + bc but if i dont clean then we add ad+ac twice  
            }
        }
        return newPoly;
    }


    public void print(){
        for(int i=this.arr.length-1;i>=0;i--){
            if(this.arr[i] == 0){
                continue;
            }
            if(i == 0){
                System.out.print(this.arr[i] +" ");   
            }
            else{
                System.out.print(this.arr[i] +"x"+i +" ");  
            }
        }
        
    }
}
