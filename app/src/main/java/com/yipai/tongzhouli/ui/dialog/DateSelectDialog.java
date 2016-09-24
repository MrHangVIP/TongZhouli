package com.yipai.tongzhouli.ui.dialog;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

import com.yipai.tongzhouli.R;

public class DateSelectDialog extends DatePickerDialog {

	public DateSelectDialog(Context context, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) {
		super(context, R.style.TimeDialog,callBack, year, monthOfYear, dayOfMonth);
//		setContentView(R.layout.dialog_date_select);
	}

	@Override
	public void onDateChanged(DatePicker view, int year, int month, int day) {
		super.onDateChanged(view, year, month, day);
	}
}
