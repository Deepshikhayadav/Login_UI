package com.smarthub.login_ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Login extends Fragment {
EditText email, pass;
TextView text;
Button login;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Login.
     */
    // TODO: Rename and change types and number of parameters
    public static Login newInstance(String param1, String param2) {
        Login fragment = new Login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup=(ViewGroup) inflater.inflate(R.layout.fragment_login, container, false);
        email=viewGroup.findViewById(R.id.email);
        pass=viewGroup.findViewById(R.id.password);
        text=viewGroup.findViewById(R.id.forgotPass);
        login=viewGroup.findViewById(R.id.login);

        email.setTranslationX(300);
        email.setAlpha(0);
        email.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        pass.setTranslationX(300);
        pass.setAlpha(0);
        pass.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        text.setTranslationX(300);
        text.setAlpha(0);
        text.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        login.setTranslationX(300);
        login.setAlpha(0);
        login.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        return viewGroup;
    }
}