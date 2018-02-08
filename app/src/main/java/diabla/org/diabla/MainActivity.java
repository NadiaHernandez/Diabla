package diabla.org.diabla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MalditoVirustt
        findViewById(R.id.enviar).setOnClickListener(new.view.onclicklistener ());

        Toast.makeText(getApplicationContext(),"Tu mensaje se envio!",Toast.LENGTH_LONG,).show();

    }
}
