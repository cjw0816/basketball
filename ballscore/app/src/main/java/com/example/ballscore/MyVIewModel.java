package com.example.ballscore;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyVIewModel extends ViewModel {
    private MutableLiveData<Integer> aTeamScore;
    private MutableLiveData<Integer> bTeamScore;
    private int aBack,bBack;

    public MutableLiveData<Integer> get_aTeamScore(){
        if (aTeamScore == null){
            aTeamScore = new MutableLiveData<>();
            aTeamScore.setValue(0);
        };
        return aTeamScore;
    }
    public MutableLiveData<Integer> get_bTeamScore(){
        if (bTeamScore == null){
            bTeamScore = new MutableLiveData<>();
            bTeamScore.setValue(0);
        };
        return bTeamScore;
    }

    public void add_a(int score){
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        aTeamScore.setValue(aTeamScore.getValue()+score);
    }
    public void add_b(int score){
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        bTeamScore.setValue(bTeamScore.getValue()+score);
    }
    public void reset(){
        aBack = aTeamScore.getValue();
        bBack = bTeamScore.getValue();
        aTeamScore.setValue(0);
        bTeamScore.setValue(0);
    }
    public void undo(){
        aTeamScore.setValue(aBack);
        bTeamScore.setValue(bBack);
    }
}
