public class Odometer {

    SpecialList specialList;
    int currentReading;

    public Odometer(int size) {
        specialList = new SpecialList(size);
        currentReading = specialList.getSmallestNumber(size);
        System.out.println(specialList.getDifference(6789, 1234));
    }

    public String getCurrentReading() {
        return Integer.toString(currentReading);
    }

    public void incrementCurrentReading() {
        currentReading = specialList.getNext(currentReading);
        System.out.println(getCurrentReading());
    }

}
