package com.example.sage.networkfinder;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.kaopiz.kprogresshud.KProgressHUD;
import com.valdesekamdem.library.mdtoast.MDToast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText etNumber;
    Button btnCheck;
    ProgressBar bar;
    ProgressDialog progressDialog;

    private Network network = new Network();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvNetwork);
        etNumber = findViewById(R.id.etNum);
        btnCheck = findViewById(R.id.btnCheck);

        progressDialog = new ProgressDialog(MainActivity.this);
        bar = new ProgressBar(this, null, android.R.attr.progressBarStyleSmall);




        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();

            }
        });
    }

    private void check() {
        String number = etNumber.getText().toString();


        if (TextUtils.isEmpty(number) || number.length() < 11 || number.length() > 11)  {
            MDToast.makeText(getApplication(), "Provide A Number!",
                    MDToast.LENGTH_LONG, MDToast.TYPE_INFO).show();
        }else {


            if (!number.matches("[0-9]+")) {
                MDToast.makeText(this, "Error! Invalid number", Toast.LENGTH_LONG);

            } else {
                number.substring(0, 4);

                progressDialog.setMessage("Checking Network ......");
                progressDialog.show();


                if (number.startsWith(network.glo1) || number.startsWith(network.glo2)
                        || number.startsWith(network.glo3) || number.startsWith(network.glo4)
                        || number.startsWith(network.glo5) || number.startsWith(network.glo6)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A Glo Network");

                    progressDialog.dismiss();

                    return;
                }
                if (number.startsWith(network.mtn0) || number.startsWith(network.mtn1)
                        || number.startsWith(network.mtn2) || number.startsWith(network.mtn3)
                        || number.startsWith(network.mtn4) || number.startsWith(network.mtn5)
                        || number.startsWith(network.mtn6) || number.startsWith(network.mtn7)
                        || number.startsWith(network.mtn8) || number.startsWith(network.mtn9)) {


                    progressDialog.dismiss();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A MTN Network");


                    return;
                }

                if (number.startsWith(network.airtel1) || number.startsWith(network.airtel2)
                        || number.startsWith(network.airtel3) || number.startsWith(network.airtel4)
                        || number.startsWith(network.airtel5) || number.startsWith(network.airtel6)
                        || number.startsWith(network.airtel7)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is An AIRTEL Network");

                    progressDialog.dismiss();

                    return;
                }

                if (number.startsWith(network.etisalat1) || number.startsWith(network.etisalat2)
                        || number.startsWith(network.etisalat3) || number.startsWith(network.etisalat4)
                        || number.startsWith(network.etisalat5)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A 9MOBILE Network");
                progressDialog.dismiss();

                    return;
                }

                if (number.startsWith(network.starcomms1) || number.startsWith(network.starcomms2)
                        || number.startsWith(network.starcomms3)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A STARCOMMS Network");
                progressDialog.dismiss();
                    return;
                }

                if (number.startsWith(network.visafon1) || number.startsWith(network.visafon2)
                        || number.startsWith(network.visafon3)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A VISAFON Network");
                progressDialog.dismiss();

                    return;
                }

                if (number.startsWith(network.multiLinks1) || number.startsWith(network.multiLinks2)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A MULTILINKS Network");
                progressDialog.dismiss();
                    return;
                }

                if (number.startsWith(network.zoomMobile)) {


                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A ZOOM MOBILE Network");
                    progressDialog.dismiss();
                    return;
                }

                if (number.startsWith(network.ntel)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A NTEL Network");
                    progressDialog.dismiss();
                    return;
                }

                if (number.startsWith(network.smile)) {

                    progressDialog.setMessage("Checking Network ......");
                    progressDialog.show();
                    String message = "Your Number";
                    tv.setText(message + " " + number + " \n" + "Is A SMILE Network");

                } else {
                    MDToast.makeText(getApplication(), "Opps!, THIS NOT A VALID PHONE NUMBER",
                            MDToast.LENGTH_LONG, MDToast.TYPE_INFO).show();
                    progressDialog.dismiss();
                }


            }
        }

    }
}