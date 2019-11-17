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

public class AlarmActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("ทำไมแมวถึงปลุกเราตอนดึกกันนะ?",
                "\n ตามธรรมชาติ แมวจะใช้เวลานอน 16 – 20 ชั่วโมงต่อวัน ด้วยความที่แมวเป็นสัตว์ที่จัดอยู่ในประเภทนักล่าและก็เป็นผู้ถูกล่าด้วยเช่นกัน ทำให้แมวมีลักษณะการใช้ชีวิตแบบนอนกลางวันและตื่นในช่วงเย็นหรือกลางคืน ดังนั้นจึงไม่แปลกที่ขณะเจ้าของกำลังหลับอาจได้ยินเสียงแมวกวนในตอนกลางคืนได้\n" +
                        "\n สาเหตุส่วนใหญ่ที่แมวปลุกเจ้าของขึ้นมากลางดึก ก็อาจเป็นเพราะอยากชวนเจ้าของขึ้นมาเล่นด้วยกัน หรือหิวอยากได้อะไรมากินให้สบายใจ ตัวอย่างแมวที่ชอบร้องปลุกเจ้าของมาขอกินช่วงกลางดึกนั้น เช่นในช่วงของการเลี้ยงแมวแรกคลอด เพราะแมวแรกคลอดจะกินบ่อย โดยเจ้าของต้องมาป้อนนมกันทุกๆ 2-3 ชั่วโมง เลยทีเดียว บ้านไหนที่เพิ่งมีแมวเล็กก็ไม่ต้องกังวลไป แต่อาจจะต้องทำใจหน่อยในช่วงสัปดาห์แรกๆ ที่ลูกแมวคลอดออกมา\n" +
                        "\n สำหรับแมวที่โตเต็มวัยแล้ว หากคืนไหนที่นอนแมวว่างเปล่า เพราะแมวลุกออกมาเดินวนเวียน หรือส่งเสียงร้องมากกว่าปกติที่เคยเป็น เจ้าของอาจต้องคิดถึงปัญหาสุขภาพของน้องแมวเอาไว้ด้วย เพราะน้องแมวอาจจะเกิดปัญหาเจ็บป่วยบางอย่าง ซึ่งความผิดปกตินั้นเจ้าของก็สังเกตได้เองไม่ยาก โดยแมวไม่เพียงแต่จะร้องตอนกลางคืน แต่จะร้องมากในเวลากลางวันจนผิดปกติด้วยเช่นกัน หากเกิดความผิดปกติลักษณะนี้แนะนำให้พาน้องแมวไปพบคุณหมอเพื่อตรวจร่างกายเพิ่มเติม และหาสาเหตุความผิดปกติต่อไป\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("จัดการปัญหาแมวร้องกวนกลางดึก",
                "\n ปัญหาการเลี้ยงแมวที่ชอบร้องกวนตอนดึกไม่ใช่เรื่องยาก เรามีคำแนะนำให้ดังต่อไปนี้\n" +
                        "\n •\tเล่นกับแมวในช่วงเย็น โดยเลือกของเล่นเป็นพวกหนูปลอมตัวจิ๋ว หรือบอลลูกเล็กๆ ซัก 10-15 นาที ให้แมวได้ออกแรง\n" +
                        "\n •\tให้อาหารแมวก่อนเวลาเข้านอน เพราะแมวมักจะเข้านอนหลังอาหารค่ำแสนอร่อยมื้อ\n" +
                        "\n •\tเพิ่มกิจกรรมช่วงกลางวัน จะช่วยให้แมวร้องกวนตอนกลางคืนน้อยลง และนอนหลับได้ดี\n" +
                        "\n •\tลดปัญหาแมวปลุก แมวกวน ด้วยการหาเพื่อนแมวอีกสักตัวก็เป็นอีกหนึ่งวิธี ที่จะทำให้น้องแมวหันไปเล่นสนุกกันเอง และปล่อยเราให้นอนเงียบๆ บ้าง\n" +
                        "\n สำคัญที่สุดคือ หากน้องแมวร้องอยากเล่น หรือกวนเพราะหิว ต้องใจแข็งอย่าไปเล่นด้วย หรือเติมอาหารให้กลางดึก เพราะน้องแมวอาจจะเข้าใจผิดไปได้ว่าการที่แมวปลุก หรือแมวร้องกวน เจ้าของก็จะลุกขึ้นมาเล่นด้วย แถมยังตบรางวัลด้วยอาหาร แสนอร่อยชามโต แบบนี้ล่ะงานเข้ายาวทุกคืนแน่ๆ เลยล่ะ\n" +
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
