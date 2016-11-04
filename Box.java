
/**
 *
 * @author Pawel
 */
public class Box {     // ? maybe should be ... extends Type ?
    
    protected int grade;
    protected int color;
    protected int qty;
    
    protected String reinforcedBottom; //boolean
    protected String reinforcedCorners;
    protected String sealableTop;
    
    protected int width;
    protected int length;
    protected int height;
    
    protected int boxArea;
    protected double cost;
    // or protected int width, length, height;
    
    // ArrayList Linked ?
    public Box() {
        
    }
    
    public Box(int width, int length, int height, int grade, int qty, String sealableTop) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.qty = qty;
    }
    
    public Box(int width, int length, int height, int grade, int color, String reinBottom, String reinCorners, String sealTop) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    
    // access methods
    public int getWidth() {
        return width;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getHeight() {
        return height;
    }
    
    // update methods
    public void setWidth(int widthIn) {
        this.width = widthIn;
    }
    
    public void setLength(int lengthIn) {
        this.length = lengthIn;
    }
    
    public void setHeight(int heightIn) {
        this.height = heightIn;
    }
    
    public void totalBoxArea() {        // its for every type the same
        boxArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
        System.out.println("Box area: " + boxArea + " cm2.");
        System.out.println("Box area: " + (boxArea * 0.01) + " m2.");
    }
    
    public void cost() {
        /*
        if(grade == 1) {
            cost = boxArea;                          // 76 * 0.5 = 38
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 2) {
            cost = boxArea;
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 3) {
            cost = boxArea;
            System.out.println("Box cost: " + cost);
        }
        */
    }
    
    
    
}
