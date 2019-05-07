package sg.edu.rp.c346.p03classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne =findViewById(R.id.textViewOne);

        tvOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity.this,
                        ModuleInfo.class);
                // Start activity with requestCodeForSupermanStats to identify it was started by clicking on Superman
                startActivity(i);

            }});
    }
}
