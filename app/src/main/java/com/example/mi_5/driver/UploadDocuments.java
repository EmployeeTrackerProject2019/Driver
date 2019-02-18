package com.example.mi_5.driver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class UploadDocuments extends AppCompatActivity {
    private CardView cardView,cardView1;
    private ImageButton imgShowDriverLicence,imgShowVehicleInsurance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_documents);
        Toolbar toolbar = findViewById(R.id.UpDocumentsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        cardView = findViewById(R.id.CardItems);
        cardView1 = findViewById(R.id.CardUploadVehicleInsuranceDetails);
        imgShowDriverLicence = findViewById(R.id.imgDvLicence);
        imgShowVehicleInsurance = findViewById(R.id.imgShowVehicleInsurance);

        imgShowDriverLicence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardView.getVisibility() == View.GONE) {
                    imgShowDriverLicence.setImageResource(R.drawable.ic_arrow_up);
                    cardView.setVisibility(View.VISIBLE);
                } else {
                    cardView.setVisibility(View.GONE);
                    imgShowDriverLicence.setImageResource(R.drawable.ic_arrow_down);

                }
            }
        });

        imgShowVehicleInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardView1.getVisibility() == View.GONE) {
                    cardView1.setVisibility(View.VISIBLE);
                    imgShowVehicleInsurance.setImageResource(R.drawable.ic_arrow_up);

                } else {
                    cardView1.setVisibility(View.GONE);
                    imgShowVehicleInsurance.setImageResource(R.drawable.ic_arrow_down);

                }
            }
        });

    }

}
