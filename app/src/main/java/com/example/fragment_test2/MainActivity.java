package com.example.fragment_test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnA;
    private Button btnB;
    private FragmentA fragmentA;
    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA = findViewById(R.id.btn_a);
        btnB = findViewById(R.id.btn_b);
        fragmentA = new FragmentA();
        fragmentB = new FragmentB();

        ChangeFragment(fragmentA);

        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ChangeFragment(fragmentA);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ChangeFragment(fragmentB);
            }
        });
    }

    public void ChangeFragment(Fragment afterFragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, afterFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
