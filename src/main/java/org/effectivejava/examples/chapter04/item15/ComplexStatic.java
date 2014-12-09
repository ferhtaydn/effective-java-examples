public class Complex {
	
	private final double re;
	private final double im;

	private Complex(double re, double im) { 
		this.re = re;
        this.im = im;
	}
	
    public static Complex valueOf(double re, double im) { 
	       
	    return new Complex(re, im);
		      
    }		

         
    public static Complex valueOfPolar(double r, double theta) {

    	return new Complex(r * Math.cos(theta), r * Math.sin(theta));
    }

    // remain unchanged

}
