package com.example.firebaserealtimedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//        DatabaseReference myRef = database.getReference("UserInfo");
//        POJO pojo=new POJO("Vanshika","Sikarwar");
//        myRef.setValue(pojo);
//        DatabaseReference myRef1= database.getReference("StudentInfo");
//        POJO pojo1=new POJO("Vanshika","Sikarwar");
//        myRef1.setValue(pojo1);
        DatabaseReference ref= database.getReference("root");
        String key=ref.push().getKey();
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("Username","Vanshika Sikarwar");
        hashMap.put("Password","12345");
        ref.child(key).setValue(hashMap);

//        myRef.setValue("Hello, Gourav!");
    }
}