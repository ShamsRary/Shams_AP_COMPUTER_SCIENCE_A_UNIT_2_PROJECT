public class LinearEquation {
    private int coordinate1x;
    private int coordinate1y;
    private int coordinate2x;
    private int coordinate2y;


    public LinearEquation(int coordinate1x, int coordinate1y, int coordinate2x, int coordinate2y){
        this.coordinate1x = coordinate1x;
        this.coordinate1y = coordinate1y;
        this.coordinate2x = coordinate2x;
        this.coordinate2y = coordinate2y;

    }

    public void lineInfo()
    {
        if (coordinate1x != coordinate2x) {
            System.out.println("The coordinates are " + "(" + coordinate1x + ", " + coordinate1y + ")" + " and " + "(" + coordinate2x + ", " + coordinate2y + ")");
            double slope = ((double) coordinate2y - (double) coordinate1y) / ((double) coordinate2x - (double) coordinate1x);
            double y_intercept = ((double) coordinate1y) - ((slope * (double) coordinate1x));
            double distance = Math.sqrt(Math.pow((coordinate2x - coordinate1x), 2) + Math.pow((coordinate2y - coordinate1y), 2));
            System.out.println("These coordinates make an equation of: y = " + slope + "x" + "+" + y_intercept);
            System.out.println("The slope is " + slope);
            System.out.println("The y_intercept is " + y_intercept);
            System.out.println("The distance of the 2 points is " + distance);
        }
        else{
            System.out.println("Vertical line x = " + coordinate1x);
        }

    }

    public void pointer(double xCord){
        if (coordinate1x != coordinate2x) {
            double slope = ((double) coordinate2y - (double) coordinate1y) / ((double) coordinate2x - (double) coordinate1x);
            double y_intercept = ((double) coordinate1y) - ((slope * (double) coordinate1x));
            double yCord = slope * xCord + y_intercept;
            System.out.println("(" + xCord + ", " + yCord + ")");
        }
        else{
            System.out.println("Vertical line-- point on line is still = " + coordinate1x);
        }
    }




}
