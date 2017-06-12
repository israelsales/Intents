package dominando.android.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acao);

        TextView textView = (TextView)findViewById(R.id.textViewAcao);
        Intent intent = getIntent();
        if(intent.getAction().equals(Intent.ACTION_VIEW)){
            Uri uri = intent.getData();
            textView.setText("Ação customizada 2."
                    +"Uri: " + uri.toString()
                    +"Host: "+ uri.getHost()
                    +"Path: "+ uri.getPath());
        }else if(intent.getAction().equals("dominando.android.ACAO_CUSTOMIZADA")){
            textView.setText("Acção customizada 1");
        }
    }
}
