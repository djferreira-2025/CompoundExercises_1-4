
void main() {
    Range g = new Range(5, 10);
    print(g);
    printReverse(g);
    int[] numbers = naturals(new Range(1, 5));
    IO.println(Arrays.toString(numbers));
    print(findFirst("brown", "The quick brown fox jumps over the lazy dog"));
}


record Range(int min, int max) {

    boolean isEmpty() {
        return min > max;
    }

    int length() {
        if (isEmpty()) {
            return 0;
        }
        return max - min + 1;
    }
}

void print(Range range) {
    for (int i = range.min; i <= range.max; i++) {
        if (i != range.max) {
            IO.print(i + " ");
        } else {
            IO.println(i);
        }
    }
}

void printReverse(Range range) {
    for (int i = range.max; i >= range.min; i--) {
        if (i != range.min) {
            IO.print(i + " ");
        } else {
            IO.println(i);
        }
    }
}


int[] naturals(Range range) {
    int[] array = new int[range.length()];
    int value = range.min;

    for (int i = 0; i < array.length; i++) {
        array[i] = value;
        value++;
    }
    return array;
}

Range findFirst(String search, String text) {
    int index = text.indexOf(search);
    if (index == -1){
        return null;
    }
    return new Range(index, index + search.length() - 1);
}

