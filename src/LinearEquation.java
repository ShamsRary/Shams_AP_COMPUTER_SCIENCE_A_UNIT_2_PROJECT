public class LinearEquation{
        /* Instance Variables */
        private int x1;
        private int y1;
        private int x2;
        private int y2;


        /* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
   this precondition is not violated)
public LinearEquation(int x1, int y1, int x2, int y2)
 */
        public LinearEquation(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;

        }


/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
        public double distance(){
        //uses the pythagren therom to find distance.
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        //distance = ((int) (distance * 100 + 0.5)/100.0);
        distance = roundedToHundredth(distance);
        //distance = ((int) (distance * 100 + 0.5) / 100.0);
        return distance;
        }



        /* Calculates and returns the y-intercept of the line between (x1, y1) and
           (x2, y2), rounded to the nearest hundredth */
        public double yIntercept(){
            double y_intercept = ((double) y1) - ((slope() * (double) x1));
            // y = mx +b sloved for b
            //y_intercept = ((int)((y_intercept * 100 + 0.5)/100.0));
            y_intercept = roundedToHundredth(y_intercept);
            return y_intercept;
        }


        /* Calculates and returns the slope of the line between (x1, y1) and
           (x2, y2), rounded to the nearest hundredth */
        public double slope(){
            //slope formula
            double slope = ((double) y2 - (double) y1) / ((double) x2 - (double) x1);
            slope = roundedToHundredth(slope);
            //slope = roundedToHundredth(slope);
            //slope = ((int) (slope * 1000 + 0.5) / 1000.0);
            return slope;
        }




        /* Returns a String that represents the linear equation of the line through points
           (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".

            When generating the m value (slope), here are examples of "printable" slopes:
               5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7

            Here are non-examples of "printable" slopes:
         1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
               -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)

            HINT: Be sure to check if the line is horizontal and return an appropriate string,
            e.g. y = 6
            HINT: Absolute value might be helpful for ensuring proper placement of negative sign!


            When generating the b value, here are some examples of "printable" y-intercepts:
               + 1.0 	- 2.35	      + 12.5		- 8.0		+ 17.19

            Here are non-examples of "printable" y-intercepts:
               - -1.0 	+ -2.35	- -12.5	+ -8.0	     - -17.19	+ 0	- 0

            HINT: Absolute value might be helpful for printing negative y-intercepts as
                   subtraction!
         */
        public String equation() {
            double slope = slope();
            // is used to obtain a wide varity of slopes
            String slope1 = "";
            String equation1 = "";
            double y_intercept = yIntercept();

            //if horizontal function
            if (y1 == y2) {
                return("Horizontal line y = " + y1);
            }

                //checks to see if the number has decmials
                if (slope == (double) ((int) slope)) {
                    slope1 += Math.abs((int) slope);
                    //checks to see if the slope = 1 or -1
                    if (slope == -1 || slope == 1) {
                        slope1 = "";
                    }
                } else {
                    //regular slope
                    slope1 += Math.abs(((int) ((double) y2 - (double) y1))) + "/" + Math.abs((int) ((double) x2 - (double) x1));
                }
                    //postive or negative values for slope
                String symbol = "";
                if (slope < 0) {
                    symbol += "-";
                }
                // type of y value or no y value
                String symbol2 = "";
                if (y_intercept < 0) {
                    symbol2 += " - ";
                }
                if (y_intercept > 0) {
                    symbol2 += " + ";
                }
                if (y_intercept == 0){
                    symbol2 = "";
                    equation1 = ("These coordinates make an equation of: y = " + symbol + slope1 + "x");
                }
                else {
                    equation1 = ("These coordinates make an equation of: y = " + symbol + slope1 + "x" + symbol2 + Math.abs(y_intercept));
                }
                y_intercept = Math.abs(yIntercept());
            return equation1;
                    //("These coordinates make an equation of: y = " + symbol + slope1 + "x" + symbol2 + Math.abs(y_intercept));

            }





        /* Returns a String of the coordinate point on the line that has the given x value, with
           both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
        public String coordinateForX(double xValue){
            //uses slope and the new coed to find y value
            double slope = slope();
            double y_intercept = yIntercept();
            double yCord = slope * xValue + y_intercept;
            yCord = roundedToHundredth(yCord);
            xValue = roundedToHundredth(xValue);
            return("(" + xValue + ", " + yCord + ")");
        }



        /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
            to the nearest hundredth

            HINT:  the Math.round method can help with this!
         */
        public double roundedToHundredth(double toRound){
            //rounds to the hundreths
            double Round = (toRound * 100);
            Round = Math.round(Round);
            Round = Round / 100;
            //Round = ((int) (toRound * 100 + 0.5) / 100.0);
            return Round;
            }



        /* Returns a string that includes all information about the linear equation, each on
           separate lines:
             - The original points: (x1, y1) and (x2, y2)
             - The equation of the line in y = mx + b format (using equation() method)
             - The slope of the line, as a decimal (using slope() method)
             - The y-intercept of the line (using yIntercept() method)
             - The distance between the two points (using distance() method)

          This method should call all other appropriate methods to get the info it needs:
          equation(), slope(), yIntercept(), distance().

          */
        public String lineInfo(){

            //will print he following statments

//            System.out.println("The coordinates are " + "(" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")");
//            System.out.println(equation());
//            System.out.println("The slope of this line is: " + slope());
//            System.out.println("The yIntercept of this line is: " + yIntercept());
//            System.out.println("The distance of these 2 points are " + distance());
            String all = "The coordinates are " + "(" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")" + "\n" + equation() + "\n" + "The slope of this line is: " + slope()
                    + "\n" + "The yIntercept of this line is: " + yIntercept() + "\n" +"The distance of these 2 points are " + distance();

            return all;


        }
}
