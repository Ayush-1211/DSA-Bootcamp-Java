import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));
    }
    static void dice(String processed, int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }
        for (int i=1; i<=6 && i<=target; i++){
            dice(processed + i, target - i);
        }
    }
    static ArrayList<String> diceRet(String processed, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i=1; i<=6 && i<=target; i++){
            list.addAll(diceRet(processed + i, target - i));
        }
        return list;
    }

    static void diceFace(String processed, int target, int face){
        if(target == 0){
            System.out.println(processed);
            return;
        }
        for (int i=1; i<=face && i<=target; i++){
            diceFace(processed + i, target - i, face);
        }
    }

    static ArrayList<String> diceFaceRet(String processed, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i=1; i<=face && i<=target; i++){
            list.addAll(diceFaceRet(processed + i, target - i, face));
        }
        return list;
    }
}
