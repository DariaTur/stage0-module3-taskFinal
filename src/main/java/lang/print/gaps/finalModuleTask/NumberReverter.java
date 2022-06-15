package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String res = "";
        String num = ""+number;
        for(int i = num.length()-1; i>=0;i--){
            res+= Character.toString(num.charAt(i));
        }
        System.out.println(Integer.parseInt(res));
    }

}
