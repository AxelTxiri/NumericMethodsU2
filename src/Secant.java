public class Secant {
    public double root(Function function, double xi, double xi1, int n, double tolError) {
        double r = Double.NaN;
        int k = 0;
        double xi2 = 0;
        double error = Double.MAX_VALUE;

        System.out.printf("%-10s %-10s %-15s %-10s %-10s %-10s %-10s\n", "Iter", "xi", "xi1", "f'(xi)", "f'(xi1)", "xi2", "Error");

        while (error > tolError && k < n) {
            xi2 = xi1 - function.evaluate(xi1) * ( (xi1 - xi) / (function.evaluate(xi1) - function.evaluate(xi)) );

            if (k >= 0) {
                error = Math.abs((xi2 - xi1) / xi2) * 100;
                System.out.printf("%-10d %-10.6f %-15.8f %-10.6f %-10.6f %-10.6f %-10.6f\n", k, xi, xi1, function.evaluate(xi), function.evaluate(xi1), xi2, error);
            }

            xi = xi1;
            xi1 = xi2;

            k++;
        }

        if (k < n)
            r = xi;

        System.out.println();

        return r;
    }
}
