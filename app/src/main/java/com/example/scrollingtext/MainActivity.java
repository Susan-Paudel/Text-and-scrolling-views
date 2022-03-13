package com.example.scrollingtext;
//import required library
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//MinActivity child class inherit all the property of AppCompatActivity i.e. parent
public class MainActivity extends AppCompatActivity {
    //Activities have the ability,to restore themselves to a previous state using the data stored in this bundle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super keyword is used to refer parent class object
        super.onCreate(savedInstanceState);
        //it set the XML file as your main layout when the app starts
        setContentView(R.layout.activity_main);
    }
}