package com.example.clone_calories_app.listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.example.clone_calories_app.activities.DishActivity;
import com.example.clone_calories_app.activities.MyMenuActivity;
import com.example.clone_calories_app.activities.ProfileActivity;

public class ToWindowOnClick implements View.OnClickListener {
    protected Activity fromActivity;
    protected Class toActivityClass;

    public ToWindowOnClick(Activity fromActivity, Class<? extends Activity> toActivityClass) {
        this.fromActivity = fromActivity;
        this.toActivityClass = toActivityClass;
    }



    @Override
    public void onClick(View v) {
        Intent intent = new Intent(fromActivity, toActivityClass);
        fromActivity.startActivity(intent);
    }
}
