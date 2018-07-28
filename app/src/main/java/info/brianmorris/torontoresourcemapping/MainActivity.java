package info.brianmorris.torontoresourcemapping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toolbar;

import me.wiman.listener.WimanSDK;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageButton btnFood;
    private ImageButton btnMedical;
    private ImageButton btnShelter;
    private ImageButton btnWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.Toolbar);
        toolbar.setTitle("Find Resources");

        btnFood = (ImageButton)this.findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                OpenMapActivity();
            }
        });

        btnMedical = (ImageButton)this.findViewById(R.id.btnMedical);
        btnMedical.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                OpenMapActivity();
            }
        });

        btnShelter = (ImageButton)this.findViewById(R.id.btnShelter);
        btnShelter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                OpenMapActivity();
            }
        });

        btnWifi = (ImageButton)this.findViewById(R.id.btnWifi);
        btnWifi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                OpenMapActivity();
            }
        });

//        WimanSDK.initialize(this, "bfb220da-d27e-26d1-6dd0-39b4c12df6f7");
//        WimanSDK.showOptin(this);

    }

    private void OpenMapActivity() {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}