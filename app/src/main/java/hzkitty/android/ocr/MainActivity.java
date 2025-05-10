package hzkitty.android.ocr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import io.github.hzkitty.RapidOCR;
import io.github.hzkitty.entity.OcrResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            ocr();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ocr() throws Exception {
        RapidOCR rapidOCR = RapidOCR.create(this);

//        byte[] imgContent = readBytesFromAssets(this, "text_01.png");

        InputStream is = this.getAssets().open("text_01.png");
        Bitmap imgContent = BitmapFactory.decodeStream(is);

        OcrResult ocrResult = rapidOCR.run(imgContent);
        System.out.println(ocrResult);
    }

    public byte[] readBytesFromAssets(Context context, String assetFileName) {
        try (InputStream is = context.getAssets().open(assetFileName);
             ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {

            byte[] tmp = new byte[4096];
            int len;
            while ((len = is.read(tmp)) != -1) {
                buffer.write(tmp, 0, len);
            }
            return buffer.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}