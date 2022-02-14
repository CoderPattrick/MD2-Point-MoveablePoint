public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public float[] getSpeed() {
        float arr[]=new float[2];
        arr[0]=getxSpeed();
        arr[1]=getySpeed();
        return arr;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed + super.toString()+
                '}';
    }
    public MovablePoint move(){
        setXY(getX()+xSpeed,getY()+ySpeed);
        return this;
    }
}
