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
        //не пересекаются
        if (from > range.to || range.from > to) {
            return null;
        }

        //range входит в this
        if (from <= range.from && to >= range.to) {
            return new Range(range.from, range.to);
        }

        //this входит в range
        if (from > range.from && to > range.to) {
            return new Range(from, to);
        }

        //range частично дальше this
        if (from < range.from && to < range.to) {
            return new Range(range.from, to);
        }

        //this частично дальше range
        return new Range(from, range.to);
    }

    Range[] getUnion(Range range) {
        if (from > range.to || range.from > to) {
            return new Range[]{new Range(from, to), new Range(range.from, range.to)};
        }

        return null;
    }
}
