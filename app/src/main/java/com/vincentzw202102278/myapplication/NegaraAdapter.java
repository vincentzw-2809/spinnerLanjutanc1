package com.vincentzw202102278.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NegaraAdapter extends BaseAdapter {
    private Context _context;
    private List<String> _negaraList;

    public NegaraAdapter(Context _context,List<String> _negaraList){
        this._context = _context;
        this._negaraList =_negaraList;
    }

    @Override
public int getCount() {
        //return (negaraList !=null) ? negaraList.size() ; 0;
        if (_negaraList != null) {
            return  _negaraList.size();
        }
        else {
            return 0;
        }
    }

    @Override
    public Object getItem(int i) { return null;}

    @Override
    public long getItemId(int i) {return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(_context);
        view = inflater.inflate(R.layout.spinner_a, null);

        TextView textView1 = (TextView)view.findViewById(R.id.textview1);
        String negara = _negaraList.get(i);
        textView1.setText(negara);

        ImageView imageView1 = (ImageView)view.findViewById(R.id.imageView1);

        switch (negara) {
            case "Albaniaa":
                imageView1.setImageResource(R.drawable.albania);
                break;

            case "Belgiaa":
                imageView1.setImageResource(R.drawable.belgia);
                break;

            case "Hungariaa":
                imageView1.setImageResource(R.drawable.hungary);
                break;

            case "Iraan":
                imageView1.setImageResource(R.drawable.iran);
                break;

            case "Sloveniaa":
                imageView1.setImageResource(R.drawable.slovenia);
                break;
        }

        return view; }

}
