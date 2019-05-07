package sg.edu.rp.c346.p03classjournal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ModuleInfo extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Lesson> lesson;
    Button btnInfo, btnAdd, btnEmail;

    String retrievedGrade = "";
    int retrievedWeek = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_info);

        lv = this.findViewById(R.id.lvLessons);
        btnInfo = this.findViewById(R.id.buttonInfo);
        btnEmail = this.findViewById(R.id.buttonEmail);
        btnAdd = this.findViewById(R.id.buttonAdd);

        lesson = new ArrayList<Lesson>();
        lesson.add(new Lesson("B", 1));



        for(int i = 0; i < lesson.size(); i++) {
            retrievedWeek = lesson.get(i).getWeek();
            retrievedGrade = lesson.get(i).getGrade();
        }



        aa = new LessonAdapter(this, R.layout.row, lesson);
        lv.setAdapter(aa);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Intent to display data
                Intent infoIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                infoIntent.setData(Uri.parse("https://www.rp.edu.sg/soi/full-time-diplomas/details/r47"));
                startActivity(infoIntent);
            }

        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text

                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Student Queries");
                email.putExtra(Intent.EXTRA_TEXT, "I am an RP Student. \n Please see my remarks so far, thank you! \n" +
                        "Week: " + retrievedWeek + " DG: " + retrievedGrade);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
            }

        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(ModuleInfo.this,
                        LessonAdder.class);
                // Start activity with requestCodeForSupermanStats to identify it was started by clicking on Superman
                startActivity(i);

            }});

    }
}
