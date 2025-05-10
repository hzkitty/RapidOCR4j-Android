package io.github.hzkitty.entity;

import org.opencv.core.Point;

import java.util.Arrays;

public class RecResult {
    private Point[] dtBoxes;
    private final String text;
    private final float confidence;
    private WordBoxResult wordBoxResult;

    public RecResult(Point[] dtBoxes, String text, float confidence, WordBoxResult wordBoxResult) {
        this.dtBoxes = dtBoxes;
        this.text = text;
        this.confidence = confidence;
        this.wordBoxResult = wordBoxResult;
    }

    public Point[] getDtBoxes() {
        return dtBoxes;
    }

    public void setDtBoxes(Point[] dtBoxes) {
        this.dtBoxes = dtBoxes;
    }

    public String getText() {
        return text;
    }

    public float getConfidence() {
        return confidence;
    }

    public WordBoxResult getWordBoxResult() {
        return wordBoxResult;
    }

    public void setWordBoxResult(WordBoxResult wordBoxResult) {
        this.wordBoxResult = wordBoxResult;
    }

    @Override
    public String toString() {
        return "RecResult{" +
                "dtBoxes=" + Arrays.toString(dtBoxes) +
                ", text='" + text + '\'' +
                ", confidence=" + confidence +
                ", wordBoxResult=" + wordBoxResult +
                '}';
    }
}
