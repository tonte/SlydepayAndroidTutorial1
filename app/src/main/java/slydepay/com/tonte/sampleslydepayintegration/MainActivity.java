package slydepay.com.tonte.sampleslydepayintegration;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import slydepay.com.tonte.sampleslydepayintegration.network.APIUtils;
import slydepay.com.tonte.sampleslydepayintegration.network.ApiInterface;


public class MainActivity extends AppCompatActivity {
    Button payButton;
    ProgressDialog dialog;
    private ApiInterface apiClient;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        apiClient = APIUtils.getAPIService();
        setContentView(R.layout.activity_main);
        payButton = (Button) findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new ProgressDialog(MainActivity.this);
                dialog.setMessage("Creating Invoice, Please Wait");
                dialog.show();
                createInvoice();
            }
        });

    }

    public void createInvoice(){
        final Map<String,Object> map = new HashMap();
        map.put("emailOrMobileNumber", App.EMAIL_OR_MOBILE_NUMBER);
        map.put("merchantKey",App.MERCHANT_KEY);
        map.put("amount",10.00);
        map.put("orderCode", UUID.randomUUID().toString());


    }
}
