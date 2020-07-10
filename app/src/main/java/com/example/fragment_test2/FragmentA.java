package com.example.fragment_test2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    private View view = null;
    private EditText editText;
    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (view == null) {
            view = inflater.inflate(R.layout.fragment_a, container, false);
            editText = view.findViewById(R.id.edit_text_a);
        } else {
            editText.setText("hello world");
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("TEST_LOG", "onActivityCreated:"+editText.getText().toString());
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("TEST_LOG", "onStart:"+editText.getText().toString());
        super.onStart();

        editText.setText("hello world");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TEST_LOG", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TEST_LOG", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TEST_LOG", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TEST_LOG", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TEST_LOG", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TEST_LOG", "onDetach");
    }
}
