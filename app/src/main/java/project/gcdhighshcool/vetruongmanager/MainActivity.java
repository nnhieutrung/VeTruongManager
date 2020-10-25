package project.gcdhighshcool.vetruongmanager;

import androidx.appcompat.app.AppCompatActivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private static String DB_URL = "34.92.244.48";
    private static String USER_NAME = "vetruongadmin";
    private static String PASSWORD = "vetruong123";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}