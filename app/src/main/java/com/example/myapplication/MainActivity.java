package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View view){
        String url = "";
        String login = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            String sql = "select * from Project.Users";

            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
