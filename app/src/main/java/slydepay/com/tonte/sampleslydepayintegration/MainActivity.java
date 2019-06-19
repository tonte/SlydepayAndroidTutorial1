package slydepay.com.tonte.sampleslydepayintegration;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import slydepay.com.tonte.sampleslydepayintegration.model.APIResponse;
import slydepay.com.tonte.sampleslydepayintegration.model.InvoiceDetails;
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

            }
        });

    }

    public void createInvoice(){

    }


    public void navigateToWebViewActivity(String orderCode, String payToken){

    }
}
