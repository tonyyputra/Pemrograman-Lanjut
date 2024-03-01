package projectClass;

public class clsRobot {
    public clsRobotCircle robotHead        = new clsRobotCircle();
    public clsRobotTriangle robotBody      = new clsRobotTriangle();
    public clsRobotRectangle robotRightArm = new clsRobotRectangle();
    public clsRobotRectangle robotLeftArm  = new clsRobotRectangle();
    public clsRobotRectangle robotHip      = new clsRobotRectangle();
    public clsRobotRectangle robotRightLeg = new clsRobotRectangle();
    public clsRobotRectangle robotLeftLeg  = new clsRobotRectangle();

    public double getRobotArea(){
        return robotHead.getArea() + robotBody.getArea() + robotRightArm.getArea() + robotLeftArm.getArea() + robotHip.getArea() + robotRightLeg.getArea() + robotLeftLeg.getArea();
    }

    public double getRobotPerimeter(){
        return robotHead.getPerimeter() + robotBody.getPerimeter() + robotRightArm.getPerimeter() + robotLeftArm.getPerimeter() + robotHip.getPerimeter() + robotRightLeg.getPerimeter() + robotLeftLeg.getPerimeter();
    }
}
