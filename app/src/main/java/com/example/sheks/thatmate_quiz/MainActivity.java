package com.example.sheks.thatmate_quiz;


import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.sheks.thatmate_quiz.models.Question;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //the URL having the json data
    private static final String JSON_URL = "https://api.myjson.com/bins/xqe0o";
    ArrayList<Question> questionList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing listview and hero list
       // listView = findViewById(R.id.listView);

        questionList = new ArrayList<>();
        loadHeroList();

        Button b1 = findViewById(R.id.quiz);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                intent.putParcelableArrayListExtra("questions",questionList);
                //intent.putExtra("questions",  questionList);
                startActivity(intent);

            }
        });





        //creating custom adapter object
       // ListViewAdapter adapter = new ListViewAdapter(questionList, getApplicationContext());

        //adding the adapter to listview
       // listView.setAdapter(adapter);
    }

    private void loadHeroList() {
        //getting the progressbar
        final ProgressBar progressBar = findViewById(R.id.progressBar);


        //making the progressbar visible
        progressBar.setVisibility(View.VISIBLE);

        //creating a string request to send request to the url
        StringRequest stringRequest = new StringRequest(Request.Method.GET, JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //hiding the progressbar after completion
                        progressBar.setVisibility(View.INVISIBLE);
                        try {


                            //getting the whole json object from the response
                            JSONObject obj = new JSONObject(response);

                            //we have the array named hero inside the object
                            //so here we are getting that json array
                            JSONArray jsonArray = obj.getJSONArray("Questions");

                            //now looping through all the elements of the json array
                            for (int i = 0; i < jsonArray.length(); i++) {
                                //getting the json object of the particular index inside the array
                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                //creating a hero object and giving them the values from json object
                                questionList.add(i, new Question(jsonObject.getString("Question"), jsonObject.getString("Option1"), jsonObject.getString("Option2"), jsonObject.getString("Option3"), jsonObject.getString("Option4"), jsonObject.getInt("Answer")));

                                //adding the hero to herolist
                                //questionList.set(i,question);
                                Log.i("question",questionList.get(i).getQuestion());

                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });

        //creating a request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //adding the string request to request queue
        requestQueue.add(stringRequest);

    }
}