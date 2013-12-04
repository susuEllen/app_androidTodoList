package com.prototype.presentation;

import com.prototype.R;
import com.prototype.customview.CustomListArrayAdapter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
//import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenuActivity extends Activity{

	//TODO: make this a custom listView
	String [] tasks = {"Building mobile app", "Running", "Watch make up tutorials"};
	ListView listView;
	private static final String TAG = "MainMenuActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_main);
		listView = (ListView) findViewById(R.id.taskListView);
		//setListAdapter(new ArrayAdapter<String>(MainMenuActivity.this,  android.R.layout.simple_list_item_1, tasks));
		//setListAdapter(adapter);
		CustomListArrayAdapter adapter = new CustomListArrayAdapter(this, tasks);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MainMenuActivity.this, "You Clicked at " + tasks[position], Toast.LENGTH_SHORT).show();
				
			}
		});

	}

//	@Override
//	protected void onListItemClick(ListView l, View v, int position, long id) {
//		super.onListItemClick(l, v, position, id);
//		//startNewActivityForTest(l,v,position);
//	}
	
	/*
	private void startNewActivityForTest(ListView l, View v, int position) {
		try {
			String task = tasks[position];
			@SuppressWarnings("rawtypes")
			// starting 
			Class ourClass = Class.forName("com.prototype.presentation." + task);
			Intent outIntent = new Intent(MainMenuActivity.this, ourClass);
			startActivity(outIntent);
		} catch(ClassNotFoundException ex) {
			Log.e(TAG, "class not found " + ex.getMessage());
		}
	}*/
}
