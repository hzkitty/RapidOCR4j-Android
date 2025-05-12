# RapidOCR4j-Android

## 😺 项目介绍

- **本项目是安卓OCR工具，纯Java开发，采用ONNXRuntime作为推理引擎调用模型，包括使用OpenCV对图片的处理优化等**

> ✨如果该项目对您有帮助，您的star是我不断优化的动力！！！
>
> - [github点击前往](https://github.com/hzkitty/RapidOCR4j-Android)
> - [gitee点击前往](https://gitee.com/hzkitty/RapidOCR4j-Android)

## 🎉 快速开始

安装依赖，默认使用 onnxruntime-android:1.18.0 和 opencv:4.9.0
```groovy
implementation 'io.github.hzkitty:rapidocr4j-android:1.0.0'
```
使用示例
```java
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import java.io.InputStream;

import io.github.hzkitty.RapidOCR;
import io.github.hzkitty.entity.OcrResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            InputStream is = this.getAssets().open("text_01.png");
            Bitmap imgContent = BitmapFactory.decodeStream(is);
            RapidOCR rapidOCR = RapidOCR.create(this);
            OcrResult ocrResult = rapidOCR.run(imgContent);
            System.out.println(ocrResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

[OcrConfig想更深入了解，请移步config.yaml参数解释](https://rapidai.github.io/RapidOCRDocs/install_usage/api/RapidOCR/)


> ⚠️ **注意事项：使用 `rapidocr4j-android:1.0.0` 时请确保以下两点配置正确**

### 1️⃣ 设置 `minSdkVersion ≥ 29`，该库要求最低 `minSdkVersion` 为 **29**

```groovy
android {
    defaultConfig {
        minSdkVersion 29
    }
}
```

### 2️⃣ 处理 application@theme 冲突

rapidocr4j-android 中的 AndroidManifest.xml 与项目自身的主题声明可能发生冲突。为避免合并报错，请执行以下操作：

步骤：在 `<manifest>` 根标签中添加 tools 命名空间。在 `<application>` 标签中添加 tools:replace

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:tools="http://schemas.android.com/tools"> <!--添加这一行-->

    <application
            android:allowBackup="true"
            tools:replace="android:theme"  <!--添加这一行-->
            tools:targetApi="31">
        <!-- 你的其他组件配置 -->
    </application>

</manifest>
```

## 鸣谢

- [RapidOCR](https://github.com/RapidAI/RapidOCR)

## 开源许可
使用 [Apache License 2.0](https://github.com/MyMonsterCat/DeviceTouch/blob/main/LICENSE)
