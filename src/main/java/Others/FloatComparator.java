package Others;
public class FloatComparator {

    public static void main(String args[]){
        float firstValue = 10.2f;
        float secondValue = 10.3f;
        double thirdValue = 10.2d;

        if(firstValue == thirdValue){
            System.out.print("First Value and second value are not equal");
        }
        System.out.print(Float.parseFloat(String.valueOf(firstValue)) + " " + thirdValue);

    }
}