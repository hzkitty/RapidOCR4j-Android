package io.github.hzkitty.entity;

public class ParamConfig {
    public Float boxThresh; // 边框阈值
    public Float unclipRatio; // 非极大值抑制后的扩展比例
    public Float textScore; // 文本评分阈值
    public Boolean returnWordBox; // 是否返回单词级别的框
    public Boolean useDet; // 是否使用检测模块
    public Boolean useCls; // 是否使用分类模块
    public Boolean useRec; // 是否使用识别模块

    public Float getBoxThresh() {
        return boxThresh;
    }

    public void setBoxThresh(Float boxThresh) {
        this.boxThresh = boxThresh;
    }

    public Float getUnclipRatio() {
        return unclipRatio;
    }

    public void setUnclipRatio(Float unclipRatio) {
        this.unclipRatio = unclipRatio;
    }

    public Float getTextScore() {
        return textScore;
    }

    public void setTextScore(Float textScore) {
        this.textScore = textScore;
    }

    public Boolean getReturnWordBox() {
        return returnWordBox;
    }

    public void setReturnWordBox(Boolean returnWordBox) {
        this.returnWordBox = returnWordBox;
    }

    public Boolean getUseDet() {
        return useDet;
    }

    public void setUseDet(Boolean useDet) {
        this.useDet = useDet;
    }

    public Boolean getUseCls() {
        return useCls;
    }

    public void setUseCls(Boolean useCls) {
        this.useCls = useCls;
    }

    public Boolean getUseRec() {
        return useRec;
    }

    public void setUseRec(Boolean useRec) {
        this.useRec = useRec;
    }
}
