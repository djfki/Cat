package com.film.cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.film.cat.model.SimpleItem;

import java.util.ArrayList;

public class SmellActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smell);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("วิธีการกำจัดกลิ่นปัสสาวะแมว",
                "\n นับว่าเป็นปัญหาชวนปวดหัวของคนเลี้ยงน้องแมวไม่น้อยเมื่อในบ้านมีกลิ่นปัสสาวะแมวที่กำจัดอย่างไรก็ไม่หมดเสียที โดยปกติแมวมักจะปัสสาวะบนกระบะทรายอยู่แล้ว แต่ในบางกรณีก็อาจจะมีโอกาสทำเลอะเทอะภายในบ้านบ้าง ดังนั้นเราจึงควรเตรียมตัวดับกลิ่นแมวรับมือกันไว้ เพราะคงไม่ดีแน่ถ้ามีแขกมาเยี่ยมบ้านแล้วพบว่าบ้านเราอบอวลไปด้วยกลิ่นปัสสาวะแมวเต็มไปหมด ซึ่งการกำจัดปัญหากลิ่นแมวอย่างได้ผลนั้นบอกเลยว่าทำได้ไม่ยากอย่างที่คิด\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ขั้นตอนที่ 1 : รีบซับปัสสาวะแมวให้เร็วที่สุดด้วยกระดาษทิชชู่",
                "\n ข้อผิดพลาดแรกที่เจ้าของแมวทุกท่านพลาดคือปล่อยให้ปัสสาวะทิ้งไว้นานก่อนจะเริ่มต้นทำความสะอาด เมื่อปัสสาวะแมวแห้งแล้วจะมองเห็นยากทำให้มีโอกาสที่เราเผลอไม่ได้ทำความสะอาดไป ซึ่งปัสสาวะแมวที่หลงเหลือนั้นจะส่งกลิ่นปัสสาวะแมวและกระตุ้นให้แมวมาปัสสาวะซ้ำที่เดิมอีก ดังนั้นควรรีบทำความสะอาดตั้งแต่แรก ด้วยการนำกระดาษทิชชู่ (แผ่นใหญ่แบบที่ใช้ในห้องครัว) ซับบริเวณที่แมวปัสสาวะจนไม่มีน้ำปัสสาวะติดขึ้นมาอีก แต่อย่างไรก็ดีอย่าลืมหาสาเหตุด้วยว่าทำไมแมวถึงปัสสาวะนอกกระบะทราย ซึ่งส่วนหนึ่งอาจเกิดจากสาเหตุจากสุขภาพ เช่น โรคจากทางเดินปัสสาวะ ดังนั้นอย่าลืมบำรุงสุขภาพน้องแมวของเราให้แข็งแรงด้วยสารอาหารที่เหมาะกับแมวแต่ละวัย เพื่อการเติบโตอย่างแข็งแรง ไม่มีโรคต่างๆ มากวนใจ\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ขั้นตอนที่ 2 : ขจัดกลิ่นด้วยน้ำส้มสายชู",
                "\n นำน้ำส้มสายชูมาผสมกับน้ำในอัตราส่วนเท่าๆ กัน แล้วฉีดหรือพรมไปบริเวณที่แมวปัสสาวะ กรดในน้ำส้มสายชูจะทำปฏิกิริยากับปัสสาวะแมวทำให้ดับกลิ่นแมวหรือทำให้กลิ่นปัสสาวะแมวจางหายไปได้ หลังจากฉีดน้ำส้มสายชูให้นำแปรงสีฟันหรือแปรงขนอ่อนค่อยๆ ถูบริเวณที่มีปัสสาวะแมวก่อนที่จะใช้กระดาษทิชชู่ซับจนแห้งสนิท หรือถ้าใครมีผลิตภัณฑ์ทำความสะอาดและดับกลิ่นแมวชนิด Enzymatic Cleaner ก็สามารถใช้แทนน้ำส้มสายชูได้เช่นกัน\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ขั้นตอนที่ 3 : ทำความสะอาดด้วยเครื่องดูดฝุ่น",
                "\n ใช้เครื่องดูดฝุ่นดูดสิ่งสกปรกและฝุ่นผงบริเวณนั้นให้หมดเพื่อป้องกันอนุภาคกลิ่นปัสสาวะแมวที่ยังติดค้างอยู่ ถ้าเป็นเครื่องดูดฝุ่นที่สามารถดูดของเหลวได้ยิ่งดี และควรหลีกเลี่ยงการใช้ไดร์เป่าผมหรือเครื่องเป่าที่มีไอร้อนเป่าบริเวณที่เลอะปัสสาวะแมว เพราะความร้อนจะยิ่งทำให้อนุภาคของกลิ่นแมวติดแน่นกับเส้นใยของเฟอร์นิเจอร์หรือพื้นผิวต่างๆ มากขึ้น\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ขั้นตอนที่ 4 : เพิ่มความมั่นใจด้วยเบกกิ้งโซดา",
                "\n หลังเสร็จสิ้น 3 ขั้นตอนข้างต้น ให้นำเบกกิ้ง โซดาผสมกับน้ำ โดยกะดูให้เข้มข้นพอสมควร จากนั้นพรมหรือฉีดสเปรย์ใส่บริเวณที่เคยเปื้อนปัสสาวะเพื่อดับกลิ่นแมวอีกครั้ง เบกกิ้งโซดา หรือ โซเดียมไบคาร์บอเนต มีคุณสมบัติในการดูดซับกลิ่นแมวที่ดีมาก หลังฉีดแล้วให้รอจนแห้งแล้วดูดฝุ่นบริเวณนั้นซ้ำอีกครั้ง\n" +
                        "\n โดยปกติแล้วแมวมักจะปัสสาวะบนกระบะทราย แต่ถ้าแมวเริ่มปัสสาวะในที่อื่นของบ้านอาจหมายถึงกระบะทรายสกปรก มีน้อยเกินไป หรือวางในจุดที่ไม่เหมาะสม ลองค่อยๆ หาสาเหตุว่าทำไมแมวถึงปัสสาวะบริเวณอื่นในบ้านและแก้ไข เพราะบางทีสิ่งเล็กน้อยเหล่านี้อาจจะเป็นร่องรอยของความผิดปกติในระบบทางเดินปัสสาวะของแมว เช่น โรคนิ่ว ได้ ดังนั้นอย่าลืมสังเกตพฤติกรรมของพวกเขาอย่างใกล้ชิด และดูแลแมวของเราให้มีสุขภาพแข็งแรงในทุกวันๆ ด้วย\n" +
                        "\n"));
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {
        @NonNull
        @Override
        public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new CustomHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
            holder.tvText1.setText(mDataItem.get(position).getText1());
            holder.tvText2.setText(mDataItem.get(position).getText2());
        }

        @Override
        public int getItemCount() {
            return mDataItem.size();
        }
    }

    private class CustomHolder extends RecyclerView.ViewHolder {
        private final TextView tvText1;
        private final TextView tvText2;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            tvText1 = (TextView) itemView.findViewById(android.R.id.text1);
            tvText2 = (TextView) itemView.findViewById(android.R.id.text2);
        }
    }
}
