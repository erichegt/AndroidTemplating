package br.com.caelum.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import br.com.caelum.template.TemplateInflater;

public class HomeActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TemplateInflater(this).apply(R.layout.home).onViewGroup(R.id.replace_here).ofTemplate(R.layout.template));
        
        addListenersToButtons();
    }

	private void addListenersToButtons() {
		findViewById(R.id.button_products).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, ProductsActivity.class));
			}
		});
        
        findViewById(R.id.button_promotions).setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		startActivity(new Intent(HomeActivity.this, PromotionsActivity.class));
        	}
        });
	}
}