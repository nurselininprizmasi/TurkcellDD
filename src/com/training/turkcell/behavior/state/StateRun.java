package com.training.turkcell.behavior.state;

public class StateRun {
    public static void main(String[] args) {
        ICaseState iCaseState =new StateSession();
        iCaseState.print("nursen");
        iCaseState.upper();
        iCaseState.print("nursen");
        iCaseState.upper();
        iCaseState.print("nursen");
        iCaseState.lower();
        iCaseState.print("nursen");
        iCaseState.upper();
        iCaseState.print("nursen");
    }
}
