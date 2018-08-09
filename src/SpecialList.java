import java.util.ArrayList;

public class SpecialList {

    public ArrayList<Integer> seq;
//
//    public SpecialList(int x ){
//        seq = new ArrayList<>();
//    }

    public int getNextVal(int currVal){
        return getNextNth(currVal,1);
    }

    public int getPrevVal(int currVal){
        return getPrevNth(currVal,-1);
    }

    public int getDiff(int val1,int val2){
        int min = Math.min(val1,val2);
        int max = Math.max(val1,val2);
        int count=0;
        while(min!=max){
            min = getNextVal(min);
            count++;
        }
        return count;
    }

    public int getNextNth(int currVal,int n){
        int index = seq.indexOf(currVal);
        return seq.get((index +n)%seq.size());
    }

    public int getPrevNth(int currVal,int n){
        int index = seq.indexOf(currVal);
        return seq.get((index-n)%seq.size());
    }

}
