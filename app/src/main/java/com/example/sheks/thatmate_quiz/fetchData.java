package com.example.sheks.thatmate_quiz;

/*
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String question;
    public  int ansno;
    public  String option1;
    public  String option2;
    public  String option3;
    public  String option4;


    public int getAnsno() {
        return ansno;
    }

    public void setAnsno(int ansno) {
        this.ansno = ansno;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }


}




public class fetchData extends AsyncTask<Void,Void,Void> {
    String data ="";
    String dataParsed = "";
    String singleParsed ="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://api.myjson.com/bins/j5f6b");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null){
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONArray JA = new JSONArray(data);
            for(int i =0 ;i <JA.length(); i++){
                JSONObject JO = (JSONObject) JA.get(i);
                singleParsed =  "Name:" + JO.get("name") + "\n"+
                        "Password:" + JO.get("password") + "\n"+
                        "Contact:" + JO.get("contact") + "\n"+
                        "Country:" + JO.get("country") + "\n";

                dataParsed = dataParsed + singleParsed +"\n" ;


            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.data.setText(this.dataParsed);

    }
}


/*
public class fetchData extends AsyncTask <Void, Void, Void> {
    String data ="";
    String dataParsed = "";
    String singleParsed ="";

    public Question Q;

    public  Question[] QuizQuestion = new Question[5];

   /* public fetchData(Context context) {

        c = context;

    }*/
/*
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://api.myjson.com/bins/187t20");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            BufferedReader bufferedReader;
            String line="";
            String data="";
            String dataParsed = "";
            String singleParsed ="";


            try (InputStream inputStream = httpURLConnection.getInputStream()) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while(line!=null)
                {
                    line = bufferedReader.readLine();
                    data = data + line;
                }
            }


               JSONArray JA = new JSONArray(data);
            for(int i =0;i < JA.length(); i++){
                JSONObject JO = (JSONObject) JA.get(i);

                singleParsed =  "Question:" + JO.get("Question") + "\n"+
                        "Option1:" + JO.get("Option1") + "\n"+
                        "Option2:" + JO.get("Option2") + "\n"+
                        "Option3:" + JO.get("Option3") + "\n"+
                         "Option4:" + JO.get("Option4") + "\n";

                dataParsed = dataParsed + singleParsed +"\n" ;

               /* Q = new Question();
                Q.setQuestion (JO.getString("Question"));
                Q.setOption1(JO.getString("Option1"));
                Q.setOption2(JO.getString("Option2"));
                Q.setOption3(JO.getString("Option3"));
                Q.setOption4(JO.getString("Option4"));

                Q.setAnsno (JO.getInt("Answer"));

                QuizQuestion[i] =Q;

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }*/
/*
    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

         MainActivity.data.setText(this.dataParsed);

       // MainActivity.data.setText(Q.getQuestion());



    }
}*/
