package sg.edu.rp.c346.p03classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class LessonAdder extends AppCompatActivity {

    TextView tvWeekly, tvDGly;
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6;
    Button btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_adder);

        tvWeekly = this.findViewById(R.id.textViewWeekly);
        tvDGly = this.findViewById(R.id.textViewDGly);
        btnSub = this.findViewById(R.id.buttonSubmit);

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(LessonAdder.this,
                        ModuleInfo.class);
                // Start activity with requestCodeForSupermanStats to identify it was started by clicking on Superman
                startActivity(i);

            }});
    }
}
