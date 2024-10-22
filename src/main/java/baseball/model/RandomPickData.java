package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomPickData {
    private List<String> randomList = new ArrayList<>();

    public RandomPickData(){
        for(int i=0; i<3; i++){
            this.randomList.add(randomPick());
        }
    }

    private String randomPick(){
        return String.valueOf(Randoms.pickNumberInRange(1,9));
    }
    
    public List<String> getRandomList(){
        return randomList;
    }
}
