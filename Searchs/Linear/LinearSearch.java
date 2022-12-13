package br.unicap.p2.atividade05;

public class LinearSearch {

    private int steps = 1;
    private int count = 0;
    private int[] list;
    
    public LinearSearch(int[] values) {
        list = values;
    }

    public int find(int key) {
        
        while(steps < this.list.length) {
            if(key == this.list[count]) {
                return count;
            }
            count++;
            steps++;
        }
        return -1;
    }

    public int getSteps() {
        return steps;
    }
}
