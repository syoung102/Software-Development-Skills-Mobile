package com.example.listapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

// 데이터의 원본을 받아 관리, 어댑터뷰가 출력할 수 있는 형태로 데이터를 제공하는 중간 객체 역할
public class ItemAdapter extends BaseAdapter{

    LayoutInflater mInflater;
    /* 앱이 실행 될 때 XML 레이아웃의 내용이 메모리에 객체화되고
    객체화된 XML 레이아웃을 소스파일에서 사용한다.
    이때 xml 레이아웃의 내용이 객체화 되는 과정을 inflation 이라고 함.
    */

    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d) {
        items = i;
        prices = p;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // 자동으로 생성된 xml이 아닌 user가 추가로 만든 xml 객체화
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        String name = items[i];
        String desc = descriptions[i];
        String cost = prices[i];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        priceTextView.setText(cost);

        return v;
    }
}
