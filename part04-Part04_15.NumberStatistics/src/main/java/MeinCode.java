
    public class MeinCode {
        private int count;
        private int sum;

    public MeinCode() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = (double) sum / count;
        return average;
    }
}


