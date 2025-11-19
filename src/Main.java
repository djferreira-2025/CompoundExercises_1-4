
void main() {

    Range g = new Range(5, 10);
    g.print();
    g.printReverse();
    int[] nats = naturals(new Range(2,8));
    IO.println(Arrays.toString(nats));
}

int[] naturals(Range range) {
    int[] array = new int[range.length()];
    int value = range.min();

    for (int i = 0; i < array.length ; i++) {
        array[i] = value;
        value ++;
    }
    return array;
}