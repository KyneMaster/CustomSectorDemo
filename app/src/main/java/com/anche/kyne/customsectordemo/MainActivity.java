package com.anche.kyne.customsectordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomSector arcView = (CustomSector) findViewById(R.id.custom);
        List<Times> times = new ArrayList<>();
        Times t1 = new Times();//这个类就只有两个变量
        t1.setHour(7);
        t1.setText("爱咋咋地");
        times.add(t1);
        Times t2 = new Times();
        t2.setHour(3);
        t2.setText("安车检测");
        times.add(t2);
        //初始化适配器
        CustomSector.ArcViewAdapter myAdapter = arcView.new ArcViewAdapter<Times>() {
            @Override
            public double getValue(Times times) {
                return times.getHour();
            }

            @Override
            public String getText(Times times) {
                return times.getText();
            }
        };
        myAdapter.setData(times);//绑定数据

    }
}
