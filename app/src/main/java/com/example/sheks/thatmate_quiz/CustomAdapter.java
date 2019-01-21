package com.example.sheks.thatmate_quiz;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;
/*
public class CustomAdapter extends BaseAdapter {

    private LayoutInflater lInflater;
    private List<ItemObject> listStorage;
    public CustomAdapter(Context context, List<ItemObject> customizedListView) {
        lInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
    }

    @Override

    public int getCount() {

        return listStorage.size();

    }

    @Override

    public Object getItem(int position) {

        return position;

    }

    @Override

    public long getItemId(int position) {

        return position;

    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder listViewHolder;

        if(convertView == null){

            listViewHolder = new ViewHolder();

            convertView = lInflater.inflate(R.layout.list, parent, false);

            listViewHolder.Question = (TextView)convertView.findViewById(R.id.question);

            listViewHolder.option1 = (Button) convertView.findViewById(R.id.option1);

            listViewHolder.option2 = (Button) convertView.findViewById(R.id.option2);

            listViewHolder.option3 = (Button) convertView.findViewById(R.id.option3);

            listViewHolder.option4 = (Button) convertView.findViewById(R.id.option4);

            convertView.setTag(listViewHolder);

        }else{

            listViewHolder = (ViewHolder)convertView.getTag();

        }

        listViewHolder.Question.setText( listStorage.get(position).getQuestion());

        listViewHolder.option1.setText( listStorage.get(position).getOption1());

        listViewHolder.option2.setText( listStorage.get(position).getOption2());

        listViewHolder.option3.setText( listStorage.get(position).getOption3());

        listViewHolder.option4.setText( listStorage.get(position).getOption4());

        return convertView;

    }
    static class ViewHolder{

        TextView Question;

        Button option1;

        Button option2;

        Button option3;

        Button option4;
    }
}
*/