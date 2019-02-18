package Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class ExpandableAdapter extends BaseExpandableListAdapter {
    private String[] documentTitles = {"Step 1:Driver License", "Step 2:Vehicle Insurance", "Step 3:Vehicle Permit", "Vehicle Registration", "Vehicle Tax"};
    private String[][] documentDescription = {{"1.Please upload your Driving licence", "2.Please upload your vehicle documents"}, {"1.Please upload your Driving licence", "2.Please upload your vehicle documents"}, {"1.Please upload your Driving licence", "2.Please upload your vehicle documents"}, {"1.Please upload your Driving licence", "2.Please upload your vehicle documents"}, {"1.Please upload your Driving licence", "2.Please upload your vehicle documents"}};

    private Context context;

    public ExpandableAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return documentTitles.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return documentDescription[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return documentTitles[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return documentDescription[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        TextView txtDocumentTitles = new TextView(context);
        txtDocumentTitles.setText(documentTitles[groupPosition]);
        txtDocumentTitles.setPadding(80, 100, 0, 100);
        txtDocumentTitles.setTextColor(Color.parseColor("#efe1884c"));
        return txtDocumentTitles;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        TextView txtDocumentDescriptions = new TextView(context);
        txtDocumentDescriptions.setText(documentDescription[groupPosition][childPosition]);
        txtDocumentDescriptions.setTextColor(Color.parseColor("#5d6367"));
        return txtDocumentDescriptions;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}