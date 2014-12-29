package dylanrose60.listview;

import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class SecondActivity extends Activity {

	protected String userSelect;


protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.second_layout);
    userSelect = getIntent().getStringExtra("getSelection");
    setText();
}

public void setText() {
	TextView text = (TextView) findViewById(R.id.text2);
	text.setText(userSelect);
}

}