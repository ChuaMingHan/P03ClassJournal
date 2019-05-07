package sg.edu.rp.c346.p03classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LessonAdapter extends ArrayAdapter<Lesson> {
    private ArrayList<Lesson> lesson;
    private Context context;
    private TextView textViewWeek;
    private TextView textViewDG;
    private ImageView imageViewDG;

    public LessonAdapter(Context context, int resource, ArrayList<Lesson> objects){
        super(context, resource, objects);
        lesson = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        textViewWeek = rowView.findViewById(R.id.textViewWeek);
        textViewDG = rowView.findViewById(R.id.textViewDG);
        imageViewDG = rowView.findViewById(R.id.imageViewDG);

        Lesson currentLesson = lesson.get(position);

        textViewWeek.setText("Week: " + currentLesson.getWeek());
        textViewDG.setText("Daily Grade: " +currentLesson.getGrade());

        imageViewDG.setImageResource(R.drawable.dg);

        return rowView;
    }

}
