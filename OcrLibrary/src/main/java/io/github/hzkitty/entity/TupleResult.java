package io.github.hzkitty.entity;

/**
 * 用于存储文本识别结果 (text, conf)
 */
public class TupleResult {
    private final String text;
    private final float confidence;
    private WordBoxInfo wordBoxInfo;
    private WordBoxResult wordBoxResult;

    public TupleResult(String text, float confidence, WordBoxInfo wordBoxInfo) {
        this.text = text;
        this.confidence = confidence;
        this.wordBoxInfo = wordBoxInfo;
    }

    public String getText() {
        return text;
    }

    public float getConfidence() {
        return confidence;
    }

    public WordBoxInfo getWordBoxInfo() {
        return wordBoxInfo;
    }

    public void setWordBoxInfo(WordBoxInfo wordBoxInfo) {
        this.wordBoxInfo = wordBoxInfo;
    }

    public WordBoxResult getWordBoxResult() {
        return wordBoxResult;
    }

    public void setWordBoxResult(WordBoxResult wordBoxResult) {
        this.wordBoxResult = wordBoxResult;
    }

    @Override
    public String toString() {
        return "TupleResult{" +
                ", text='" + text + '\'' +
                ", confidence=" + confidence +
                ", wordBoxInfo=" + wordBoxInfo +
                ", wordBoxResult=" + wordBoxResult +
                '}';
    }
}
