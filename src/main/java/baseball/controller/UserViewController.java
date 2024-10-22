package baseball.controller;

import baseball.model.UserInputData;

import static baseball.view.UserViewResponse.START_GAME_MESSAGE;

public class UserViewController {
    UserInputData userInputData;
    //(1) view의 상태를 application에 전달
    public void start(){
        START_GAME_MESSAGE();
    }
    //(2) 사용자의 입력값을 모델에 저장
    public void userInput(String str){
        userInputData = new UserInputData();
        userInputData.setStr(str);
    }
}
