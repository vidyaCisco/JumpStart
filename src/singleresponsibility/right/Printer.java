package singleresponsibility.right;

class Printer {
    Text text;

    Printer(Text t) {
       this.text = t;
    }

    void printText() { ... }
}