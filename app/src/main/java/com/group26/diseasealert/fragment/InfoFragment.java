package com.group26.diseasealert.fragment;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.group26.diseasealert.R;

import org.w3c.dom.Text;

public class InfoFragment extends Fragment {

    private ImageView imageView;

    private String type;

    public InfoFragment() {
        // Required empty public constructor
    }

    public static InfoFragment newInstance(String disease) {
        InfoFragment fragment = new InfoFragment();
        Bundle args = new Bundle();
        args.putString("disease", disease);


        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        type = getArguments().getString("disease");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        imageView = (ImageView) rootView.findViewById(R.id.image_info);
        TextView title = (TextView) rootView.findViewById(R.id.image_title);
        TextView description = (TextView) rootView.findViewById(R.id.image_description);
        final TextView spread1 = (TextView) rootView.findViewById(R.id.spread1);
        final TextView spread2 = (TextView) rootView.findViewById(R.id.spread2);
        final TextView spread3 = (TextView) rootView.findViewById(R.id.spread3);
        final TextView sym = (TextView) rootView.findViewById(R.id.sym);
        final TextView sym1 = (TextView) rootView.findViewById(R.id.sym1);
        final TextView sym2 = (TextView) rootView.findViewById(R.id.sym2);
        final TextView sym3 = (TextView) rootView.findViewById(R.id.sym3);
        final TextView sym4 = (TextView) rootView.findViewById(R.id.sym4);
        final TextView sym5 = (TextView) rootView.findViewById(R.id.sym5);
        final TextView treat1 = (TextView) rootView.findViewById(R.id.treat1);
        final TextView treat2 = (TextView) rootView.findViewById(R.id.treat2);
        final TextView treat3 = (TextView) rootView.findViewById(R.id.treat3);
        final TextView treat4 = (TextView) rootView.findViewById(R.id.treat4);
        final TextView treat5 = (TextView) rootView.findViewById(R.id.treat5);

        if (type.equals("Measles")) {
            imageView.setImageResource(R.drawable.measles);
            title.setText("Measles");
            description.setText("Measles is an airborne disease which spreads easily through the coughs and sneezes of those infected. It may also be spread through contact with saliva or nasal secretions. Nine out of ten people who are not immune and share living space with an infected person will catch it. People are infectious to others from four days before to four days after the start of the rash. People usually do not get the disease more than once. There's no treatment to get rid of an established measles infection, but over-the-counter fever reducers or vitamin A may help with symptoms.");
            spread1.setText("By airborne respiratory droplets (coughs or sneezes)");
            spread2.setText("By saliva (kissing or shared drinks)");
            spread3.setText("By mother to baby by pregnancy, labor, or nursing.");
            sym1.setText("Fatigue and pain in the muscles");
            sym2.setText("Runny nose and sneezing");
            sym3.setText("Sore throat with a dry cough");
            sym4.setText("Fever and skin rash");
            sym5.setText("Loss of appetite");
            treat1.setText("There's no treatment to get rid of an established measles infection, but over-the-counter fever reducers or vitamin A may help with symptoms.");
            treat2.setText("Pain reliever: Acetaminophen (Tylenol)");
            treat3.setText("Fever reducers");
            treat4.setText("MMR vaccine");
        }

        final ImageView plus2 = (ImageView) rootView.findViewById(R.id.plus2);

        View.OnClickListener onClickListener1 = new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if (sym1.isShown()) {
                    plus2.setBackground(getResources().getDrawable(R.drawable.plus));
                    sym1.setVisibility(View.GONE);
                    sym2.setVisibility(View.GONE);
                    sym3.setVisibility(View.GONE);
                    sym4.setVisibility(View.GONE);
                    sym5.setVisibility(View.GONE);
                } else {
                    plus2.setBackground(getResources().getDrawable(R.drawable.minus));
                    sym1.setVisibility(View.VISIBLE);
                    sym2.setVisibility(View.VISIBLE);
                    sym3.setVisibility(View.VISIBLE);
                    sym4.setVisibility(View.VISIBLE);
                    sym5.setVisibility(View.VISIBLE);
                }
            }
        };
        sym.setOnClickListener(onClickListener1);
        plus2.setOnClickListener(onClickListener1);

        final ImageView plus3 = (ImageView) rootView.findViewById(R.id.plus3);
        final TextView treat = (TextView) rootView.findViewById(R.id.treat);

        View.OnClickListener onClickListener2 = new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if (treat1.isShown()) {
                    plus3.setBackground(getResources().getDrawable(R.drawable.plus));
                    treat1.setVisibility(View.GONE);
                    treat2.setVisibility(View.GONE);
                    treat3.setVisibility(View.GONE);
                    treat4.setVisibility(View.GONE);
                    treat5.setVisibility(View.GONE);
                } else {
                    plus3.setBackground(getResources().getDrawable(R.drawable.minus));
                    treat1.setVisibility(View.VISIBLE);
                    treat2.setVisibility(View.VISIBLE);
                    treat3.setVisibility(View.VISIBLE);
                    treat4.setVisibility(View.VISIBLE);
                    treat5.setVisibility(View.VISIBLE);
                }
            }
        };
        treat.setOnClickListener(onClickListener2);
        plus3.setOnClickListener(onClickListener2);
        final ImageView plus1 = (ImageView) rootView.findViewById(R.id.plus1);
        final TextView spread = (TextView) rootView.findViewById(R.id.spread);

        View.OnClickListener onClickListener3 = new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if (spread1.isShown()) {
                    plus1.setBackground(getResources().getDrawable(R.drawable.plus));
                    spread1.setVisibility(View.GONE);
                    spread2.setVisibility(View.GONE);
                    spread3.setVisibility(View.GONE);
                } else {
                    plus1.setBackground(getResources().getDrawable(R.drawable.minus));
                    spread1.setVisibility(View.VISIBLE);
                    spread2.setVisibility(View.VISIBLE);
                    spread3.setVisibility(View.VISIBLE);
                }
            }
        };
        spread.setOnClickListener(onClickListener3);
        plus1.setOnClickListener(onClickListener3);

        return rootView;
    }

}
