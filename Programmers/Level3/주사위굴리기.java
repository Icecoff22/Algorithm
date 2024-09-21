package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class kakao_internship_dice {

    static List<int[]> selectDiceList;
    static List<int[]> opposeSelectDiceList;
    static int[][] _dice;
    static int[] array;
    static int maxIndex = Integer.MIN_VALUE;
    static int winCount, maxWinCount;
    static int sum = 0, opposeSum = 0;

    public static void main(String[] args) {
        int[][] dice1 = {{1,2,3,4,5,6}, {3,3,3,3,4,4}, {1,3,3,4,4,4}, {1,1,4,4,5,5}};
        int[][] dice2 = {{1,2,3,4,5,6}, {2,2,4,4,6,6}};
        int[][] dice3 = {{40,41,42,43,44,45}, {43,43,42,42,41,41}, {1,1,80,80,80,80}, {70,70,1,1,70,70}};
        int[] res = solution(dice1);
        System.out.println(Arrays.toString(Arrays.stream(res).toArray()));
    }

    public static int[] solution(int[][] dice) {
        _dice = dice;
        List<Integer> diceList = new ArrayList<>();
        selectDiceList = new ArrayList<>();
        opposeSelectDiceList = new ArrayList<>();
        selectDice(0, 0, diceList);
        maxWinCount = 0;
        for (int i = 0; i < selectDiceList.size(); i++) {
            winCount = 0;
            array = makeArray();
            updateArray(0, 0, 0, i);
            int prevArrayValue = 0;
            int tmpValue = 0;
            for (int j = 1; j < array.length; j++) {
                tmpValue = array[j];
                array[j] = array[j-1] + prevArrayValue;
                prevArrayValue = tmpValue;
            }
            fight(0, 0, i);
            if (maxWinCount < winCount) {
                maxWinCount = winCount;
                maxIndex = i;
            }
        }
        int[] res = selectDiceList.get(maxIndex);
        res = Arrays.stream(res).map(e -> e + 1).toArray();
        return res;
    }

    public static void updateArray(int size, int index, int sum, int listIndex) {
        if (size == opposeSelectDiceList.get(0).length) {
            array[sum-1]++;
            return;
        }
        for (int i = 0; i < 6; i++) {
            int[] opposeSelectDiceArray = opposeSelectDiceList.get(listIndex);
            sum += _dice[opposeSelectDiceArray[index]][i];
            updateArray(size + 1, index + 1, sum, listIndex);
            sum -= _dice[opposeSelectDiceArray[index]][i];
        }
    }

    public static int[] makeArray() {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < _dice.length; i++) {
            list.add(Arrays.stream(_dice[i]).max().getAsInt());
        }
        list.sort(Comparator.reverseOrder());
        List<Integer> newList = list.subList(0, _dice.length / 2);
        for (int i = 0; i < newList.size(); i++) {
            sum += newList.get(i);
        }
        return new int[sum];
    }

    public static void fight(int size, int index, int listIndex) {
        if (size == selectDiceList.get(0).length) {
            winCount+= array[sum-1];
            return;
        }
        for (int i = 0; i < 6; i++) {
            int[] selectDiceArray = selectDiceList.get(listIndex);
            sum += _dice[selectDiceArray[index]][i];
            fight(size + 1, index + 1, listIndex);
            sum -= _dice[selectDiceArray[index]][i];
        }
    }

    public static void selectDice(int size, int index, List<Integer> diceList) {
        if (size == _dice.length / 2) {
            List<Integer> opposeDiceList = new ArrayList<>();
            selectDiceList.add(diceList.stream().mapToInt(b -> b).toArray());
            for (int i = 0; i < _dice.length; i++) {
                if (!diceList.contains(i)) {
                    opposeDiceList.add(i);
                }
            }
            opposeSelectDiceList.add(opposeDiceList.stream().mapToInt(b -> b).toArray());
            return;
        }
        if (index == _dice.length) {
            return;
        }

        diceList.add(index);
        selectDice(size + 1, index + 1, diceList);
        diceList.remove(Integer.valueOf(index));
        selectDice(size, index + 1, diceList);
    }
}
