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

public class ColdActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("รู้ทันโรคหวัดแมว",
                "\n ไม่ใช่แค่คนอย่างเราที่พอเจอเข้ากับอากาศที่เปลี่ยนแปลงบ่อย เดี๋ยวร้อนจัด สลับฝนตก ก็อาจจะทำให้ร่างกายอ่อนแอจนติดเชื้อโรคและป่วยเป็นหวัดได้ รู้หรือไม่ว่าแมวก็มีโอกาสที่จะเป็นหวัดได้ไม่ต่างจากคนเรา แม้ว่าสาเหตุจะเกิดจากการติดเชื้อไวรัส หรืออาจติดจากแบคทีเรียคนละชนิดกับคน (ดังนั้นจึงไม่ต้องกังวลไปว่าแมวเป็นหวัดแล้วจะมาติดเรา) แต่เมื่อแมวเป็นหวัดแล้วก็อาจติดต่อในหมู่แมวกันเองได้ ซึ่งโรคหวัดแมวนี้เป็นได้ในแมวเด็กและแมวที่โตเต็มวัย มารู้ให้ทันโรคหวัดแมว จะได้รู้จักสังเกตอาการและป้องกันแมวแสนรักของเราให้ปลอดภัยจากหวัดแมวกันดีกว่า\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("สาเหตุของหวัดแมว",
                "\n โรคหวัดแมวเกิดจากเชื้อไวรัสที่จําเพาะในแมว ได้แก่ Feline Herpesvirus (FHV) และ Feline Calici Virus (FCV) รวมทั้งอาจมีการติดเชื้อเกี่ยวกับระบบทางเดินหายใจอื่นๆ ร่วมด้วย โรคหวัดแมวสามารถเป็นได้ในแมวทุกวัย แต่อาการจะรุนแรงในลูกแมว และแมวที่อ่อนแอ\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("สัญญาณเตือนหวัดแมว",
                "\n หากเราสังเกตเห็นแมวของเรามีอาการต่อไปนี้ ให้ระวังเอาไว้ เพราะนี่เป็นสัญญาณที่บอกว่าแมวสุขภาพดีแสนน่ารักของเรา อาจกลายเป็นแมวเป็นหวัดไปแล้ว\n" +
                        "\n • ซึม เบื่ออาหาร : อาการเริ่มต้นที่สังเกตเห็นได้อย่างชัดเจนเมื่อแมวเริ่มป่วย แม้จะยังไม่เฉพาะเจาะจงว่าเป็นโรคอะไร แต่ก็เป็นสัญญาณที่ต้องให้ความสำคัญและคอยสังเกตเอาไว้\n" +
                        "\n • จาม มีน้ำมูก : แมวเป็นหวัดอาจพบว่ามี น้ำมูกใส หรือข้นเขียว มีอาการจาม ซึ่งแล้วแต่ความรุนแรงของโรค อาการเหล่านี้จะเป็นตัวบ่งบอกว่าทางเดินหายใจมีปัญหาแล้ว\n" +
                        "\n • ไอ : แมวที่ป่วยอาจมีอาการไอ ซึ่งพบทั้งอาการไอร่วมกับมีเสมหะหรือไม่มีเสมหะก็ได้ ซึ่งนี่อาจหมายถึงการเกิดคอ จนถึงปอดและหลอดลมอักเสบได้\n" +
                        "\n • น้ำตาไหล : ในกรณีที่แมวเป็นหวัดแบบรุนแรงขึ้นอาจพบว่ามีขี้ตาเยอะ ตาขาวบวมแดง ตาบวมจนปิด น้ำตาไหล\n" +
                        "\n • ลิ้น เหงือก และช่องปากอักเสบ : แมวที่เป็นหวัดอาจจะกินอาหารลดลง หรือไม่กินอาหาร นั่นก็เพราะเมื่อลองเปิดปากแมวเป็นหวัดดู อาจพบว่ามีแผลหลุมในช่องปากที่เป็นสาเหตุให้แมวที่ป่วยด้วยโรคหวัดแมวกินน้อยลงได้\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("รักษาหวัดแมว",
                "\n หากสังเกตพบอาการต่างๆ ดังที่กล่าวมา ควรรีบพาแมวไปพบคุณหมอ โดยคุณหมอจะทำการตรวจร่างกาย และวินิจฉัยโรค หากแมวเป็นหวัดคุณหมอจะให้ยารักษาตามอาการ เช่น ให้ยาป้ายตาในกรณีที่มีตาบวม น้ำตาไหล ให้ยาลดน้ำมูกและเสมหะ เป็นต้น\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ป้องกันหวัดแมว",
                "\n สิ่งที่ดีที่สุดสำหรับการเอาชนะโรคหวัดแมวคือ การป้องกันโรค ทำได้ง่ายๆ ด้วยการเสริมภูมิคุ้มกันที่แข็งแรงให้แมวของเราจากการทำวัคซีน เพื่อสร้างและกระตุ้นการทำงานของระบบภูมิคุ้มกันให้แมวของเราตั้งแต่เด็ก วัคซีนที่ให้คือ วัคซีนรวมในแมว ได้แก่ วัคซีนป้องกันโรคหัดและหวัดแมว แนะนำให้เริ่มทำได้ตั้งแต่น้องแมวอายุ 8 สัปดาห์ขึ้นไป โดยคุณหมอจะนัดฉีดให้ครบตามโปรแกรมและนัดฉีดกระตุ้นเป็นประจำทุก ๆ ปี\n" +
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
