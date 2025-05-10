package io.github.hzkitty.entity;

// OCR 主配置类
public class OcrConfig {
    public GlobalConfig Global = new GlobalConfig(); // 全局配置
    public DetConfig Det = new DetConfig(); // 检测模块配置
    public ClsConfig Cls = new ClsConfig(); // 分类模块配置
    public RecConfig Rec = new RecConfig(); // 识别模块配置

    public GlobalConfig getGlobal() {
        return Global;
    }

    public void setGlobal(GlobalConfig global) {
        Global = global;
    }

    public DetConfig getDet() {
        return Det;
    }

    public void setDet(DetConfig det) {
        Det = det;
    }

    public ClsConfig getCls() {
        return Cls;
    }

    public void setCls(ClsConfig cls) {
        Cls = cls;
    }

    public RecConfig getRec() {
        return Rec;
    }

    public void setRec(RecConfig rec) {
        Rec = rec;
    }

    // 全局配置类
    public static class GlobalConfig {
        public float textScore = 0.5f; // 文本评分阈值
        public boolean useDet = true; // 是否使用检测模块
        public boolean useCls = true; // 是否使用分类模块
        public boolean useRec = true; // 是否使用识别模块
        public boolean printVerbose = false; // 是否打印详细信息
        public int minHeight = 30; // 最小高度
        public float widthHeightRatio = 8; // 宽高比
        public int maxSideLen = 2000; // 最大边长
        public int minSideLen = 30; // 最小边长
        public boolean returnWordBox = false; // 是否返回单词级别的框
        public int intraOpNumThreads = -1; // 单线程操作线程数
        public int interOpNumThreads = -1; // 多线程操作线程数

        public String opencvLibPath; // opencv环境依赖dll或so目录

        public float getTextScore() {
            return textScore;
        }

        public void setTextScore(float textScore) {
            this.textScore = textScore;
        }

        public boolean isUseDet() {
            return useDet;
        }

        public void setUseDet(boolean useDet) {
            this.useDet = useDet;
        }

        public boolean isUseCls() {
            return useCls;
        }

        public void setUseCls(boolean useCls) {
            this.useCls = useCls;
        }

        public boolean isUseRec() {
            return useRec;
        }

        public void setUseRec(boolean useRec) {
            this.useRec = useRec;
        }

        public boolean isPrintVerbose() {
            return printVerbose;
        }

        public void setPrintVerbose(boolean printVerbose) {
            this.printVerbose = printVerbose;
        }

        public int getMinHeight() {
            return minHeight;
        }

        public void setMinHeight(int minHeight) {
            this.minHeight = minHeight;
        }

        public float getWidthHeightRatio() {
            return widthHeightRatio;
        }

        public void setWidthHeightRatio(float widthHeightRatio) {
            this.widthHeightRatio = widthHeightRatio;
        }

        public int getMaxSideLen() {
            return maxSideLen;
        }

        public void setMaxSideLen(int maxSideLen) {
            this.maxSideLen = maxSideLen;
        }

        public int getMinSideLen() {
            return minSideLen;
        }

        public void setMinSideLen(int minSideLen) {
            this.minSideLen = minSideLen;
        }

        public boolean isReturnWordBox() {
            return returnWordBox;
        }

        public void setReturnWordBox(boolean returnWordBox) {
            this.returnWordBox = returnWordBox;
        }

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

        public String getOpencvLibPath() {
            return opencvLibPath;
        }

        public void setOpencvLibPath(String opencvLibPath) {
            this.opencvLibPath = opencvLibPath;
        }
    }

    // 检测模块配置类
    public static class DetConfig {
        public int intraOpNumThreads = -1; // 单线程操作线程数
        public int interOpNumThreads = -1; // 多线程操作线程数
        public boolean useCuda = false; // 是否使用 CUDA
        public int deviceId = 0; // 显卡编号
        public boolean useDml = false; // 是否使用 DML
        public String modelPath = "ch_PP-OCRv4_det_infer.onnx"; // 模型路径
        public int limitSideLen = 736; // 限制边长
        public String limitType = "min"; // 限制类型
        public float thresh = 0.3f; // 检测阈值
        public float boxThresh = 0.5f; // 边框阈值
        public int maxCandidates = 1000; // 最大候选框数
        public float unclipRatio = 1.6f; // 非极大值抑制后的扩展比例
        public boolean useDilation = true; // 是否使用膨胀操作
        public String scoreMode = "fast"; // 评分模式
        public boolean useArena = true; // arena内存池的扩展策略（速度有提升，但内存会剧增，且持续占用，不释放）

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

