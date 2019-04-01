package ru.job4j.condition2;

public class Max {
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int firstMax(int first, int second) {
        return first > second ? 1 : 0;
    }

    public int secondMax(int first, int second) {
        return first < second ? 1 : 0;
    }

    public int equalsFS(int first, int second) {
        return first == second ? 1 : 0;
    }
}