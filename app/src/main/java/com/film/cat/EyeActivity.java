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

public class EyeActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("ปัญหาเรื่องตาของน้องแมว",
                "\n ไม่ว่าจะเป็นเจ้าของน้องแมวคนไหน ถ้าเจอน้องแมวส่งสายตาปิ๊งๆ ให้ รับรองว่าใจละลายกันทุกคน แต่ถ้าวันดีคืนดีสายตาที่ส่งมาจากกระจกตาใสๆ ดูผิดปกติไป สังเกตเห็นได้จากอาการต่างๆ ไม่ว่าจะเป็น อาการหรี่ตา มีน้ำตาไหล แมวตาแดง แมวตาบวม มีขี้ตาเกรอะกรัง เกิดกระจกตาขุ่น แมวน้ำตาไหล แมวมีอาการเกาตาบ่อยกว่าปกติ หรือมีอาการหลายๆ อย่างประกอบกัน ซึ่งปัญหาเหล่านี้อาจเกิดจากการเล่น การต่อสู้ของน้องแมว จนพลาดพลั้งไปโดนกระจกตาจนเป็นแผล หรืออาจเกิดจากโรคต่างๆ ที่เกิดกับน้องแมวได้ ซึ่งถ้าเจ้าของหมั่นสังเกตความผิดปกติที่ตาแมว แล้วพาไปหาคุณหมอได้ทันเวลา เรื่องเล็กๆ จะไม่ลุกลามเป็นเรื่องใหญ่ จนอาจเสียดวงตาใสๆ ไปได้ ปัญหาเรื่องตาแมวที่พบได้บ่อยมีอะไรบ้าง มาติดตามอ่านกันต่อได้เลย\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("แมวตาแดง แมวตาบวม",
                "\n เกิดได้จากการอักเสบติดเชื้อที่ส่วนต่างๆ ของตา เช่น เปลือกตา ตาขาว ตาดำ การถูกสารเคมี หรือมีสิ่งแปลกปลอมเข้าตา หรืออาจเกิดจากการติดเชื้อไวรัสไข้หวัดแมว โดยจะเห็นว่าขอบตาแมวบวม แมวตาแดง และมีอาการคันตา แมวเอาหน้าไถกับพื้นหรือไถตามสิ่งของ จนทำให้เยื่อตาขาวอักเสบและมีการติดเชื้อแบคทีเรียที่ตาแทรกซ้อนตามมาได้\n" +
                        "\n ดูแลอย่างไร : หากพบว่าแมวมีอาการดังกล่าวควรรีบพาไปพบคุณหมอ เพื่อวินิจฉัยสาเหตุและให้การรักษาอย่างถูกต้อง และใส่ลำโพงเพื่อป้องกันไม่ให้แมวเกาตา หรือเอาหน้าไปถูพื้นหรือสิ่งของ ซึ่งอาจทำให้เกิดการระคายเคืองเพิ่มได้ ที่สำคัญไม่ควรซื้อยามาหยอดเอง เพราะอาจไม่หายและมีอาการหนักขึ้นหากไม่ได้รับการรักษาที่สาเหตุการเกิดที่แท้จริง\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("แมวน้ำตาไหล",
                "\n มีหลายสาเหตุที่ทำให้แมวมีน้ำตาไหลมากกว่าปกติ ไม่ว่าจะเป็นปัญหาท่อน้ำตาอุดตัน การผลิตน้ำตามากกว่าปกติ การอักเสบของดวงตา การเกิดแผลหลุม รวมทั้งการระคายเคืองต่างๆ แมวที่น้ำตาไหลมากจะพบว่ามีคราบน้ำตาที่หัวตา หรือมีคราบน้ำตาเป็นสีน้ำตาลแดงติดเป็นทางบริเวณหัวตา\n" +
                        "\n ดูแลอย่างไร : ควรพาน้องแมวไปพบคุณหมอ เพื่อวินิจฉัยและประเมินการรักษาจากสาเหตุ เพื่อที่จะรักษาได้อย่างตรงจุด โดยไม่ควรซื้อยามาหยอดเอง\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("แมวตาขุ่นขาว",
                "\n เป็นความผิดปกติที่เกิดได้จากหลากหลายสาเหตุ เช่น เกิดจากตาแมวมีแผลที่กระจกตาที่เกิดจากการต่อสู้หรือเล่นกัน เกิดจากต้อหิน การเสื่อมของกระจกตาทำให้เกิดการบวมน้ำ นอกจากนี้ยังเกิดได้ในแมวอายุมาก รวมทั้งแมวที่ป่วยด้วยโรคเบาหวาน จึงจำเป็นต้องให้คุณหมอตรวจเพื่อวินิจฉัยหาสาเหตุที่แท้จริงต่อไป\n" +
                        "\n ดูแลอย่างไร : หากสังเกตว่าแมวมีอาการผิดปกติ อย่านิ่งนอนใจ ควรใส่ลำโพงป้องกันไม่ให้แมวเกาตา และพาน้องแมวไปพบคุณหมอ เพื่อวินิจฉัยและการรักษา ซึ่งในกรณีนี้อาจใช้เวลาในการรักษาที่ยาวนาน และต้องพาแมวไปพบคุณหมออย่างต่อเนื่อง หากไม่ได้รับการรักษาอย่างถูกวิธีอาจสูญเสียการมองเห็นได้\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("สีตาเปลี่ยนไป",
                "\n หากใครเลี้ยงน้องแมวตั้งแต่ยังเป็นลูกแมวตัวจิ๋วน่าจะเคยสังเกตกันบ้างแล้วว่า ลูกแมวน้อยทุกตัวจะมีดวงตาสีฟ้าเมื่อมีอายุได้ 10 วัน ไปจนกระทั่งแมวอายุได้ 6-7 สัปดาห์ สีของดวงตาก็จะค่อยๆ เปลี่ยนไป กลายเป็นสีตาของจริง ที่จะคงอยู่ตลอดไป แต่ในบางครั้งเราอาจพบว่าม่านตาของแมวที่โตเต็มวัย มีจุดหรือปื้นสีน้ำตาลที่เกิดขึ้นมา เรียกว่า ไอริส เมลาโนซิส ซึ่งทั่วไปไม่ส่งผลใดต่อการมองเห็น แต่หากมีขนาดใหญ่มาก อาจทำให้ม่านตาทำงานผิดปกติ และทำให้เกิดปัญหาต่อหิน เพราะทำให้ความดันในลูกตาสูงขึ้นกว่าปกติ แต่หากปัญหาที่พบเป็น ไอริส เมลาโนม่า หรือ มะเร็งที่ม่านตา กรณีนี้จัดว่าอันตรายต่อน้องแมวมากๆ เลยทีเดียว\n" +
                        "\n ดูแลอย่างไร : ถ้าเห็นจุดสีที่เกิดขึ้นบนตาน้องแมวก็อย่างนิ่งนอนใจ รีบพาไปตรวจตาเพื่อให้คุณหมอวินิจฉัย เพื่อจะได้รับการรักษาที่ทันท่วงที\n" +
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
