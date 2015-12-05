package rtc.racing.blackspete.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutmeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();


    }   // Main Method

    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.cow);
                buttonMediaPlayer.start();

                //Intent to webview
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/5Wn85Ge22FQ"));
                startActivity(objIntent);

            }   // event
        });
    }

    private void bindWidget() {


        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);







    }
}   // Main Class
