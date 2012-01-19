package br.com.caelum.activity;

import br.com.caelum.template.TemplateInflater;
import android.app.Activity;
import android.os.Bundle;

public class PromotionsActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new TemplateInflater(this).apply(R.layout.promotions)
				.onViewGroup(R.id.replace_here).ofTemplate(R.layout.template));
	}
}
