package com.prototype.customview;

import com.prototype.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListArrayAdapter extends ArrayAdapter<String>{

	private final Context context;
	private final String[] values;
	
	public CustomListArrayAdapter(Context context, String[] values) {
		super(context, R.layout.list_single, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_single,  parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.txt);
		ImageView imageView =  (ImageView) rowView.findViewById(R.id.img);
				
		textView.setText(values[position]);
		imageView.setImageResource(R.drawable.emoticon);	// TODO: change this image
		
		return rowView;
	}

}
