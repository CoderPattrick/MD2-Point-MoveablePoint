public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public float[] getXY() {
        float[] arr = new float[2];
        arr[0]=getX();
        arr[1]=getY();
        return arr;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float x,float y) {
        setX(x);
        setY(y);
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
