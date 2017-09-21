package com.vector.pickerwheel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.Calendar;

import cn.qqtheme.framework.picker.DatePicker;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {

        Calendar calendar = Calendar.getInstance();

        DatePicker datePicker = new DatePicker(this);
        datePicker.setRangeStart(2010, 1, 1);
        datePicker.setRangeEnd(2025, 12, 30);
        datePicker.setSelectedItem(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
        datePicker.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {

            @Override
            public void onDatePicked(String year, String month, String day) {

                Log.d(TAG, "onDatePicked() called with: year = [" + year + "], month = [" + month + "], day = [" + day + "]");
            }
        });

//        datePicker.show();
    }
}
