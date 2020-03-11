package com.company;

public class Calculations {


    public static Point2D positionGeometricCenter(Point2D[ ] points){
        double temp_x = 0;
        double temp_y = 0;

        for(Point2D point2D: points){
            temp_x += point2D.x;
            temp_y += point2D.y;
        }

        temp_x = temp_x / points.length;
        temp_y = temp_y / points.length;

        return new Point2D(temp_x, temp_y);

    }


    public static Point2D positionCenterOfMass(MaterialPoint2D[ ] materialPoint){
        double temp_x=0;
        double temp_y=0;
        double temp_mass=0;

        for(MaterialPoint2D materialPoint2D: materialPoint){
            temp_x += materialPoint2D.x;
            temp_y += materialPoint2D.y;
            temp_mass += materialPoint2D.;
        }

        return new Point2D();

    }


}
