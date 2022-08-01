import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){}


    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }
    public void move(){
        float xs = super.getX()+this.xSpeed;
        float ys = super.getY()+this.ySpeed;
        this.setSpeed(xs,ys);
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed + "x= "+ super.getX() +
                ", ySpeed=" + ySpeed + "y= "+super.getY()+ "speed= "+ Arrays.toString(this.getSpeed())+

                '}';
    }
}