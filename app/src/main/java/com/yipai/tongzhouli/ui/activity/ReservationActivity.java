package com.yipai.tongzhouli.ui.activity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.dialog.DateSelectDialog;
import com.yipai.tongzhouli.ui.widget.MyFontButton;
import com.yipai.tongzhouli.ui.widget.MyFontTextView;

import java.nio.channels.SelectableChannel;
import java.util.Calendar;

/**
 * Created by moram on 2016/9/22.
 * 景区介绍
 */
public class ReservationActivity extends BaseActivity  {


    private MyFontTextView selectDateTV;
    private MyFontButton orderBT;

    private Calendar calendar=Calendar.getInstance();

    private Context mContext;

    private DateSelectDialog dialog;

    @Override
    protected void initData() {
        mContext=this;
    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_reservation);
    }

    @Override
    protected void initView() {
        setTitle(R.string.tv_zxyy);

        selectDateTV=(MyFontTextView)findViewById(R.id.tv_slect_date);
        orderBT=(MyFontButton)findViewById(R.id.bt_order);

    }

    @Override
    protected void initEvent() {
        selectDateTV.setOnClickListener(this);
        orderBT.setOnClickListener(this);
    }

    @Override
    protected void onClick(int resId) {
        switch(resId){
            case R.id.tv_slect_date:
                int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                int dayOfMonth=calendar.get(Calendar.DAY_OF_MONTH);
                if(dialog==null){
                    dialog=new DateSelectDialog(mContext, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        }
                    },year,month,dayOfMonth);
                }
                dialog.show();

                break;

            case R.id.bt_order:

                break;
        }
    }


}

