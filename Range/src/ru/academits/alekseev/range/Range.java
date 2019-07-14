package ru.academits.alekseev.range;

class Range {
    private double from;
    private double to;

    Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    double getFrom() {
        return this.from;
    }

    void setFrom(double from) {
        this.from = from;
    }

    double getTo() {
        return this.to;
    }

    void setTo(double to) {
        this.to = to;
    }

    double getLength() {
        return this.to - this.from;
    }

    boolean isInside(double number) {
        return (number >= this.from && number <= this.to);
    }

    Range getIntersection(Range range) {
        if (this.from >= range.to || range.from >= this.to) {
            return null;
        }

        if (from < range.from && to > range.to) {
            return new Range(range.from, range.to);
        }

        if (from > range.from && to > range.to) {
            return new Range(from, to);
        }

        //TODO: доделать!!!
        return null;
    }

    Range[] getUnion(Range range) {
        return null;
    }
}
