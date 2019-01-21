/*package com.example.sheks.thatmate_quiz;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.sheks.thatmate_quiz.models.Question;

import java.util.List;



public class ListViewAdapter extends ArrayAdapter<Question> {

    //the hero list that will be displayed
    private List<Question> QuestionList;

    //the context object
    private Context mCtx;

    //here we are getting the herolist and context
    //so while creating the object of this adapter class we need to give herolist and context
    public ListViewAdapter(List<Question> QuestionList, Context mCtx) {
        super(mCtx, R.layout.list_items, QuestionList);
        this.QuestionList = QuestionList;
        this.mCtx = mCtx;
    }

    //this method will return the list item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View r = convertView;
        ViewHolder viewHolder =null;

        if(r == null) {
            //getting the layoutinflater
            LayoutInflater inflater = LayoutInflater.from(mCtx);

            //creating a view with our xml layout
            r = inflater.inflate(R.layout.list_items, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        viewHolder.o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        viewHolder.o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        viewHolder.o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        //Getting the hero for the specified position
        Question Text_question = QuestionList.get(position);

        //setting hero values to textviews
        viewHolder.que.setText(Text_question.getQuestion());
        viewHolder.o1.setText(Text_question.getOption1());
        viewHolder.o2.setText(Text_question.getOption2());
        viewHolder.o3.setText(Text_question.getOption3());
        viewHolder.o4.setText(Text_question.getOption4());


        //returning the listitem
        return r;
    }
}

class ViewHolder {
    TextView que;
    Button o1,o2,o3,o4;
    ViewHolder(View listViewItem) {
        TextView question = listViewItem.findViewById(R.id.question);
        Button option1 = listViewItem.findViewById(R.id.option1);
        Button option2 = listViewItem.findViewById(R.id.option2);
        Button option3 = listViewItem.findViewById(R.id.option3);
        Button option4 = listViewItem.findViewById(R.id.option4);
    }
}*/