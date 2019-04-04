package slydepay.com.tonte.sampleslydepayintegration;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {
    Button payButton;
    ProgressDialog dialog;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        payButton = (Button) findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);

    }
}
