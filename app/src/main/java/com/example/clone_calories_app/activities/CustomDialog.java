package com.example.clone_calories_app.activities;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.example.clone_calories_app.R;

public class CustomDialog extends Dialog {
    interface  FullNameListener{
        public  void fullNameEnterd(String fullName);
    }
        private Context context;
        private EditText editTextname;
        private Button buttonOk;
        private Button buttonCancel;
        private CustomDialog.FullNameListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes_item_view);

    }

    protected CustomDialog(@NonNull Context context,CustomDialog.FullNameListener listener) {
        super(context);
        this.context = context;
        this.listener = listener;
    }
}
