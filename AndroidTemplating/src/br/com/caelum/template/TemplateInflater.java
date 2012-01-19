package br.com.caelum.template;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TemplateInflater {
	private final Context context;
	private int contentId;
	private int viewGroupId;

	public TemplateInflater(Context	context) {
		this.context = context;
	}

	public InflaterWithContent apply(int contentId) {
		this.contentId = contentId;
		return new InflaterWithContent();
	}

	public class InflaterWithContent {
		
		public InflaterWithoutTemplate onViewGroup(int viewGroupId) {
			TemplateInflater.this.viewGroupId = viewGroupId;
			return new InflaterWithoutTemplate();
		}
	}
	
	public class InflaterWithoutTemplate {
		
		public View ofTemplate(int templateId) {
			LayoutInflater inflater = LayoutInflater.from(context);
			View root = inflater.inflate(templateId, null);
			
			View content = inflater.inflate(contentId, null);
			((ViewGroup)root.findViewById(viewGroupId)).addView(content);
			
			return root;
		}

	}
}
