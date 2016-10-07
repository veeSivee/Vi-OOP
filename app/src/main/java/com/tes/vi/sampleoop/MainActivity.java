package com.tes.vi.sampleoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.tes.vi.sampleoop.stockbreeding.AnimalBehaviour;
import com.tes.vi.sampleoop.stockbreeding.Chicken;
import com.tes.vi.sampleoop.stockbreeding.Duck;
import com.tes.vi.sampleoop.stockbreeding.DuckData;
import com.tes.vi.sampleoop.stockbreeding.Lamb;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener ,View.OnClickListener{

    TextView tvHello, tvNote;
    Spinner mSpinner;
    Button btnSpeak;
    AnimalBehaviour mAnimal, mChicken,mDuck,mLamb;
    DuckData mHisDuckData;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        tvHello = (TextView)findViewById(R.id.tvHello);
        tvNote = (TextView)findViewById(R.id.tvNote);
        mSpinner = (Spinner)findViewById(R.id.spinner);
        btnSpeak = (Button)findViewById(R.id.btnSpeak);

        mSpinner.setOnItemSelectedListener(this);
        btnSpeak.setOnClickListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.list_animal, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

        mChicken = new Chicken();  //AnimalBehaviour reference, Chicken object == oveririding
        mDuck = new Duck();
        mLamb = new Lamb();

        HisDuck mHisDuck = new HisDuck("fishing");
        mHisDuckData = mHisDuck.dataHisDuck();

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                mAnimal = mChicken;
                break;

            case 1:
                mAnimal = mDuck;
                break;

            case 2:
                mAnimal = mLamb;
                break;

            default:
                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        data = mAnimal.speak();

        if(mAnimal==mDuck){
            String sound = mHisDuckData.getSound();
            String color = "I'm " + mHisDuckData.getColor();
            String hoby = "My hoby is " + mHisDuckData.getHoby();

            data = sound + "\n" + color + "\n" + hoby;
        }

        tvNote.setText(data);
    }
}
