import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class SpecialList {

    private List<Integer> seq;

    private List<Integer> toDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while(n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits;
    }

    private int toNumber(List<Integer> digits) {
        int number = 0;
        for(int i=0;i<digits.size();i++) {
            number = (number * 10) + digits.get(i);
        }
        return number;
    }

    private int getSmallestNumber(int size) {
        int smallestNumber = 0;
        for(int i=1;i<=size;i++) {
            smallestNumber = (smallestNumber * 10) + i;
        }
        return smallestNumber;
    }

    private int getLargestNumber(int size) {
        int largestNumber = 0;
        for(int i=9 - size + 1,j=0;j < size ;j++,i++) {
             largestNumber = (largestNumber * 10) + i;
        }
        return largestNumber;
    }

    private boolean isValid(List<Integer> digits) {
        for(int i=1;i<digits.size();i++) {
            if(digits.get(i) >= digits.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public SpecialList(int size) {
        int currentNumber = getSmallestNumber(size);
        seq = new ArrayList<>();
        for(int i=currentNumber;i<=getLargestNumber(size);i++) {
            if(isValid(toDigits(i))) {
                seq.add(i);
            }
        }
        System.out.println(seq);
//        seq.add(currentNumber);

    }



}
