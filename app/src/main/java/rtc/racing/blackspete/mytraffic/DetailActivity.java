package rtc.racing.blackspete.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    // explicit
    private TextView titleTextview,detailTextview;
    private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //bindwidget
        bindWidget();
        //Show view
        showView();

    } // main medthod

    private void showView() {
        //การรับค่า จาก intent
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextview.setText(strTitle); //เอามาโชว์
        trafficImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.detail_long);
        detailTextview.setText(strDetail[intIndex]);

    }

    private void bindWidget() {
        titleTextview = (TextView) findViewById(R.id.textView4);
        detailTextview = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

    }
}// main class
