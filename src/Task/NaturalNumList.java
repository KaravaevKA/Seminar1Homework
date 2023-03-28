package Task;

public class NaturalNumList {
    public static void getSimpleNumbers(){
        String rez = "";
        int count = 0;
        for(int i = 2; i <=1000; i++){
            for (int k = i -1; k>= 1; k--){
                if (i % k == 0 && k != 1){
                    break;
                } else if(i % k == 0 && k == 1){
                    rez+= " " + i;
                    count++;
                    if (count == 10){
                        System.out.println(rez);
                        rez = "";
                        count = 0;
                    }
                }
            }
        }
    }
}
