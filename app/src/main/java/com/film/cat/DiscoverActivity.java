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

import java.net.CookieHandler;
import java.util.ArrayList;

public class DiscoverActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("โรคไข้หัดแมว",
                "\n เกิดจากการติดเชื้อไวรัส Feline parvovirus ทำให้ลูกแมวท้องเสีย มีอาการซึม เบื่ออาหาร มีไข้สูง อาเจียน หรือถ้าลูกแมวท้องเสียแบบมีเลือดปนในอึออกมา เชื้อโรคจะมีผลต่อสมอง ทำให้การทรงตัวผิดปกติไป นอกจากนี้ยังทำให้ลูกแมวตาบอด และรุนแรงถึงขั้นเสียชีวิตได้ โรคนี้ติดต่อได้ง่ายหากลูกแมวไปสัมผัสอึ ฉี่ และใช้ของรวมกับแมวป่วย ซึ่งลูกแมวในช่วงอายุระหว่าง 2-6 เดือน จัดว่าอยู่ในกลุ่มเสี่ยงที่จะป่วยเป็นโรคนี้ได้ง่าย\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("โรคหวัดแมว",
                "\n จากชื่อโรคก็ทำให้เราพอจะเดากันได้ไม่ยาก ว่าโรคนี้ทำให้แมวเป็นหวัด ที่สำคัญโรคนี้เกิดได้จากการติดเชื้อหลายชนิด เช่น Feline herpesvirus และ Feline calicivirus แค่สูดดมไวรัสที่กระจายมาในอากาศก็ติดโรคได้แล้ว อาการเด่นที่เห็นได้ชัดคือ ลูกแมวเป็นหวัด และแสดงอาการต่างๆ เกี่ยวกับหวัดออกมา เช่น ไอ จาม มีน้ำมูก ตาอักเสบ มีแผลหลุมในปาก หรือบางตัวเป็นรุนแรงอาจเกิดปอดอักเสบตามมา\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("โรคมะเร็งเม็ดเลือดขาวในแมว",
                "\n เกิดจากเชื้อ Feline Leukemia Virus (FeLV) ซึ่งไวรัสจะเข้าทำลายจนทำให้ภูมิคุ้มกันเสียหาย หากเป็นโรคแล้วก็ไม่สามารถรักษาได้หายขาด ทำได้เพียงการรักษาตามอาการ สามารถติดต่อจากแม่แมวไปยังลูกแมวได้ ผ่านน้ำลายและสิ่งคัดหลั่ง ช่วงแรกของโรคอาจสังเกตเห็นว่าเริ่มมีอาการซึม และพบว่าลูกแมวท้องเสีย จากนั้นอาจมีอาการอื่น ๆ ตามมา เช่น ตัวซีดเหลือง ไม่มีแรง ขนหยาบ น้ำหนักตัวลด ลูกแมวท้องเสียเรื้อรัง ช่องปากอักเสบ\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("โรคเยื่อบุช่องท้องอักเสบติดต่อ",
                "\n โรคนี้จัดว่าเป็นโรคที่น่ากลัวมากๆ สำหรับเจ้าของลูกแมวหลายๆ คน ซึ่งเกิดจากเชื้อโคโรนาไวรัส Feline Coronavirus (FCoV) ยังไม่มีการรักษาใดที่ได้ผล 100% โรคนี้ติดต่อง่ายผ่านทางน้ำลาย อุจจาระ และการใช้ของร่วมกับแมวป่วย ลูกแมวที่ป่วยระยะแรกอาจดูซึม ผอมลง อาจพบอาการท้องบวมน้ำ เพราะมีของเหลวสะสมในช่องท้อง หรือ/และ ช่องอก และรุนแรงถึงขั้นเสียชีวิตได้ภายในระยะเวลาอันสั้น พบได้ในลูกแมวอายุตั้งแต่ 3 เดือนถึง 3 ปี ที่เลี้ยงน้องแมวแออัดมากกว่าเลี้ยงตัวเดียว\n" +
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
