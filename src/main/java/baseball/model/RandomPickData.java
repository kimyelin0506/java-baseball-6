package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomPickData {
    static private List<String> randomList = new ArrayList<>();

    public RandomPickData(){
        for(int i=0; i<3; i++){
            this.randomList.add(randomPick());
        }
    }

    private String randomPick(){
        while(true){
            int random = Randoms.pickNumberInRange(1,9);
            if(!randomList.contains(random)){
                return String.valueOf(random);
            }
        }
    }

    public List<String> getRandomList(){
        return randomList;
    }
}
