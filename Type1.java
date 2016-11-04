
/**
 *
 * @author Pawel
 */
public class Type1 extends Box {
    
    private int Color = 0;
    
    public Type1(int width, int length, int height, int grade, int qty, String sealTop) {
        super(width, length, height, grade, qty, sealTop);
    }
    @Override
    public void cost() {
        if(grade == 1) {
            cost = super.boxArea * 0.50 * qty;                          // 76 * 0.5 = 38
            System.out.println("Box cost: " + cost);
        }
        /*
        else if(grade == 2) {
            cost = boxArea * 0.60;
            System.out.println("Box cost: " + cost);
        }
        else if(grade == 3) {
            cost = boxArea * 0.72;
            System.out.println("Box cost: " + cost);
        }
        */
       // return cost;
    }
    
}
