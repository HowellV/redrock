package com.example.howell.mylistview;

import android.content.ClipData;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class League extends AppCompatActivity {
    private String[] data = {
            "中村 悠一（Nakamura Yuuichi）",
            "宮野 真守（Miyano Mamoru）",
            "福山 潤（Fukuyama Jun）",
            "小野 大輔（Ono Daisuke）",
            "梶 裕貴（Kaji Yuki）",
            "浪川 大輔（Namikawa Daisuke）",
            "神谷 浩史（Kamiya Hiroshi）",
            "杉田 智和（Sugita Tomokazu）",
            "水樹 奈々（Mizuki Nana）",
            "花澤 香菜（Hanazawa Kana）",
            "釘宮 理恵（Kugimiya Rie）",
            "田中 敦子（Tanaka Atsuko）",
            "沢城 みゆき（Sawashiro Miyuki）",
            "茅野 愛衣（Kayano Ai）",
            "田村 ゆかり（Tamura Yukari）",
            "堀江 由衣（Horie Yui）",
            ""

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        ListView mlistview = (ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(League.this,R.layout.list_item,data);
        mlistview.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_league, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
