package com.example.elvor.template.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.elvor.template.R;
import com.example.elvor.template.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    //привязываем вьюхи к полям класса
    @BindView(R.id.button)
    protected Button button;

    @BindView(R.id.sample_text)
    protected TextView sampleText;

    @Override
    protected int getLayoutId() {
        //в XML файле описание всех вьюх активити
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //обычно текст прописывается в XML, но иногда нужнор сделать это динамически
        sampleText.setText("azaza");
        // закомменти и увидишь надпись из strings.xml

        //так себе способ назначить действие для кнопки, раскомменть и попробуй (не забудь закомментить OnClick ниже)
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text = "поздравляем, вы нажали кнопку";
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
            }
        });*/


    // Example of a call to a native method
   /* TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(stringFromJNI());*/


    }

    //православный способ, однако, не работает, если нужно поменять действие в коде
    @OnClick(R.id.button)
    public void click(final View view) {
        Toast.makeText(this, R.string.button_toast, Toast.LENGTH_LONG).show();
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
   /* public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }*/
}
