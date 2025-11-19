
void main() {

    Range g = new Range(5, 10);
    g.print();
    g.printReverse();
    int[] nats = naturals(new Range(2,8));
    IO.println(Arrays.toString(nats));
    String cut = cut("Bela string!", new Range(4,10));
    IO.println(cut);
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

String cut(String toCut, Range range) {
    if (range.isEmpty()){
        return toCut;
    }
    String newString = toCut;

    if (range.min() < 0 || range.max() > toCut.length() - 1) {
        return null;
    }

    newString = newString.substring(0, range.min());
    newString += toCut.substring(range.max() + 1);

    return newString;
}