package io.github.hzkitty.entity;

public class OrtInferConfig {
    public int intraOpNumThreads; // 单线程操作线程数
    public int interOpNumThreads; // 多线程操作线程数
    public boolean useCuda; // 是否使用 CUDA
    public int deviceId; // 显卡编号
    public boolean useDml; // 是否使用 DML
    public String modelPath; // 模型路径
    public boolean useArena;

    public int getIntraOpNumThreads() {
        return intraOpNumThreads;
    }

    public void setIntraOpNumThreads(int intraOpNumThreads) {
        this.intraOpNumThreads = intraOpNumThreads;
    }

    public int getInterOpNumThreads() {
        return interOpNumThreads;
    }

    public void setInterOpNumThreads(int interOpNumThreads) {
        this.interOpNumThreads = interOpNumThreads;
    }

    public boolean isUseCuda() {
        return useCuda;
    }

    public void setUseCuda(boolean useCuda) {
        this.useCuda = useCuda;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public boolean isUseDml() {
        return useDml;
    }

    public void setUseDml(boolean useDml) {
        this.useDml = useDml;
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }

    public boolean isUseArena() {
        return useArena;
    }

    public void setUseArena(boolean useArena) {
        this.useArena = useArena;
    }
}
