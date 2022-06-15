package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        String num = ""+number;
        for(int i = 0; i<num.length();i++){
            sum+= Integer.parseInt(Character.toString(num.charAt(i)));
        }
        System.out.println(sum);
    }
}