        public int getLimitSideLen() {
            return limitSideLen;
        }

        public void setLimitSideLen(int limitSideLen) {
            this.limitSideLen = limitSideLen;
        }

        public String getLimitType() {
            return limitType;
        }

        public void setLimitType(String limitType) {
            this.limitType = limitType;
        }

        public float getThresh() {
            return thresh;
        }

        public void setThresh(float thresh) {
            this.thresh = thresh;
        }

        public float getBoxThresh() {
            return boxThresh;
        }

        public void setBoxThresh(float boxThresh) {
            this.boxThresh = boxThresh;
        }

        public int getMaxCandidates() {
            return maxCandidates;
        }

        public void setMaxCandidates(int maxCandidates) {
            this.maxCandidates = maxCandidates;
        }

        public float getUnclipRatio() {
            return unclipRatio;
        }

        public void setUnclipRatio(float unclipRatio) {
            this.unclipRatio = unclipRatio;
        }

        public boolean isUseDilation() {
            return useDilation;
        }

        public void setUseDilation(boolean useDilation) {
            this.useDilation = useDilation;
        }

        public String getScoreMode() {
            return scoreMode;
        }

        public void setScoreMode(String scoreMode) {
            this.scoreMode = scoreMode;
        }

        public boolean isUseArena() {
            return useArena;
        }

        public void setUseArena(boolean useArena) {
            this.useArena = useArena;
        }
    }

    // 分类模块配置类
    public static class ClsConfig {
        public int intraOpNumThreads = -1; // 单线程操作线程数
        public int interOpNumThreads = -1; // 多线程操作线程数
        public boolean useCuda = false; // 是否使用 CUDA
        public int deviceId = 0; // 显卡编号
        public boolean useDml = false; // 是否使用 DML
        public String modelPath = "ch_ppocr_mobile_v2.0_cls_infer.onnx"; // 模型路径
        public int[] clsImageShape = {3, 48, 192}; // 分类输入图像形状
        public int clsBatchNum = 1; // 分类批量处理数
        public float clsThresh = 0.9f; // 分类阈值
        public String[] labelList = {"0", "180"}; // 分类标签列表
        public boolean useArena = true; // arena内存池的扩展策略（速度有提升，但内存会剧增，且持续占用，不释放）

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

        public int[] getClsImageShape() {
            return clsImageShape;
        }

        public void setClsImageShape(int[] clsImageShape) {
            this.clsImageShape = clsImageShape;
        }

        public int getClsBatchNum() {
            return clsBatchNum;
        }

        public void setClsBatchNum(int clsBatchNum) {
            this.clsBatchNum = clsBatchNum;
        }

        public float getClsThresh() {
            return clsThresh;
        }

        public void setClsThresh(float clsThresh) {
            this.clsThresh = clsThresh;
        }

        public String[] getLabelList() {
            return labelList;
        }

        public void setLabelList(String[] labelList) {
            this.labelList = labelList;
        }

        public boolean isUseArena() {
            return useArena;
        }

        public void setUseArena(boolean useArena) {
            this.useArena = useArena;
        }
    }

    // 识别模块配置类
    public static class RecConfig {
        public int intraOpNumThreads = -1; // 单线程操作线程数
        public int interOpNumThreads = -1; // 多线程操作线程数
        public boolean useCuda = false; // 是否使用 CUDA
        public int deviceId = 0; // 显卡编号
        public boolean useDml = false; // 是否使用 DML
        public String modelPath = "ch_PP-OCRv4_rec_infer.onnx"; // 模型路径
        public int[] recImgShape = {3, 48, 320}; // 识别输入图像形状
        public int recBatchNum = 1; // 识别批量处理数
        public boolean useArena = true; // arena内存池的扩展策略（速度有提升，但内存会剧增，且持续占用，不释放）
        public String recKeysPath; // 字典路径，如果不设置，默认从模型获取

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

        public int[] getRecImgShape() {
            return recImgShape;
        }

        public void setRecImgShape(int[] recImgShape) {
            this.recImgShape = recImgShape;
        }

        public int getRecBatchNum() {
            return recBatchNum;
        }

        public void setRecBatchNum(int recBatchNum) {
            this.recBatchNum = recBatchNum;
        }

        public boolean isUseArena() {
            return useArena;
        }

        public void setUseArena(boolean useArena) {
            this.useArena = useArena;
        }

        public String getRecKeysPath() {
            return recKeysPath;
        }

        public void setRecKeysPath(String recKeysPath) {
            this.recKeysPath = recKeysPath;
        }
    }
}