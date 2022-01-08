package Algorithm.Backtracking;

import java.util.ArrayList;

public class NQueenTest1 {
    // Promising
    public boolean isAvailable(ArrayList<Integer> candidate,
                               Integer currentCol) {
        Integer currentRow = candidate.size();
        for(int index = 0; index < currentRow; index++) {
            if((candidate.get(index) == currentCol) || (Math.abs(candidate.get(index) - currentCol) == currentRow - index)) {
                return false;
            }
        }
        return true;
    }

    public void dfsFunc(Integer N,
                        Integer currentRow,
                        ArrayList<Integer> currentCandidate) {
        if(currentRow == N) {
            System.out.println("결정된 퀸의 X좌표 위치(Y는 순서대로 1씩 증가) : \n" + currentCandidate);
            return;
        }

        for(int index = 0; index < N; index++) {
            if(this.isAvailable(currentCandidate, index) == true) {
                currentCandidate.add(index);
                this.dfsFunc(N, currentRow + 1, currentCandidate);
                currentCandidate.remove(currentCandidate.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        NQueenTest1 nqt = new NQueenTest1();
        nqt.dfsFunc(4, 0, new ArrayList<Integer>());
    }
}
