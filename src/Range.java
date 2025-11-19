public record Range(int min, int max){
    boolean isEmpty() {
        return min > max;
    }

    int length() {
        if (isEmpty()){
            return 0;
        }
        return max - min + 1;
    }

    void print() {
        for (int i = min; i <= max; i++) {
            if (i != max){
                IO.print(i + " ");
            } else {
                IO.println(i);
            }
        }
    }

    void printReverse() {
        for (int i = max; i >= min ; i--) {
            if (i != min){
                IO.print(i + " ");
            } else {
                IO.println(i);
            }
        }
    }
}