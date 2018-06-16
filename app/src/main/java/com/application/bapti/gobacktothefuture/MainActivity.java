package com.application.bapti.gobacktothefuture;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private TextView DisplayTodayDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenir bouton
        DisplayTodayDate = findViewById(R.id.todayDate);

        SimpleDateFormat formatter = new SimpleDateFormat ("dd:MM:yyyy" );
        //récupération de la date courante
        Date currentTime_1 = new Date();
        //on crée la chaîne à partir de la date
        String today = formatter.format(currentTime_1);
        Log.d(TAG, today);
        DisplayTodayDate.setText(today);

        //definir action
        DisplayTodayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                SimpleDateFormat formatter = new SimpleDateFormat ("dd:MM:yyyy" );
                //récupération de la date courante
                Date currentTime_1 = new Date();
                //on crée la chaîne à partir de la date
                String today = formatter.format(currentTime_1);
                startActivity(new Intent(Settings.ACTION_DATE_SETTINGS));
                finish();
                startActivity(getIntent());
                Log.d(TAG, today);
                DisplayTodayDate.setText(today);
            }
        });

    }
}
