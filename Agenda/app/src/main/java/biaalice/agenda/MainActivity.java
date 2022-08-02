package biaalice.agenda;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // PRIMEIRA EXECUÇÃO
        // Toast.makeText(this, "Bia Alice", Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_main);
    }
    
    
}
