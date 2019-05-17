package hw;

import java.util.ArrayList;

class MDP {
    private ArrayList<MDP> children;
    private String state1;
    private String state2;
    private int value;

    MDP(String state1, String state2, int value) {
        this.state1 = state1;
        this.state2 = state2;
        this.value = value;
    }
}
