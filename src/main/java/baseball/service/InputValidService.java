package baseball.service;

public class InputValidService {
    boolean endGame = false;
    //올바른 입력값이 들어왔는지 확인
    public boolean isInputValid(String str){
        //게임이 안끝났을 경우
        if(!endGame){
            for(int i=0; i<str.length(); i++){
                int target = Integer.parseInt(String.valueOf(str.charAt(i)));
                if(target <=0 || target >9){
                    return false;
                }
                return true;
            }
        }
        if(Integer.parseInt(str) == 1 || Integer.parseInt(str) == 2){
            return true;
        }
        return false;
    }

    public boolean isEndGame(){
        return endGame;
    }

    public void updateStatus(){
        this.endGame = !endGame;
    }

    public boolean continueOrEndGame(String ctn){
        int answer = Integer.parseInt(ctn);
        switch(answer){
            case 1:
                updateStatus();
                return true;
            case 2:
                return false;
        }
        return false;
    }
}
