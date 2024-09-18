import java.util.*;
class Solution {
    
    static int[] _numbers;
    static int _target;
    static int count = 0;
    
    public int solution(int[] numbers, int target) {
        
        _numbers = numbers;
        _target = target;
        func(0, 0);
        return count;
    }
    
    public void func(int index, int sum) {
        if (index == _numbers.length) {
            if (_target == sum) {
                count++;
            }
            return;
        }
        
        func(index + 1, sum + _numbers[index]);
        func(index + 1, sum - _numbers[index]);
    }
}