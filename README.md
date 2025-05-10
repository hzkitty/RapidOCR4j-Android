# RapidOcrAndroid4j

## 😺 项目介绍

- **本项目是安卓OCR工具，纯Java开发，采用ONNXRuntime作为推理引擎调用模型，包括使用OpenCV对图片的处理优化等**

> ✨如果该项目对您有帮助，您的star是我不断优化的动力！！！
>
> - [github点击前往](https://github.com/hzkitty/RapidOcrAndroid4j)
> - [gitee点击前往](https://gitee.com/hzkitty/RapidOcrAndroid4j)

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

## 鸣谢

- [RapidOCR](https://github.com/RapidAI/RapidOCR)

## 开源许可
使用 [Apache License 2.0](https://github.com/MyMonsterCat/DeviceTouch/blob/main/LICENSE)
