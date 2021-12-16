public class Main {
    static class Number {
        int minimum;
        int maximum;
    }
    static Number printMinMax(int[] array, int cnt) {
        Number digit = new Number();
        if(cnt == 1) {
            digit.maximum = array[0];
            digit.minimum = array[0];
            return digit;
        }
        if(array[0] > array[1]){
            digit.maximum = array[0];
            digit.minimum = array[1];
        }
        else{
            digit.maximum = array[1];
            digit.minimum = array[0];
        }
        for(int i = 2; i < cnt; ++i){
            if(array[i] > digit.maximum) {
                digit.maximum = array[i];
            }
            else if(array[i] < digit.minimum){
                digit.minimum = array[i];
            }
        }
        return digit;
    }

    public static void main(String[] args){
        int[] array = {1000, 11, 44555, 1, 330, 3000};
        int cnt = 6;
        Number digit = printMinMax(array, cnt);
        System.out.printf("\nMinimum Number is %d", digit.minimum);
        System.out.printf("\nMaximum Number is %d", digit.maximum);
    }
}
