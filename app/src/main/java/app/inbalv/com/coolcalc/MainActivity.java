package app.inbalv.com.coolcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView disp;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disp = (TextView) findViewById(R.id.Result);

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


    public void Numclick(View sender){
        Button bt=(Button)sender;
     disp.append(bt.getText().toString());
        int op=0;
        if (bt.getText().toString().contentEquals("=")){
         String calc=disp.getText().toString();
            op=calc.indexOf("+");
            if (op >0) {
                int firstNum = Integer.parseInt(calc.substring(0, op - 1));
                int secondNum = Integer.parseInt(calc.substring(op + 1, calc.length()));
                int result = firstNum + secondNum;
                disp.setText(result);

            } else{
                op=calc.indexOf("-");
                int firstNum = Integer.parseInt(calc.substring(0, op - 1));
                int secondNum = Integer.parseInt(calc.substring(op + 1, calc.length()));
                int result = firstNum - secondNum;
                disp.setText(result);
            }
        }


        }

    public void Oplick(View view){
        disp.setText("I Love Math");
        counter=counter+1;
        if (counter==2) {
            disp.setText("0");
            counter=0;
        }
    }


}
