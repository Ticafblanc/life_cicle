package com.example.evaluation_formative_02_2713413;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TransitionEtats";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: invoqué ");
    }

    @Override
    protected void  onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: invoqué ");
    }

    @Override
    protected void  onStart() {
        super.onStart();
        Log.i(TAG, "onStart: invoqué ");
    }

    @Override
    protected void  onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState: invoqué ");
        CharSequence recup = savedInstanceState.getCharSequence("testSave");
        EditText test = findViewById(R.id.TesteditText);
        test.setText(recup);
    }

    @Override
    protected void  onResume() {
        super.onResume();
        Log.i(TAG, "onResume: invoqué ");
    }

    @Override
    protected void  onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState: invoqué ");
        EditText test = findViewById(R.id.TesteditText);
        CharSequence contenu =  test.getText();
        savedInstanceState.putCharSequence("testSave", contenu);
    }

    @Override
    protected void  onPause() {
        super.onPause();
        Log.i(TAG, "onPause: invoqué ");
    }

    @Override
    protected void  onStop() {
        super.onStop();
        Log.i(TAG, "onStop: invoqué ");
    }

    @Override
    protected void  onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: invoqué ");
    }


}