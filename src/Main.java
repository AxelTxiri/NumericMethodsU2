public class Main {
    public static void main(String[] args) {
        Function f1n2 = new Function() {
            @Override
            public double evaluate(double x) {
                return Math.exp(2 * x) - 3;
            }
        };
        Function f3 = new Function() {
            @Override
            public double evaluate(double x) {
                return Math.exp(x) - (4*x);
            }
        };
        Function g = new Function() {
            @Override
            public double evaluate(double x) {
                return Math.exp(x)*((double) 1 /4);
            }
        };
        Function f4n5 = new Function() {
            @Override
            public double evaluate(double x) {
                return Math.pow(x,2)-7;
            }
        };
        Function derivative = new Function() {
            @Override
            public double evaluate(double x) {
                return x*2;
            }
        };
        Function f6 = new Function() {
            @Override
            public double evaluate(double x) {
                return Math.pow(x,3) - (Math.pow(x,2) * 5) + (x * 7) - 3;
            }
        };
        Function derivativeF6 = new Function() {
            @Override
            public double evaluate(double x) {
                return (Math.pow(x,2) * 3) - (x * 10) + 7;
            }
        };
        Function derivativeDF6 = new Function() {
            @Override
            public double evaluate(double x) {
                return (x * 6) - 10;
            }
        };


//        FalsePosition method1 = new FalsePosition();
//        double root = method1.root(f1n2,0,1,25,5e-3);
//        System.out.println("Root: "+root);

//        Bisection method2 = new Bisection();
//        double root = method2.root(f1n2,0,1,20,5e-3);
//        System.out.println("Root: "+root);

//        FixedPoint method3 = new FixedPoint();
//        double root = method3.root(f3,g,0,25,5e-3);
//        System.out.println("Root: "+root);

//        NewtonRaphson method4 = new NewtonRaphson();
//        double root = method4.root(f4,derivative,1,25,5e-3);
//        System.out.println("Root: "+root);

//        Secant method5 = new Secant();
//        double root = method5.root(f4n5,0,1,25,5e-3);
//        System.out.println("Root: "+root);

//        NewtonRaphsonModified method6 = new NewtonRaphsonModified();
//        double root = method6.root(f6,derivativeF6,derivativeDF6,0,25,5e-3);
//        System.out.println("Root: "+root);
    }
}
